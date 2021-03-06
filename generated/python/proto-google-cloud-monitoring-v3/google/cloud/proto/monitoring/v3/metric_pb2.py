# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/proto/monitoring/v3/metric.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import metric_pb2 as google_dot_api_dot_metric__pb2
from google.api import monitored_resource_pb2 as google_dot_api_dot_monitored__resource__pb2
from google.cloud.proto.monitoring.v3 import common_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_common__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/proto/monitoring/v3/metric.proto',
  package='google.monitoring.v3',
  syntax='proto3',
  serialized_pb=_b('\n-google/cloud/proto/monitoring/v3/metric.proto\x12\x14google.monitoring.v3\x1a\x17google/api/metric.proto\x1a#google/api/monitored_resource.proto\x1a-google/cloud/proto/monitoring/v3/common.proto\"n\n\x05Point\x12\x34\n\x08interval\x18\x01 \x01(\x0b\x32\".google.monitoring.v3.TimeInterval\x12/\n\x05value\x18\x02 \x01(\x0b\x32 .google.monitoring.v3.TypedValue\"\x88\x02\n\nTimeSeries\x12\"\n\x06metric\x18\x01 \x01(\x0b\x32\x12.google.api.Metric\x12/\n\x08resource\x18\x02 \x01(\x0b\x32\x1d.google.api.MonitoredResource\x12<\n\x0bmetric_kind\x18\x03 \x01(\x0e\x32\'.google.api.MetricDescriptor.MetricKind\x12:\n\nvalue_type\x18\x04 \x01(\x0e\x32&.google.api.MetricDescriptor.ValueType\x12+\n\x06points\x18\x05 \x03(\x0b\x32\x1b.google.monitoring.v3.PointB\x86\x01\n\x18\x63om.google.monitoring.v3B\x0bMetricProtoP\x01Z>google.golang.org/genproto/googleapis/monitoring/v3;monitoring\xaa\x02\x1aGoogle.Cloud.Monitoring.V3b\x06proto3')
  ,
  dependencies=[google_dot_api_dot_metric__pb2.DESCRIPTOR,google_dot_api_dot_monitored__resource__pb2.DESCRIPTOR,google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_common__pb2.DESCRIPTOR,])
_sym_db.RegisterFileDescriptor(DESCRIPTOR)




_POINT = _descriptor.Descriptor(
  name='Point',
  full_name='google.monitoring.v3.Point',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='interval', full_name='google.monitoring.v3.Point.interval', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.monitoring.v3.Point.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=180,
  serialized_end=290,
)


_TIMESERIES = _descriptor.Descriptor(
  name='TimeSeries',
  full_name='google.monitoring.v3.TimeSeries',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='metric', full_name='google.monitoring.v3.TimeSeries.metric', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='resource', full_name='google.monitoring.v3.TimeSeries.resource', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='metric_kind', full_name='google.monitoring.v3.TimeSeries.metric_kind', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='value_type', full_name='google.monitoring.v3.TimeSeries.value_type', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='points', full_name='google.monitoring.v3.TimeSeries.points', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=293,
  serialized_end=557,
)

_POINT.fields_by_name['interval'].message_type = google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_common__pb2._TIMEINTERVAL
_POINT.fields_by_name['value'].message_type = google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_common__pb2._TYPEDVALUE
_TIMESERIES.fields_by_name['metric'].message_type = google_dot_api_dot_metric__pb2._METRIC
_TIMESERIES.fields_by_name['resource'].message_type = google_dot_api_dot_monitored__resource__pb2._MONITOREDRESOURCE
_TIMESERIES.fields_by_name['metric_kind'].enum_type = google_dot_api_dot_metric__pb2._METRICDESCRIPTOR_METRICKIND
_TIMESERIES.fields_by_name['value_type'].enum_type = google_dot_api_dot_metric__pb2._METRICDESCRIPTOR_VALUETYPE
_TIMESERIES.fields_by_name['points'].message_type = _POINT
DESCRIPTOR.message_types_by_name['Point'] = _POINT
DESCRIPTOR.message_types_by_name['TimeSeries'] = _TIMESERIES

Point = _reflection.GeneratedProtocolMessageType('Point', (_message.Message,), dict(
  DESCRIPTOR = _POINT,
  __module__ = 'google.cloud.proto.monitoring.v3.metric_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.v3.Point)
  ))
_sym_db.RegisterMessage(Point)

TimeSeries = _reflection.GeneratedProtocolMessageType('TimeSeries', (_message.Message,), dict(
  DESCRIPTOR = _TIMESERIES,
  __module__ = 'google.cloud.proto.monitoring.v3.metric_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.v3.TimeSeries)
  ))
_sym_db.RegisterMessage(TimeSeries)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n\030com.google.monitoring.v3B\013MetricProtoP\001Z>google.golang.org/genproto/googleapis/monitoring/v3;monitoring\252\002\032Google.Cloud.Monitoring.V3'))
try:
  # THESE ELEMENTS WILL BE DEPRECATED.
  # Please use the generated *_pb2_grpc.py files instead.
  import grpc
  from grpc.framework.common import cardinality
  from grpc.framework.interfaces.face import utilities as face_utilities
  from grpc.beta import implementations as beta_implementations
  from grpc.beta import interfaces as beta_interfaces
except ImportError:
  pass
# @@protoc_insertion_point(module_scope)
