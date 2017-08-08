<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2beta1/dlp.proto

namespace Google\Privacy\Dlp\V2beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Container structure describing a single finding within a string or image.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2beta1.Finding</code>
 */
class Finding extends \Google\Protobuf\Internal\Message
{
    /**
     * The specific string that may be potentially sensitive info.
     *
     * Generated from protobuf field <code>string quote = 1;</code>
     */
    private $quote = '';
    /**
     * The specific type of info the string might be.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.InfoType info_type = 2;</code>
     */
    private $info_type = null;
    /**
     * Estimate of how likely it is that the info_type is correct.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.Likelihood likelihood = 3;</code>
     */
    private $likelihood = 0;
    /**
     * Location of the info found.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.Location location = 4;</code>
     */
    private $location = null;
    /**
     * Timestamp when finding was detected.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 6;</code>
     */
    private $create_time = null;

    public function __construct() {
        \GPBMetadata\Google\Privacy\Dlp\V2Beta1\Dlp::initOnce();
        parent::__construct();
    }

    /**
     * The specific string that may be potentially sensitive info.
     *
     * Generated from protobuf field <code>string quote = 1;</code>
     * @return string
     */
    public function getQuote()
    {
        return $this->quote;
    }

    /**
     * The specific string that may be potentially sensitive info.
     *
     * Generated from protobuf field <code>string quote = 1;</code>
     * @param string $var
     */
    public function setQuote($var)
    {
        GPBUtil::checkString($var, True);
        $this->quote = $var;
    }

    /**
     * The specific type of info the string might be.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.InfoType info_type = 2;</code>
     * @return \Google\Privacy\Dlp\V2beta1\InfoType
     */
    public function getInfoType()
    {
        return $this->info_type;
    }

    /**
     * The specific type of info the string might be.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.InfoType info_type = 2;</code>
     * @param \Google\Privacy\Dlp\V2beta1\InfoType $var
     */
    public function setInfoType(&$var)
    {
        GPBUtil::checkMessage($var, \Google\Privacy\Dlp\V2beta1\InfoType::class);
        $this->info_type = $var;
    }

    /**
     * Estimate of how likely it is that the info_type is correct.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.Likelihood likelihood = 3;</code>
     * @return int
     */
    public function getLikelihood()
    {
        return $this->likelihood;
    }

    /**
     * Estimate of how likely it is that the info_type is correct.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.Likelihood likelihood = 3;</code>
     * @param int $var
     */
    public function setLikelihood($var)
    {
        GPBUtil::checkEnum($var, \Google\Privacy\Dlp\V2beta1\Likelihood::class);
        $this->likelihood = $var;
    }

    /**
     * Location of the info found.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.Location location = 4;</code>
     * @return \Google\Privacy\Dlp\V2beta1\Location
     */
    public function getLocation()
    {
        return $this->location;
    }

    /**
     * Location of the info found.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta1.Location location = 4;</code>
     * @param \Google\Privacy\Dlp\V2beta1\Location $var
     */
    public function setLocation(&$var)
    {
        GPBUtil::checkMessage($var, \Google\Privacy\Dlp\V2beta1\Location::class);
        $this->location = $var;
    }

    /**
     * Timestamp when finding was detected.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 6;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getCreateTime()
    {
        return $this->create_time;
    }

    /**
     * Timestamp when finding was detected.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 6;</code>
     * @param \Google\Protobuf\Timestamp $var
     */
    public function setCreateTime(&$var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->create_time = $var;
    }

}

