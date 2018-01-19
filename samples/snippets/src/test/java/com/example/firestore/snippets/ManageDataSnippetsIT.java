/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.firestore.snippets;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.firestore.BaseIntegrationTest;
import com.example.firestore.snippets.model.City;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class ManageDataSnippetsIT extends BaseIntegrationTest {

  private static ManageDataSnippets manageDataSnippets;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    manageDataSnippets = new ManageDataSnippets(db);
  }

  @Test
  public void testAddDatasMap() throws Exception {
    Map<String, Object> expectedData = manageDataSnippets.addSimpleDocumentAsMap();
    DocumentReference docRef = db.collection("cities").document("LA");
    assertTrue(Objects.equals(expectedData, getDocumentDataAsMap(docRef)));
  }

  @Test
  public void testAddDataWithDifferentDataTypes() throws Exception {
    Map<String, Object> expectedData = manageDataSnippets.addDocumentWithDifferentDataTypes();
    DocumentReference docRef = db.collection("data").document("one");
    assertEquals(expectedData, getDocumentDataAsMap(docRef));
  }

  @Test
  public void testAddDataAsEntity() throws Exception {
    City city = manageDataSnippets.addSimpleDocumentAsEntity();
    DocumentReference docRef = db.collection("cities").document("LA");
    assertTrue(Objects.equals(city, getDocumentDataAsCity(docRef)));
  }

  @Test
  public void testAddDocWithAutoGenId() throws Exception {
    String autoId = manageDataSnippets.addDocumentDataWithAutoGeneratedId();
    City city = new City("Tokyo");
    city.setCountry("Japan");
    DocumentReference docRef = db.collection("cities").document(autoId);
    assertTrue(Objects.equals(city, getDocumentDataAsCity(docRef)));
  }

  @Test
  public void testAddDocAfterAutoGenId() throws Exception {
    String autoId = manageDataSnippets.addDocumentDataAfterAutoGeneratingId();
    City city = new City();
    DocumentReference docRef = db.collection("cities").document(autoId);
    assertTrue(Objects.equals(city, getDocumentDataAsCity(docRef)));
  }

  @Test
  public void testUpdateSimpleDocument() throws Exception {
    manageDataSnippets.updateSimpleDocument();
    DocumentReference docRef = db.collection("cities").document("DC");
    City city = new City("Washington D.C.");
    city.setCapital(true);
    assertTrue(Objects.equals(city, getDocumentDataAsCity(docRef)));
  }

  @Test
  public void testUpdateUsingMap() throws Exception {
    manageDataSnippets.updateUsingMap();
    DocumentReference docRef = db.collection("cities").document("DC");
    City city = new City("Washington D.C.");
    city.setCapital(true);
    city.setCountry("USA");
    assertTrue(Objects.equals(city, getDocumentDataAsCity(docRef)));
  }

  @Test
  public void testUpdateAndCreateIfMissing() throws Exception {
    manageDataSnippets.updateAndCreateIfMissing();
    DocumentReference docRef = db.collection("cities").document("BJ");
    assertTrue(getDocumentDataAsCity(docRef).getCapital());
  }

  @Test
  public void testUpdateNestedFields() throws Exception {
    manageDataSnippets.updateNestedFields();
    DocumentReference docRef = db.collection("users").document("frank");

    DocumentSnapshot snapshot = getDocumentData(docRef);
    assertEquals((long) snapshot.getLong("age"), 13);
    assertEquals(snapshot.getString("favorites.color"), "Red");
    assertEquals(snapshot.getString("favorites.food"), "Pizza");
  }

  @Test
  public void testUpdateServerTimestamp() throws Exception {
    manageDataSnippets.updateServerTimestamp();
    DocumentReference docRef = db.collection("objects").document("some-id");
    Map<String, Object> data = getDocumentDataAsMap(docRef);
    assertTrue(data.get("timestamp") instanceof Date);
  }

  @Test
  public void testDeleteFields() throws Exception {
    manageDataSnippets.deleteFields();
    DocumentReference docRef = db.collection("cities").document("BJ");
    Map<String, Object> data = getDocumentDataAsMap(docRef);
    assertFalse(data.containsKey("capital"));
  }

  @Test(expected = Exception.class)
  public void testDeleteDocument() throws Exception {
    manageDataSnippets.deleteDocument();
    getDocumentDataAsMap(db.collection("cities").document("DC"));
  }

  @Test
  public void testSimpleTransaction() throws Exception {
    DocumentReference docRef = db.collection("cities").document("SF");
    ApiFuture<Void> future = manageDataSnippets.runSimpleTransaction();
    future.get();
    Map<String, Object> data = getDocumentDataAsMap(docRef);
    assertEquals(data.get("population"), 860000L + 1L);
  }

  @Test
  public void testTransactionReturnsInfo() throws Exception {
    String info = manageDataSnippets.returnInfoFromTransaction(50L);
    assertEquals(info, "Population increased to 51");
    try {
      info = manageDataSnippets.returnInfoFromTransaction(5000001L);
      assertTrue("returnInfoFromTransaction should have failed,"
          + " instead returned info: " + info, false);
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Sorry! Population is too big."));
    }
  }

  @Test
  public void testWriteBatchIsSuccessful() throws Exception {
    manageDataSnippets.writeBatch();
    CollectionReference collection = db.collection("cities");
    ApiFuture<DocumentSnapshot> document = collection.document("NYC").get();
    assertTrue(document.get().exists());
    DocumentReference documentReference = collection.document("SF");
    Map<String, Object> data = getDocumentDataAsMap(documentReference);
    assertTrue(data.containsKey("population"));
    document = collection.document("LA").get();
    assertFalse(document.get().exists());
  }

  @AfterClass
  public static void tearDown() throws Exception {
    manageDataSnippets.deleteCollection(db.collection("cities"), 10);
    manageDataSnippets.deleteCollection(db.collection("users"), 10);
  }
}
