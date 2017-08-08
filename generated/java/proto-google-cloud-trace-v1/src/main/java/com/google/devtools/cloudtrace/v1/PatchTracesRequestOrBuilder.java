// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

public interface PatchTracesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.PatchTracesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The body of the message.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.Traces traces = 2;</code>
   */
  boolean hasTraces();
  /**
   * <pre>
   * The body of the message.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.Traces traces = 2;</code>
   */
  com.google.devtools.cloudtrace.v1.Traces getTraces();
  /**
   * <pre>
   * The body of the message.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.Traces traces = 2;</code>
   */
  com.google.devtools.cloudtrace.v1.TracesOrBuilder getTracesOrBuilder();
}
