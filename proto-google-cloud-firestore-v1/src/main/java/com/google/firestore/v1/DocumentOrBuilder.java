// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/document.proto

package com.google.firestore.v1;

public interface DocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the document, for example
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the document, for example
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The document's fields.
   * The map keys represent field names.
   * A simple field name contains only characters `a` to `z`, `A` to `Z`,
   * `0` to `9`, or `_`, and must not start with `0` to `9`. For example,
   * `foo_bar_17`.
   * Field names matching the regular expression `__.*__` are reserved. Reserved
   * field names are forbidden except in certain documented contexts. The map
   * keys, represented as UTF-8, must not exceed 1,500 bytes and cannot be
   * empty.
   * Field paths may be used in other contexts to refer to structured fields
   * defined here. For `map_value`, the field path is represented by the simple
   * or quoted field names of the containing fields, delimited by `.`. For
   * example, the structured field
   * `"foo" : { map_value: { "x&amp;y" : { string_value: "hello" }}}` would be
   * represented by the field path `foo.x&amp;y`.
   * Within a field path, a quoted field name starts and ends with `` ` `` and
   * may contain any character. Some characters, including `` ` ``, must be
   * escaped using a `&#92;`. For example, `` `x&amp;y` `` represents `x&amp;y` and
   * `` `bak&#92;`tik` `` represents `` bak`tik ``.
   * </pre>
   *
   * <code>map&lt;string, .google.firestore.v1.Value&gt; fields = 2;</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * The document's fields.
   * The map keys represent field names.
   * A simple field name contains only characters `a` to `z`, `A` to `Z`,
   * `0` to `9`, or `_`, and must not start with `0` to `9`. For example,
   * `foo_bar_17`.
   * Field names matching the regular expression `__.*__` are reserved. Reserved
   * field names are forbidden except in certain documented contexts. The map
   * keys, represented as UTF-8, must not exceed 1,500 bytes and cannot be
   * empty.
   * Field paths may be used in other contexts to refer to structured fields
   * defined here. For `map_value`, the field path is represented by the simple
   * or quoted field names of the containing fields, delimited by `.`. For
   * example, the structured field
   * `"foo" : { map_value: { "x&amp;y" : { string_value: "hello" }}}` would be
   * represented by the field path `foo.x&amp;y`.
   * Within a field path, a quoted field name starts and ends with `` ` `` and
   * may contain any character. Some characters, including `` ` ``, must be
   * escaped using a `&#92;`. For example, `` `x&amp;y` `` represents `x&amp;y` and
   * `` `bak&#92;`tik` `` represents `` bak`tik ``.
   * </pre>
   *
   * <code>map&lt;string, .google.firestore.v1.Value&gt; fields = 2;</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.firestore.v1.Value>
  getFields();
  /**
   * <pre>
   * The document's fields.
   * The map keys represent field names.
   * A simple field name contains only characters `a` to `z`, `A` to `Z`,
   * `0` to `9`, or `_`, and must not start with `0` to `9`. For example,
   * `foo_bar_17`.
   * Field names matching the regular expression `__.*__` are reserved. Reserved
   * field names are forbidden except in certain documented contexts. The map
   * keys, represented as UTF-8, must not exceed 1,500 bytes and cannot be
   * empty.
   * Field paths may be used in other contexts to refer to structured fields
   * defined here. For `map_value`, the field path is represented by the simple
   * or quoted field names of the containing fields, delimited by `.`. For
   * example, the structured field
   * `"foo" : { map_value: { "x&amp;y" : { string_value: "hello" }}}` would be
   * represented by the field path `foo.x&amp;y`.
   * Within a field path, a quoted field name starts and ends with `` ` `` and
   * may contain any character. Some characters, including `` ` ``, must be
   * escaped using a `&#92;`. For example, `` `x&amp;y` `` represents `x&amp;y` and
   * `` `bak&#92;`tik` `` represents `` bak`tik ``.
   * </pre>
   *
   * <code>map&lt;string, .google.firestore.v1.Value&gt; fields = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.firestore.v1.Value>
  getFieldsMap();
  /**
   * <pre>
   * The document's fields.
   * The map keys represent field names.
   * A simple field name contains only characters `a` to `z`, `A` to `Z`,
   * `0` to `9`, or `_`, and must not start with `0` to `9`. For example,
   * `foo_bar_17`.
   * Field names matching the regular expression `__.*__` are reserved. Reserved
   * field names are forbidden except in certain documented contexts. The map
   * keys, represented as UTF-8, must not exceed 1,500 bytes and cannot be
   * empty.
   * Field paths may be used in other contexts to refer to structured fields
   * defined here. For `map_value`, the field path is represented by the simple
   * or quoted field names of the containing fields, delimited by `.`. For
   * example, the structured field
   * `"foo" : { map_value: { "x&amp;y" : { string_value: "hello" }}}` would be
   * represented by the field path `foo.x&amp;y`.
   * Within a field path, a quoted field name starts and ends with `` ` `` and
   * may contain any character. Some characters, including `` ` ``, must be
   * escaped using a `&#92;`. For example, `` `x&amp;y` `` represents `x&amp;y` and
   * `` `bak&#92;`tik` `` represents `` bak`tik ``.
   * </pre>
   *
   * <code>map&lt;string, .google.firestore.v1.Value&gt; fields = 2;</code>
   */

  /* nullable */
