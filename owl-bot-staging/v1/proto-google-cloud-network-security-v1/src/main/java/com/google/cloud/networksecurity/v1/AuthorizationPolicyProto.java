// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1/authorization_policy.proto

package com.google.cloud.networksecurity.v1;

public final class AuthorizationPolicyProto {
  private AuthorizationPolicyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Source_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Source_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_GetAuthorizationPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_GetAuthorizationPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_CreateAuthorizationPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_CreateAuthorizationPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_UpdateAuthorizationPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_UpdateAuthorizationPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_DeleteAuthorizationPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_DeleteAuthorizationPolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/networksecurity/v1/author" +
      "ization_policy.proto\022\037google.cloud.netwo" +
      "rksecurity.v1\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032 googl" +
      "e/protobuf/field_mask.proto\032\037google/prot" +
      "obuf/timestamp.proto\"\261\t\n\023AuthorizationPo" +
      "licy\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\030\n\013description\030\002" +
      " \001(\tB\003\340A\001\0224\n\013create_time\030\003 \001(\0132\032.google." +
      "protobuf.TimestampB\003\340A\003\0224\n\013update_time\030\004" +
      " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022U\n" +
      "\006labels\030\005 \003(\0132@.google.cloud.networksecu" +
      "rity.v1.AuthorizationPolicy.LabelsEntryB" +
      "\003\340A\001\022P\n\006action\030\006 \001(\0162;.google.cloud.netw" +
      "orksecurity.v1.AuthorizationPolicy.Actio" +
      "nB\003\340A\002\022M\n\005rules\030\007 \003(\01329.google.cloud.net" +
      "worksecurity.v1.AuthorizationPolicy.Rule" +
      "B\003\340A\001\032\221\004\n\004Rule\022V\n\007sources\030\001 \003(\0132@.google" +
      ".cloud.networksecurity.v1.AuthorizationP" +
      "olicy.Rule.SourceB\003\340A\001\022`\n\014destinations\030\002" +
      " \003(\0132E.google.cloud.networksecurity.v1.A" +
      "uthorizationPolicy.Rule.DestinationB\003\340A\001" +
      "\0329\n\006Source\022\027\n\nprincipals\030\001 \003(\tB\003\340A\001\022\026\n\ti" +
      "p_blocks\030\002 \003(\tB\003\340A\001\032\223\002\n\013Destination\022\022\n\005h" +
      "osts\030\001 \003(\tB\003\340A\002\022\022\n\005ports\030\002 \003(\rB\003\340A\002\022\024\n\007m" +
      "ethods\030\004 \003(\tB\003\340A\001\022u\n\021http_header_match\030\005" +
      " \001(\0132U.google.cloud.networksecurity.v1.A" +
      "uthorizationPolicy.Rule.Destination.Http" +
      "HeaderMatchB\003\340A\001\032O\n\017HttpHeaderMatch\022\032\n\013r" +
      "egex_match\030\002 \001(\tB\003\340A\002H\000\022\030\n\013header_name\030\001" +
      " \001(\tB\003\340A\002B\006\n\004type\032-\n\013LabelsEntry\022\013\n\003key\030" +
      "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"5\n\006Action\022\026\n\022AC" +
      "TION_UNSPECIFIED\020\000\022\t\n\005ALLOW\020\001\022\010\n\004DENY\020\002:" +
      "\216\001\352A\212\001\n2networksecurity.googleapis.com/A" +
      "uthorizationPolicy\022Tprojects/{project}/l" +
      "ocations/{location}/authorizationPolicie" +
      "s/{authorization_policy}\"\204\001\n ListAuthori" +
      "zationPoliciesRequest\0229\n\006parent\030\001 \001(\tB)\340" +
      "A\002\372A#\n!locations.googleapis.com/Location" +
      "\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"" +
      "\222\001\n!ListAuthorizationPoliciesResponse\022T\n" +
      "\026authorization_policies\030\001 \003(\01324.google.c" +
      "loud.networksecurity.v1.AuthorizationPol" +
      "icy\022\027\n\017next_page_token\030\002 \001(\t\"i\n\035GetAutho" +
      "rizationPolicyRequest\022H\n\004name\030\001 \001(\tB:\340A\002" +
      "\372A4\n2networksecurity.googleapis.com/Auth" +
      "orizationPolicy\"\355\001\n CreateAuthorizationP" +
      "olicyRequest\022J\n\006parent\030\001 \001(\tB:\340A\002\372A4\0222ne" +
      "tworksecurity.googleapis.com/Authorizati" +
      "onPolicy\022$\n\027authorization_policy_id\030\002 \001(" +
      "\tB\003\340A\002\022W\n\024authorization_policy\030\003 \001(\01324.g" +
      "oogle.cloud.networksecurity.v1.Authoriza" +
      "tionPolicyB\003\340A\002\"\261\001\n UpdateAuthorizationP" +
      "olicyRequest\0224\n\013update_mask\030\001 \001(\0132\032.goog" +
      "le.protobuf.FieldMaskB\003\340A\001\022W\n\024authorizat" +
      "ion_policy\030\002 \001(\01324.google.cloud.networks" +
      "ecurity.v1.AuthorizationPolicyB\003\340A\002\"l\n D" +
      "eleteAuthorizationPolicyRequest\022H\n\004name\030" +
      "\001 \001(\tB:\340A\002\372A4\n2networksecurity.googleapi" +
      "s.com/AuthorizationPolicyB\371\001\n#com.google" +
      ".cloud.networksecurity.v1B\030Authorization" +
      "PolicyProtoP\001ZMcloud.google.com/go/netwo" +
      "rksecurity/apiv1/networksecuritypb;netwo" +
      "rksecuritypb\252\002\037Google.Cloud.NetworkSecur" +
      "ity.V1\312\002\037Google\\Cloud\\NetworkSecurity\\V1" +
      "\352\002\"Google::Cloud::NetworkSecurity::V1b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_descriptor,
        new java.lang.String[] { "Name", "Description", "CreateTime", "UpdateTime", "Labels", "Action", "Rules", });
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_descriptor =
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_descriptor,
        new java.lang.String[] { "Sources", "Destinations", });
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Source_descriptor =
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Source_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Source_descriptor,
        new java.lang.String[] { "Principals", "IpBlocks", });
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_descriptor =
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_descriptor,
        new java.lang.String[] { "Hosts", "Ports", "Methods", "HttpHeaderMatch", });
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_descriptor =
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_descriptor,
        new java.lang.String[] { "RegexMatch", "HeaderName", "Type", });
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_LabelsEntry_descriptor =
      internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_AuthorizationPolicy_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_ListAuthorizationPoliciesResponse_descriptor,
        new java.lang.String[] { "AuthorizationPolicies", "NextPageToken", });
    internal_static_google_cloud_networksecurity_v1_GetAuthorizationPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networksecurity_v1_GetAuthorizationPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_GetAuthorizationPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networksecurity_v1_CreateAuthorizationPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networksecurity_v1_CreateAuthorizationPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_CreateAuthorizationPolicyRequest_descriptor,
        new java.lang.String[] { "Parent", "AuthorizationPolicyId", "AuthorizationPolicy", });
    internal_static_google_cloud_networksecurity_v1_UpdateAuthorizationPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networksecurity_v1_UpdateAuthorizationPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_UpdateAuthorizationPolicyRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "AuthorizationPolicy", });
    internal_static_google_cloud_networksecurity_v1_DeleteAuthorizationPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networksecurity_v1_DeleteAuthorizationPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_DeleteAuthorizationPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
