<?php
/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * GENERATED CODE WARNING
 * This file was automatically generated - do not edit!
 */

namespace Google\Cloud\Tests\PubSub\V1;

use Google\Cloud\PubSub\V1\SubscriberClient;
use Google\GAX\ApiException;
use Google\GAX\BidiStream;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\Testing\GeneratedTest;
use Google\Iam\V1\Policy;
use Google\Iam\V1\TestIamPermissionsResponse;
use Google\Protobuf\Any;
use Google\Protobuf\FieldMask;
use Google\Protobuf\GPBEmpty;
use Google\Pubsub\V1\ListSnapshotsResponse;
use Google\Pubsub\V1\ListSubscriptionsResponse;
use Google\Pubsub\V1\PullResponse;
use Google\Pubsub\V1\PushConfig;
use Google\Pubsub\V1\ReceivedMessage;
use Google\Pubsub\V1\SeekResponse;
use Google\Pubsub\V1\Snapshot;
use Google\Pubsub\V1\StreamingPullRequest;
use Google\Pubsub\V1\StreamingPullResponse;
use Google\Pubsub\V1\Subscription;
use Grpc;
use stdClass;

/**
 * @group pub_sub
 * @group grpc
 */
class SubscriberClientTest extends GeneratedTest
{
    public function createMockSubscriberImpl($hostname, $opts)
    {
        return new MockSubscriberImpl($hostname, $opts);
    }

