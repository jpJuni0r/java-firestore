/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

package com.google.firestore.v1;

/**
 *
 *
 * <pre>
 * The request for [Firestore.BeginTransaction][google.firestore.v1.Firestore.BeginTransaction].
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.BeginTransactionRequest}
 */
public final class BeginTransactionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.BeginTransactionRequest)
    BeginTransactionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BeginTransactionRequest.newBuilder() to construct.
  private BeginTransactionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BeginTransactionRequest() {
    database_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BeginTransactionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BeginTransactionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              database_ = s;
              break;
            }
          case 18:
            {
              com.google.firestore.v1.TransactionOptions.Builder subBuilder = null;
              if (options_ != null) {
                subBuilder = options_.toBuilder();
              }
              options_ =
                  input.readMessage(
                      com.google.firestore.v1.TransactionOptions.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(options_);
                options_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.v1.FirestoreProto
        .internal_static_google_firestore_v1_BeginTransactionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.FirestoreProto
        .internal_static_google_firestore_v1_BeginTransactionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.BeginTransactionRequest.class,
            com.google.firestore.v1.BeginTransactionRequest.Builder.class);
  }

  public static final int DATABASE_FIELD_NUMBER = 1;
  private volatile java.lang.Object database_;
  /**
   *
   *
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The database.
   */
  @java.lang.Override
  public java.lang.String getDatabase() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      database_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for database.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDatabaseBytes() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      database_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private com.google.firestore.v1.TransactionOptions options_;
  /**
   *
   *
   * <pre>
   * The options for the transaction.
   * Defaults to a read-write transaction.
   * </pre>
   *
   * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
   *
   * @return Whether the options field is set.
   */
  @java.lang.Override
  public boolean hasOptions() {
    return options_ != null;
  }
  /**
   *
   *
   * <pre>
   * The options for the transaction.
   * Defaults to a read-write transaction.
   * </pre>
   *
   * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
   *
   * @return The options.
   */
  @java.lang.Override
  public com.google.firestore.v1.TransactionOptions getOptions() {
    return options_ == null
        ? com.google.firestore.v1.TransactionOptions.getDefaultInstance()
        : options_;
  }
  /**
   *
   *
   * <pre>
   * The options for the transaction.
   * Defaults to a read-write transaction.
   * </pre>
   *
   * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
   */
  @java.lang.Override
  public com.google.firestore.v1.TransactionOptionsOrBuilder getOptionsOrBuilder() {
    return getOptions();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, database_);
    }
    if (options_ != null) {
      output.writeMessage(2, getOptions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, database_);
    }
    if (options_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getOptions());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.firestore.v1.BeginTransactionRequest)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.BeginTransactionRequest other =
        (com.google.firestore.v1.BeginTransactionRequest) obj;

    if (!getDatabase().equals(other.getDatabase())) return false;
    if (hasOptions() != other.hasOptions()) return false;
    if (hasOptions()) {
      if (!getOptions().equals(other.getOptions())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabase().hashCode();
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.firestore.v1.BeginTransactionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request for [Firestore.BeginTransaction][google.firestore.v1.Firestore.BeginTransaction].
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.BeginTransactionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.BeginTransactionRequest)
      com.google.firestore.v1.BeginTransactionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.v1.FirestoreProto
          .internal_static_google_firestore_v1_BeginTransactionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.FirestoreProto
          .internal_static_google_firestore_v1_BeginTransactionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.BeginTransactionRequest.class,
              com.google.firestore.v1.BeginTransactionRequest.Builder.class);
    }

    // Construct using com.google.firestore.v1.BeginTransactionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      database_ = "";

      if (optionsBuilder_ == null) {
        options_ = null;
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.v1.FirestoreProto
          .internal_static_google_firestore_v1_BeginTransactionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.BeginTransactionRequest getDefaultInstanceForType() {
      return com.google.firestore.v1.BeginTransactionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.BeginTransactionRequest build() {
      com.google.firestore.v1.BeginTransactionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.BeginTransactionRequest buildPartial() {
      com.google.firestore.v1.BeginTransactionRequest result =
          new com.google.firestore.v1.BeginTransactionRequest(this);
      result.database_ = database_;
      if (optionsBuilder_ == null) {
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.v1.BeginTransactionRequest) {
        return mergeFrom((com.google.firestore.v1.BeginTransactionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.BeginTransactionRequest other) {
      if (other == com.google.firestore.v1.BeginTransactionRequest.getDefaultInstance())
        return this;
      if (!other.getDatabase().isEmpty()) {
        database_ = other.database_;
        onChanged();
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.firestore.v1.BeginTransactionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.firestore.v1.BeginTransactionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object database_ = "";
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The database.
     */
    public java.lang.String getDatabase() {
      java.lang.Object ref = database_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        database_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for database.
     */
    public com.google.protobuf.ByteString getDatabaseBytes() {
      java.lang.Object ref = database_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        database_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabase(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      database_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatabase() {

      database_ = getDefaultInstance().getDatabase();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The database name. In the format:
     * `projects/{project_id}/databases/{database_id}`.
     * </pre>
     *
     * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      database_ = value;
      onChanged();
      return this;
    }

    private com.google.firestore.v1.TransactionOptions options_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.v1.TransactionOptions,
            com.google.firestore.v1.TransactionOptions.Builder,
            com.google.firestore.v1.TransactionOptionsOrBuilder>
        optionsBuilder_;
    /**
     *
     *
     * <pre>
     * The options for the transaction.
     * Defaults to a read-write transaction.
     * </pre>
     *
     * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
     *
     * @return Whether the options field is set.
     */
    public boolean hasOptions() {
      return optionsBuilder_ != null || options_ != null;
    }
    /**
     *
     *
     * <pre>
     * The options for the transaction.
     * Defaults to a read-write transaction.
     * </pre>
     *
     * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
     *
     * @return The options.
     */
    public com.google.firestore.v1.TransactionOptions getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null
            ? com.google.firestore.v1.TransactionOptions.getDefaultInstance()
            : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The options for the transaction.
     * Defaults to a read-write transaction.
     * </pre>
     *
     * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
     */
    public Builder setOptions(com.google.firestore.v1.TransactionOptions value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
        onChanged();
      } else {
        optionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The options for the transaction.
     * Defaults to a read-write transaction.
     * </pre>
     *
     * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
     */
    public Builder setOptions(com.google.firestore.v1.TransactionOptions.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
        onChanged();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The options for the transaction.
     * Defaults to a read-write transaction.
     * </pre>
     *
     * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
     */
    public Builder mergeOptions(com.google.firestore.v1.TransactionOptions value) {
      if (optionsBuilder_ == null) {
        if (options_ != null) {
          options_ =
              com.google.firestore.v1.TransactionOptions.newBuilder(options_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          options_ = value;
        }
        onChanged();
      } else {
        optionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The options for the transaction.
     * Defaults to a read-write transaction.
     * </pre>
     *
     * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = null;
        onChanged();
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The options for the transaction.
     * Defaults to a read-write transaction.
     * </pre>
     *
     * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
     */
    public com.google.firestore.v1.TransactionOptions.Builder getOptionsBuilder() {

      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The options for the transaction.
     * Defaults to a read-write transaction.
     * </pre>
     *
     * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
     */
    public com.google.firestore.v1.TransactionOptionsOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null
            ? com.google.firestore.v1.TransactionOptions.getDefaultInstance()
            : options_;
      }
    }
    /**
     *
     *
     * <pre>
     * The options for the transaction.
     * Defaults to a read-write transaction.
     * </pre>
     *
     * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.v1.TransactionOptions,
            com.google.firestore.v1.TransactionOptions.Builder,
            com.google.firestore.v1.TransactionOptionsOrBuilder>
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.firestore.v1.TransactionOptions,
                com.google.firestore.v1.TransactionOptions.Builder,
                com.google.firestore.v1.TransactionOptionsOrBuilder>(
                getOptions(), getParentForChildren(), isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.firestore.v1.BeginTransactionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.BeginTransactionRequest)
  private static final com.google.firestore.v1.BeginTransactionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.BeginTransactionRequest();
  }

  public static com.google.firestore.v1.BeginTransactionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BeginTransactionRequest> PARSER =
      new com.google.protobuf.AbstractParser<BeginTransactionRequest>() {
        @java.lang.Override
        public BeginTransactionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BeginTransactionRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BeginTransactionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BeginTransactionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.BeginTransactionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
