# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/monitoring/v3/agent.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
require 'google/monitoring/v3/common_pb'
require 'google/protobuf/timestamp_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "google.monitoring.v3.CollectdValue" do
    optional :data_source_name, :string, 1
    optional :data_source_type, :enum, 2, "google.monitoring.v3.CollectdValue.DataSourceType"
    optional :value, :message, 3, "google.monitoring.v3.TypedValue"
  end
  add_enum "google.monitoring.v3.CollectdValue.DataSourceType" do
    value :UNSPECIFIED_DATA_SOURCE_TYPE, 0
    value :GAUGE, 1
    value :COUNTER, 2
    value :DERIVE, 3
    value :ABSOLUTE, 4
  end
  add_message "google.monitoring.v3.CollectdPayload" do
    repeated :values, :message, 1, "google.monitoring.v3.CollectdValue"
    optional :start_time, :message, 2, "google.protobuf.Timestamp"
    optional :end_time, :message, 3, "google.protobuf.Timestamp"
    optional :plugin, :string, 4
    optional :plugin_instance, :string, 5
    optional :type, :string, 6
    optional :type_instance, :string, 7
    map :metadata, :string, :message, 8, "google.monitoring.v3.TypedValue"
  end
end

module Google
  module Monitoring
    module V3
      CollectdValue = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.monitoring.v3.CollectdValue").msgclass
      CollectdValue::DataSourceType = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.monitoring.v3.CollectdValue.DataSourceType").enummodule
      CollectdPayload = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.monitoring.v3.CollectdPayload").msgclass
    end
  end
end