    public function createMockIAMPolicyImpl($hostname, $opts)
    {
        return new MockIAMPolicyImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            SubscriberClient::SERVICE_ADDRESS,
            SubscriberClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return SubscriberClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new SubscriberClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function createSubscriptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $topic2 = 'topic2-1139259102';
        $ackDeadlineSeconds = 2135351438;
        $retainAckedMessages = false;
        $expectedResponse = new Subscription();
        $expectedResponse->setName($name2);
        $expectedResponse->setTopic($topic2);
        $expectedResponse->setAckDeadlineSeconds($ackDeadlineSeconds);
        $expectedResponse->setRetainAckedMessages($retainAckedMessages);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $formattedTopic = SubscriberClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->createSubscription($formattedName, $formattedTopic);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/CreateSubscription', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSubscriptionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $formattedTopic = SubscriberClient::formatTopicName('[PROJECT]', '[TOPIC]');

        try {
            $client->createSubscription($formattedName, $formattedTopic);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSubscriptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $topic = 'topic110546223';
        $ackDeadlineSeconds = 2135351438;
        $retainAckedMessages = false;
        $expectedResponse = new Subscription();
        $expectedResponse->setName($name);
        $expectedResponse->setTopic($topic);
        $expectedResponse->setAckDeadlineSeconds($ackDeadlineSeconds);
        $expectedResponse->setRetainAckedMessages($retainAckedMessages);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $response = $client->getSubscription($formattedSubscription);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/GetSubscription', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSubscriptionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->getSubscription($formattedSubscription);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateSubscriptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $topic = 'topic110546223';
        $ackDeadlineSeconds = 2135351438;
        $retainAckedMessages = false;
        $expectedResponse = new Subscription();
        $expectedResponse->setName($name);
        $expectedResponse->setTopic($topic);
        $expectedResponse->setAckDeadlineSeconds($ackDeadlineSeconds);
        $expectedResponse->setRetainAckedMessages($retainAckedMessages);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $subscription = new Subscription();
        $updateMask = new FieldMask();

        $response = $client->updateSubscription($subscription, $updateMask);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/UpdateSubscription', $actualFuncCall);

        $this->assertEquals($subscription, $actualRequestObject->getSubscription());
        $this->assertEquals($updateMask, $actualRequestObject->getUpdateMask());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateSubscriptionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $subscription = new Subscription();
        $updateMask = new FieldMask();

        try {
            $client->updateSubscription($subscription, $updateMask);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSubscriptionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $subscriptionsElement = new Subscription();
        $subscriptions = [$subscriptionsElement];
        $expectedResponse = new ListSubscriptionsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setSubscriptions($subscriptions);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProject = SubscriberClient::formatProjectName('[PROJECT]');

        $response = $client->listSubscriptions($formattedProject);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSubscriptions()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/ListSubscriptions', $actualFuncCall);

        $this->assertEquals($formattedProject, $actualRequestObject->getProject());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSubscriptionsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedProject = SubscriberClient::formatProjectName('[PROJECT]');

        try {
            $client->listSubscriptions($formattedProject);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSubscriptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $client->deleteSubscription($formattedSubscription);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/DeleteSubscription', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSubscriptionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->deleteSubscription($formattedSubscription);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyAckDeadlineTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];
        $ackDeadlineSeconds = 2135351438;

        $client->modifyAckDeadline($formattedSubscription, $ackIds, $ackDeadlineSeconds);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/ModifyAckDeadline', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertRepeatedFieldEquals($ackIds, $actualRequestObject->getAckIds());
        $this->assertEquals($ackDeadlineSeconds, $actualRequestObject->getAckDeadlineSeconds());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyAckDeadlineExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];
        $ackDeadlineSeconds = 2135351438;

        try {
            $client->modifyAckDeadline($formattedSubscription, $ackIds, $ackDeadlineSeconds);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function acknowledgeTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];

        $client->acknowledge($formattedSubscription, $ackIds);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/Acknowledge', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertRepeatedFieldEquals($ackIds, $actualRequestObject->getAckIds());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function acknowledgeExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];

        try {
            $client->acknowledge($formattedSubscription, $ackIds);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function pullTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new PullResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $maxMessages = 496131527;

        $response = $client->pull($formattedSubscription, $maxMessages);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/Pull', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($maxMessages, $actualRequestObject->getMaxMessages());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function pullExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $maxMessages = 496131527;

        try {
            $client->pull($formattedSubscription, $maxMessages);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function streamingPullTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $receivedMessagesElement = new ReceivedMessage();
        $receivedMessages = [$receivedMessagesElement];
        $expectedResponse = new StreamingPullResponse();
        $expectedResponse->setReceivedMessages($receivedMessages);
        $grpcStub->addResponse($expectedResponse);
        $receivedMessagesElement2 = new ReceivedMessage();
        $receivedMessages2 = [$receivedMessagesElement2];
        $expectedResponse2 = new StreamingPullResponse();
        $expectedResponse2->setReceivedMessages($receivedMessages2);
        $grpcStub->addResponse($expectedResponse2);
        $receivedMessagesElement3 = new ReceivedMessage();
        $receivedMessages3 = [$receivedMessagesElement3];
        $expectedResponse3 = new StreamingPullResponse();
        $expectedResponse3->setReceivedMessages($receivedMessages3);
        $grpcStub->addResponse($expectedResponse3);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $streamAckDeadlineSeconds = 1875467245;
        $request = new StreamingPullRequest();
        $request->setSubscription($formattedSubscription);
        $request->setStreamAckDeadlineSeconds($streamAckDeadlineSeconds);
        $formattedSubscription2 = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $streamAckDeadlineSeconds2 = -1562238880;
        $request2 = new StreamingPullRequest();
        $request2->setSubscription($formattedSubscription2);
        $request2->setStreamAckDeadlineSeconds($streamAckDeadlineSeconds2);
        $formattedSubscription3 = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $streamAckDeadlineSeconds3 = -1562238879;
        $request3 = new StreamingPullRequest();
        $request3->setSubscription($formattedSubscription3);
        $request3->setStreamAckDeadlineSeconds($streamAckDeadlineSeconds3);

        $bidi = $client->streamingPull();
        $this->assertInstanceOf(BidiStream::class, $bidi);

        $bidi->write($request);
        $responses = [];
        $responses[] = $bidi->read();

        $bidi->writeAll([$request2, $request3]);
        foreach ($bidi->closeWriteAndReadAll() as $response) {
            $responses[] = $response;
        }

        $expectedResources = [];
        $expectedResources[] = $expectedResponse->getReceivedMessages()[0];
        $expectedResources[] = $expectedResponse2->getReceivedMessages()[0];
        $expectedResources[] = $expectedResponse3->getReceivedMessages()[0];
        $this->assertEquals($expectedResources, $responses);

        $createStreamRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($createStreamRequests));
        $streamFuncCall = $createStreamRequests[0]->getFuncCall();
        $streamRequestObject = $createStreamRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/StreamingPull', $streamFuncCall);
        $this->assertNull($streamRequestObject);

        $callObjects = $grpcStub->popCallObjects();
        $this->assertSame(1, count($callObjects));
        $bidiCall = $callObjects[0];

        $writeRequests = $bidiCall->popReceivedCalls();
        $expectedRequests = [];
        $expectedRequests[] = $request;
        $expectedRequests[] = $request2;
        $expectedRequests[] = $request3;
        $this->assertEquals($expectedRequests, $writeRequests);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function streamingPullExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);

        $grpcStub->setStreamingStatus($status);

        $this->assertTrue($grpcStub->isExhausted());

        $bidi = $client->streamingPull();
        $results = $bidi->closeWriteAndReadAll();

        try {
            iterator_to_array($results);
            // If the close stream method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyPushConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $pushConfig = new PushConfig();

        $client->modifyPushConfig($formattedSubscription, $pushConfig);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/ModifyPushConfig', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($pushConfig, $actualRequestObject->getPushConfig());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyPushConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $pushConfig = new PushConfig();

        try {
            $client->modifyPushConfig($formattedSubscription, $pushConfig);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSnapshotsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $snapshotsElement = new Snapshot();
        $snapshots = [$snapshotsElement];
        $expectedResponse = new ListSnapshotsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setSnapshots($snapshots);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProject = SubscriberClient::formatProjectName('[PROJECT]');

        $response = $client->listSnapshots($formattedProject);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSnapshots()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/ListSnapshots', $actualFuncCall);

        $this->assertEquals($formattedProject, $actualRequestObject->getProject());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSnapshotsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedProject = SubscriberClient::formatProjectName('[PROJECT]');

        try {
            $client->listSnapshots($formattedProject);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSnapshotTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $topic = 'topic110546223';
        $expectedResponse = new Snapshot();
        $expectedResponse->setName($name2);
        $expectedResponse->setTopic($topic);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = SubscriberClient::formatSnapshotName('[PROJECT]', '[SNAPSHOT]');
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $response = $client->createSnapshot($formattedName, $formattedSubscription);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/CreateSnapshot', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSnapshotExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = SubscriberClient::formatSnapshotName('[PROJECT]', '[SNAPSHOT]');
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->createSnapshot($formattedName, $formattedSubscription);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSnapshotTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSnapshot = SubscriberClient::formatSnapshotName('[PROJECT]', '[SNAPSHOT]');

        $client->deleteSnapshot($formattedSnapshot);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/DeleteSnapshot', $actualFuncCall);

        $this->assertEquals($formattedSnapshot, $actualRequestObject->getSnapshot());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSnapshotExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSnapshot = SubscriberClient::formatSnapshotName('[PROJECT]', '[SNAPSHOT]');

        try {
            $client->deleteSnapshot($formattedSnapshot);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function seekTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new SeekResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $response = $client->seek($formattedSubscription);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/Seek', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function seekExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->seek($formattedSubscription);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setIamPolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $version = 351608024;
        $etag = '21';
        $expectedResponse = new Policy();
        $expectedResponse->setVersion($version);
        $expectedResponse->setEtag($etag);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $policy = new Policy();

        $response = $client->setIamPolicy($formattedResource, $policy);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.iam.v1.IAMPolicy/SetIamPolicy', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertEquals($policy, $actualRequestObject->getPolicy());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setIamPolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $policy = new Policy();

        try {
            $client->setIamPolicy($formattedResource, $policy);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getIamPolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $version = 351608024;
        $etag = '21';
        $expectedResponse = new Policy();
        $expectedResponse->setVersion($version);
        $expectedResponse->setEtag($etag);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $response = $client->getIamPolicy($formattedResource);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.iam.v1.IAMPolicy/GetIamPolicy', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getIamPolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->getIamPolicy($formattedResource);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function testIamPermissionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new TestIamPermissionsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $permissions = [];

        $response = $client->testIamPermissions($formattedResource, $permissions);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.iam.v1.IAMPolicy/TestIamPermissions', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertRepeatedFieldEquals($permissions, $actualRequestObject->getPermissions());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function testIamPermissionsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $permissions = [];

        try {
            $client->testIamPermissions($formattedResource, $permissions);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }
}
