// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface IPAllocationPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.IPAllocationPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether alias IPs will be used for pod IPs in the cluster.
   * </pre>
   *
   * <code>bool use_ip_aliases = 1;</code>
   */
  boolean getUseIpAliases();

  /**
   * <pre>
   * Whether a new subnetwork will be created automatically for the cluster.
   * This field is only applicable when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>bool create_subnetwork = 2;</code>
   */
  boolean getCreateSubnetwork();

  /**
   * <pre>
   * A custom subnetwork name to be used if `create_subnetwork` is true.  If
   * this field is empty, then an automatic name will be chosen for the new
   * subnetwork.
   * </pre>
   *
   * <code>string subnetwork_name = 3;</code>
   */
  java.lang.String getSubnetworkName();
  /**
   * <pre>
   * A custom subnetwork name to be used if `create_subnetwork` is true.  If
   * this field is empty, then an automatic name will be chosen for the new
   * subnetwork.
   * </pre>
   *
   * <code>string subnetwork_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getSubnetworkNameBytes();

  /**
   * <pre>
   * This field is deprecated, use cluster_ipv4_cidr_block.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr = 4;</code>
   */
  java.lang.String getClusterIpv4Cidr();
  /**
   * <pre>
   * This field is deprecated, use cluster_ipv4_cidr_block.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr = 4;</code>
   */
  com.google.protobuf.ByteString
      getClusterIpv4CidrBytes();

  /**
   * <pre>
   * This field is deprecated, use node_ipv4_cidr_block.
   * </pre>
   *
   * <code>string node_ipv4_cidr = 5;</code>
   */
  java.lang.String getNodeIpv4Cidr();
  /**
   * <pre>
   * This field is deprecated, use node_ipv4_cidr_block.
   * </pre>
   *
   * <code>string node_ipv4_cidr = 5;</code>
   */
  com.google.protobuf.ByteString
      getNodeIpv4CidrBytes();

  /**
   * <pre>
   * This field is deprecated, use services_ipv4_cidr_block.
   * </pre>
   *
   * <code>string services_ipv4_cidr = 6;</code>
   */
  java.lang.String getServicesIpv4Cidr();
  /**
   * <pre>
   * This field is deprecated, use services_ipv4_cidr_block.
   * </pre>
   *
   * <code>string services_ipv4_cidr = 6;</code>
   */
  com.google.protobuf.ByteString
      getServicesIpv4CidrBytes();

  /**
   * <pre>
   * The name of the secondary range to be used for the cluster CIDR
   * block.  The secondary range will be used for pod IP
   * addresses. This must be an existing secondary range associated
   * with the cluster subnetwork.
   * This field is only applicable with use_ip_aliases is true and
   * create_subnetwork is false.
   * </pre>
   *
   * <code>string cluster_secondary_range_name = 7;</code>
   */
  java.lang.String getClusterSecondaryRangeName();
  /**
   * <pre>
   * The name of the secondary range to be used for the cluster CIDR
   * block.  The secondary range will be used for pod IP
   * addresses. This must be an existing secondary range associated
   * with the cluster subnetwork.
   * This field is only applicable with use_ip_aliases is true and
   * create_subnetwork is false.
   * </pre>
   *
   * <code>string cluster_secondary_range_name = 7;</code>
   */
  com.google.protobuf.ByteString
      getClusterSecondaryRangeNameBytes();

  /**
   * <pre>
   * The name of the secondary range to be used as for the services
   * CIDR block.  The secondary range will be used for service
   * ClusterIPs. This must be an existing secondary range associated
   * with the cluster subnetwork.
   * This field is only applicable with use_ip_aliases is true and
   * create_subnetwork is false.
   * </pre>
   *
   * <code>string services_secondary_range_name = 8;</code>
   */
  java.lang.String getServicesSecondaryRangeName();
  /**
   * <pre>
   * The name of the secondary range to be used as for the services
   * CIDR block.  The secondary range will be used for service
   * ClusterIPs. This must be an existing secondary range associated
   * with the cluster subnetwork.
   * This field is only applicable with use_ip_aliases is true and
   * create_subnetwork is false.
   * </pre>
   *
   * <code>string services_secondary_range_name = 8;</code>
   */
  com.google.protobuf.ByteString
      getServicesSecondaryRangeNameBytes();

  /**
   * <pre>
   * The IP address range for the cluster pod IPs. If this field is set, then
   * `cluster.cluster_ipv4_cidr` must be left blank.
   * This field is only applicable when `use_ip_aliases` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr_block = 9;</code>
   */
  java.lang.String getClusterIpv4CidrBlock();
  /**
   * <pre>
   * The IP address range for the cluster pod IPs. If this field is set, then
   * `cluster.cluster_ipv4_cidr` must be left blank.
   * This field is only applicable when `use_ip_aliases` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr_block = 9;</code>
   */
  com.google.protobuf.ByteString
      getClusterIpv4CidrBlockBytes();

  /**
   * <pre>
   * The IP address range of the instance IPs in this cluster.
   * This is applicable only if `create_subnetwork` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string node_ipv4_cidr_block = 10;</code>
   */
  java.lang.String getNodeIpv4CidrBlock();
  /**
   * <pre>
   * The IP address range of the instance IPs in this cluster.
   * This is applicable only if `create_subnetwork` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string node_ipv4_cidr_block = 10;</code>
   */
  com.google.protobuf.ByteString
      getNodeIpv4CidrBlockBytes();

  /**
   * <pre>
   * The IP address range of the services IPs in this cluster. If blank, a range
   * will be automatically chosen with the default size.
   * This field is only applicable when `use_ip_aliases` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string services_ipv4_cidr_block = 11;</code>
   */
  java.lang.String getServicesIpv4CidrBlock();
  /**
   * <pre>
   * The IP address range of the services IPs in this cluster. If blank, a range
   * will be automatically chosen with the default size.
   * This field is only applicable when `use_ip_aliases` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string services_ipv4_cidr_block = 11;</code>
   */
  com.google.protobuf.ByteString
      getServicesIpv4CidrBlockBytes();
}
