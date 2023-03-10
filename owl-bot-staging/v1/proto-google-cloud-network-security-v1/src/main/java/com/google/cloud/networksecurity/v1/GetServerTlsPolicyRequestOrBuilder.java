// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1/server_tls_policy.proto

package com.google.cloud.networksecurity.v1;

public interface GetServerTlsPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1.GetServerTlsPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A name of the ServerTlsPolicy to get. Must be in the format
   * `projects/&#42;&#47;locations/{location}/serverTlsPolicies/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. A name of the ServerTlsPolicy to get. Must be in the format
   * `projects/&#42;&#47;locations/{location}/serverTlsPolicies/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
