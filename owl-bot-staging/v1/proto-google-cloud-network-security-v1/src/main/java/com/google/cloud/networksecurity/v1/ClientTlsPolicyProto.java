// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1/client_tls_policy.proto

package com.google.cloud.networksecurity.v1;

public final class ClientTlsPolicyProto {
  private ClientTlsPolicyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_GetClientTlsPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_GetClientTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_UpdateClientTlsPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_UpdateClientTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1_DeleteClientTlsPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1_DeleteClientTlsPolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/networksecurity/v1/client" +
      "_tls_policy.proto\022\037google.cloud.networks" +
      "ecurity.v1\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\032)google/c" +
      "loud/networksecurity/v1/tls.proto\032 googl" +
      "e/protobuf/field_mask.proto\032\037google/prot" +
      "obuf/timestamp.proto\"\354\004\n\017ClientTlsPolicy" +
      "\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\030\n\013description\030\002 \001(\t" +
      "B\003\340A\001\0224\n\013create_time\030\003 \001(\0132\032.google.prot" +
      "obuf.TimestampB\003\340A\003\0224\n\013update_time\030\004 \001(\013" +
      "2\032.google.protobuf.TimestampB\003\340A\003\022Q\n\006lab" +
      "els\030\005 \003(\0132<.google.cloud.networksecurity" +
      ".v1.ClientTlsPolicy.LabelsEntryB\003\340A\001\022\020\n\003" +
      "sni\030\006 \001(\tB\003\340A\001\022U\n\022client_certificate\030\007 \001" +
      "(\01324.google.cloud.networksecurity.v1.Cer" +
      "tificateProviderB\003\340A\001\022P\n\024server_validati" +
      "on_ca\030\010 \003(\0132-.google.cloud.networksecuri" +
      "ty.v1.ValidationCAB\003\340A\001\032-\n\013LabelsEntry\022\013" +
      "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\202\001\352A\177\n.ne" +
      "tworksecurity.googleapis.com/ClientTlsPo" +
      "licy\022Mprojects/{project}/locations/{loca" +
      "tion}/clientTlsPolicies/{client_tls_poli" +
      "cy}\"\200\001\n\034ListClientTlsPoliciesRequest\0229\n\006" +
      "parent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleap" +
      "is.com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npa" +
      "ge_token\030\003 \001(\t\"\207\001\n\035ListClientTlsPolicies" +
      "Response\022M\n\023client_tls_policies\030\001 \003(\01320." +
      "google.cloud.networksecurity.v1.ClientTl" +
      "sPolicy\022\027\n\017next_page_token\030\002 \001(\t\"a\n\031GetC" +
      "lientTlsPolicyRequest\022D\n\004name\030\001 \001(\tB6\340A\002" +
      "\372A0\n.networksecurity.googleapis.com/Clie" +
      "ntTlsPolicy\"\333\001\n\034CreateClientTlsPolicyReq" +
      "uest\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0\022.networksec" +
      "urity.googleapis.com/ClientTlsPolicy\022!\n\024" +
      "client_tls_policy_id\030\002 \001(\tB\003\340A\002\022P\n\021clien" +
      "t_tls_policy\030\003 \001(\01320.google.cloud.networ" +
      "ksecurity.v1.ClientTlsPolicyB\003\340A\002\"\246\001\n\034Up" +
      "dateClientTlsPolicyRequest\0224\n\013update_mas" +
      "k\030\001 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001" +
      "\022P\n\021client_tls_policy\030\002 \001(\01320.google.clo" +
      "ud.networksecurity.v1.ClientTlsPolicyB\003\340" +
      "A\002\"d\n\034DeleteClientTlsPolicyRequest\022D\n\004na" +
      "me\030\001 \001(\tB6\340A\002\372A0\n.networksecurity.google" +
      "apis.com/ClientTlsPolicyB\366\001\n#com.google." +
      "cloud.networksecurity.v1B\024ClientTlsPolic" +
      "yProtoP\001ZNgoogle.golang.org/genproto/goo" +
      "gleapis/cloud/networksecurity/v1;network" +
      "security\252\002\037Google.Cloud.NetworkSecurity." +
      "V1\312\002\037Google\\Cloud\\NetworkSecurity\\V1\352\002\"G" +
      "oogle::Cloud::NetworkSecurity::V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.networksecurity.v1.TlsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_descriptor,
        new java.lang.String[] { "Name", "Description", "CreateTime", "UpdateTime", "Labels", "Sni", "ClientCertificate", "ServerValidationCa", });
    internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_LabelsEntry_descriptor =
      internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_ClientTlsPolicy_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_ListClientTlsPoliciesResponse_descriptor,
        new java.lang.String[] { "ClientTlsPolicies", "NextPageToken", });
    internal_static_google_cloud_networksecurity_v1_GetClientTlsPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networksecurity_v1_GetClientTlsPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_GetClientTlsPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_CreateClientTlsPolicyRequest_descriptor,
        new java.lang.String[] { "Parent", "ClientTlsPolicyId", "ClientTlsPolicy", });
    internal_static_google_cloud_networksecurity_v1_UpdateClientTlsPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networksecurity_v1_UpdateClientTlsPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_UpdateClientTlsPolicyRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "ClientTlsPolicy", });
    internal_static_google_cloud_networksecurity_v1_DeleteClientTlsPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networksecurity_v1_DeleteClientTlsPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1_DeleteClientTlsPolicyRequest_descriptor,
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
    com.google.cloud.networksecurity.v1.TlsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
