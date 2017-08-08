<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2beta1/dlp.proto

namespace Google\Privacy\Dlp\V2beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Results of inspecting a list of items.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2beta1.InspectContentResponse</code>
 */
class InspectContentResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     */
    private $results;

    public function __construct() {
        \GPBMetadata\Google\Privacy\Dlp\V2Beta1\Dlp::initOnce();
        parent::__construct();
    }

    /**
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getResults()
    {
        return $this->results;
    }

    /**
     * Each content_item from the request has a result in this list, in the
     * same order as the request.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2beta1.InspectResult results = 1;</code>
     * @param \Google\Privacy\Dlp\V2beta1\InspectResult[]|\Google\Protobuf\Internal\RepeatedField $var
     */
    public function setResults(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Privacy\Dlp\V2beta1\InspectResult::class);
        $this->results = $arr;
    }

}

