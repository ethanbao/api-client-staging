// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/storage.proto

package com.google.privacy.dlp.v2beta1;

public interface RecordKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.RecordKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.privacy.dlp.v2beta1.CloudStorageKey cloud_storage_key = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.CloudStorageKey getCloudStorageKey();
  /**
   * <code>.google.privacy.dlp.v2beta1.CloudStorageKey cloud_storage_key = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.CloudStorageKeyOrBuilder getCloudStorageKeyOrBuilder();

  /**
   * <code>.google.privacy.dlp.v2beta1.DatastoreKey datastore_key = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.DatastoreKey getDatastoreKey();
  /**
   * <code>.google.privacy.dlp.v2beta1.DatastoreKey datastore_key = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.DatastoreKeyOrBuilder getDatastoreKeyOrBuilder();

  public com.google.privacy.dlp.v2beta1.RecordKey.TypeCase getTypeCase();
}
