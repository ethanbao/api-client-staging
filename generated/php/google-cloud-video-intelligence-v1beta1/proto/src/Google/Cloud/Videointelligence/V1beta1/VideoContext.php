<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

namespace Google\Cloud\Videointelligence\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Video context and/or feature-specific parameters.
 *
 * Generated from protobuf message <code>google.cloud.videointelligence.v1beta1.VideoContext</code>
 */
class VideoContext extends \Google\Protobuf\Internal\Message
{
    /**
     * Video segments to annotate. The segments may overlap and are not required
     * to be contiguous or span the whole video. If unspecified, each video
     * is treated as a single segment.
     *
     * Generated from protobuf field <code>repeated .google.cloud.videointelligence.v1beta1.VideoSegment segments = 1;</code>
     */
    private $segments;
    /**
     * If label detection has been requested, what labels should be detected
     * in addition to video-level labels or segment-level labels. If unspecified,
     * defaults to `SHOT_MODE`.
     *
     * Generated from protobuf field <code>.google.cloud.videointelligence.v1beta1.LabelDetectionMode label_detection_mode = 2;</code>
     */
    private $label_detection_mode = 0;
    /**
     * Whether the video has been shot from a stationary (i.e. non-moving) camera.
     * When set to true, might improve detection accuracy for moving objects.
     *
     * Generated from protobuf field <code>bool stationary_camera = 3;</code>
     */
    private $stationary_camera = false;
    /**
     * Model to use for label detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string label_detection_model = 4;</code>
     */
    private $label_detection_model = '';
    /**
     * Model to use for face detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string face_detection_model = 5;</code>
     */
    private $face_detection_model = '';
    /**
     * Model to use for shot change detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string shot_change_detection_model = 6;</code>
     */
    private $shot_change_detection_model = '';
    /**
     * Model to use for safe search detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string safe_search_detection_model = 7;</code>
     */
    private $safe_search_detection_model = '';

    public function __construct() {
        \GPBMetadata\Google\Cloud\Videointelligence\V1Beta1\VideoIntelligence::initOnce();
        parent::__construct();
    }

    /**
     * Video segments to annotate. The segments may overlap and are not required
     * to be contiguous or span the whole video. If unspecified, each video
     * is treated as a single segment.
     *
     * Generated from protobuf field <code>repeated .google.cloud.videointelligence.v1beta1.VideoSegment segments = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getSegments()
    {
        return $this->segments;
    }

    /**
     * Video segments to annotate. The segments may overlap and are not required
     * to be contiguous or span the whole video. If unspecified, each video
     * is treated as a single segment.
     *
     * Generated from protobuf field <code>repeated .google.cloud.videointelligence.v1beta1.VideoSegment segments = 1;</code>
     * @param \Google\Cloud\Videointelligence\V1beta1\VideoSegment[]|\Google\Protobuf\Internal\RepeatedField $var
     */
    public function setSegments(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Videointelligence\V1beta1\VideoSegment::class);
        $this->segments = $arr;
    }

    /**
     * If label detection has been requested, what labels should be detected
     * in addition to video-level labels or segment-level labels. If unspecified,
     * defaults to `SHOT_MODE`.
     *
     * Generated from protobuf field <code>.google.cloud.videointelligence.v1beta1.LabelDetectionMode label_detection_mode = 2;</code>
     * @return int
     */
    public function getLabelDetectionMode()
    {
        return $this->label_detection_mode;
    }

    /**
     * If label detection has been requested, what labels should be detected
     * in addition to video-level labels or segment-level labels. If unspecified,
     * defaults to `SHOT_MODE`.
     *
     * Generated from protobuf field <code>.google.cloud.videointelligence.v1beta1.LabelDetectionMode label_detection_mode = 2;</code>
     * @param int $var
     */
    public function setLabelDetectionMode($var)
    {
        GPBUtil::checkEnum($var, \Google\Cloud\Videointelligence\V1beta1\LabelDetectionMode::class);
        $this->label_detection_mode = $var;
    }

    /**
     * Whether the video has been shot from a stationary (i.e. non-moving) camera.
     * When set to true, might improve detection accuracy for moving objects.
     *
     * Generated from protobuf field <code>bool stationary_camera = 3;</code>
     * @return bool
     */
    public function getStationaryCamera()
    {
        return $this->stationary_camera;
    }

    /**
     * Whether the video has been shot from a stationary (i.e. non-moving) camera.
     * When set to true, might improve detection accuracy for moving objects.
     *
     * Generated from protobuf field <code>bool stationary_camera = 3;</code>
     * @param bool $var
     */
    public function setStationaryCamera($var)
    {
        GPBUtil::checkBool($var);
        $this->stationary_camera = $var;
    }

    /**
     * Model to use for label detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string label_detection_model = 4;</code>
     * @return string
     */
    public function getLabelDetectionModel()
    {
        return $this->label_detection_model;
    }

    /**
     * Model to use for label detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string label_detection_model = 4;</code>
     * @param string $var
     */
    public function setLabelDetectionModel($var)
    {
        GPBUtil::checkString($var, True);
        $this->label_detection_model = $var;
    }

    /**
     * Model to use for face detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string face_detection_model = 5;</code>
     * @return string
     */
    public function getFaceDetectionModel()
    {
        return $this->face_detection_model;
    }

    /**
     * Model to use for face detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string face_detection_model = 5;</code>
     * @param string $var
     */
    public function setFaceDetectionModel($var)
    {
        GPBUtil::checkString($var, True);
        $this->face_detection_model = $var;
    }

    /**
     * Model to use for shot change detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string shot_change_detection_model = 6;</code>
     * @return string
     */
    public function getShotChangeDetectionModel()
    {
        return $this->shot_change_detection_model;
    }

    /**
     * Model to use for shot change detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string shot_change_detection_model = 6;</code>
     * @param string $var
     */
    public function setShotChangeDetectionModel($var)
    {
        GPBUtil::checkString($var, True);
        $this->shot_change_detection_model = $var;
    }

    /**
     * Model to use for safe search detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string safe_search_detection_model = 7;</code>
     * @return string
     */
    public function getSafeSearchDetectionModel()
    {
        return $this->safe_search_detection_model;
    }

    /**
     * Model to use for safe search detection.
     * Supported values: "latest" and "stable" (the default).
     *
     * Generated from protobuf field <code>string safe_search_detection_model = 7;</code>
     * @param string $var
     */
    public function setSafeSearchDetectionModel($var)
    {
        GPBUtil::checkString($var, True);
        $this->safe_search_detection_model = $var;
    }

}