com.google.firestore.v1.Value getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.firestore.v1.Value defaultValue);
  /**
   * <pre>
   * The document's fields.
   * The map keys represent field names.
   * A simple field name contains only characters `a` to `z`, `A` to `Z`,
   * `0` to `9`, or `_`, and must not start with `0` to `9`. For example,
   * `foo_bar_17`.
   * Field names matching the regular expression `__.*__` are reserved. Reserved
   * field names are forbidden except in certain documented contexts. The map
   * keys, represented as UTF-8, must not exceed 1,500 bytes and cannot be
   * empty.
   * Field paths may be used in other contexts to refer to structured fields
   * defined here. For `map_value`, the field path is represented by the simple
   * or quoted field names of the containing fields, delimited by `.`. For
   * example, the structured field
   * `"foo" : { map_value: { "x&amp;y" : { string_value: "hello" }}}` would be
   * represented by the field path `foo.x&amp;y`.
   * Within a field path, a quoted field name starts and ends with `` ` `` and
   * may contain any character. Some characters, including `` ` ``, must be
   * escaped using a `&#92;`. For example, `` `x&amp;y` `` represents `x&amp;y` and
   * `` `bak&#92;`tik` `` represents `` bak`tik ``.
   * </pre>
   *
   * <code>map&lt;string, .google.firestore.v1.Value&gt; fields = 2;</code>
   */

  com.google.firestore.v1.Value getFieldsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. The time at which the document was created.
   * This value increases monotonically when a document is deleted then
   * recreated. It can also be compared to values from other documents and
   * the `read_time` of a query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time at which the document was created.
   * This value increases monotonically when a document is deleted then
   * recreated. It can also be compared to values from other documents and
   * the `read_time` of a query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time at which the document was created.
   * This value increases monotonically when a document is deleted then
   * recreated. It can also be compared to values from other documents and
   * the `read_time` of a query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time at which the document was last changed.
   * This value is initially set to the `create_time` then increases
   * monotonically with each change to the document. It can also be
   * compared to values from other documents and the `read_time` of a query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time at which the document was last changed.
   * This value is initially set to the `create_time` then increases
   * monotonically with each change to the document. It can also be
   * compared to values from other documents and the `read_time` of a query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time at which the document was last changed.
   * This value is initially set to the `create_time` then increases
   * monotonically with each change to the document. It can also be
   * compared to values from other documents and the `read_time` of a query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
