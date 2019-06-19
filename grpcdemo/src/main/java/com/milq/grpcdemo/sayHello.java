package com.milq.grpcdemo;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class sayHello extends greeterGrpc.greeterImplBase{
    @Override
    public void sayHi(hiRequest request, StreamObserver<hiReply> responseObserver) {
        hiReply.Builder replyBuilder = hiReply.newBuilder().setGreetingMessage("hello"+request.getUserName());
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
    }
}
