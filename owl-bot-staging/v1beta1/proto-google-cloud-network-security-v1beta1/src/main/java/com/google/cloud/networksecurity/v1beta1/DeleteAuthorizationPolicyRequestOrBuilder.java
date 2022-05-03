// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1beta1/authorization_policy.proto

package com.google.cloud.networksecurity.v1beta1;

public interface DeleteAuthorizationPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1beta1.DeleteAuthorizationPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A name of the AuthorizationPolicy to delete. Must be in the format
   * `projects/{project}/locations/{location}/authorizationPolicies/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. A name of the AuthorizationPolicy to delete. Must be in the format
   * `projects/{project}/locations/{location}/authorizationPolicies/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
