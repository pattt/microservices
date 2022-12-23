package com.animals.animals.service;
import com.petshop.grpc.HelloWorldServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcServerService extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {

    @Override
    public void hello(com.petshop.grpc.HelloRequest request,
                      io.grpc.stub.StreamObserver<com.petshop.grpc.HelloResponse> responseObserver) {
        com.petshop.grpc.HelloResponse reply = com.petshop.grpc.HelloResponse.newBuilder().setText("Hello ==> " + request.getText()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}

