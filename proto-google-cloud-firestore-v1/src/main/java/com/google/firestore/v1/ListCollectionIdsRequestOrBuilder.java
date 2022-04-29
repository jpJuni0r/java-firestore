// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

package com.google.firestore.v1;

public interface ListCollectionIdsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.ListCollectionIdsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent document. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * For example:
   * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent document. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * For example:
   * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token. Must be a value from
   * [ListCollectionIdsResponse][google.firestore.v1.ListCollectionIdsResponse].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token. Must be a value from
   * [ListCollectionIdsResponse][google.firestore.v1.ListCollectionIdsResponse].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
