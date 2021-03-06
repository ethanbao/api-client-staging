<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/v1/spanner.proto

namespace Google\Spanner\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The request for [CreateSession][google.spanner.v1.Spanner.CreateSession].
 *
 * Generated from protobuf message <code>google.spanner.v1.CreateSessionRequest</code>
 */
class CreateSessionRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The database in which the new session is created.
     *
     * Generated from protobuf field <code>string database = 1;</code>
     */
    private $database = '';

    public function __construct() {
        \GPBMetadata\Google\Spanner\V1\Spanner::initOnce();
        parent::__construct();
    }

    /**
     * Required. The database in which the new session is created.
     *
     * Generated from protobuf field <code>string database = 1;</code>
     * @return string
     */
    public function getDatabase()
    {
        return $this->database;
    }

    /**
     * Required. The database in which the new session is created.
     *
     * Generated from protobuf field <code>string database = 1;</code>
     * @param string $var
     */
    public function setDatabase($var)
    {
        GPBUtil::checkString($var, True);
        $this->database = $var;
    }

}

