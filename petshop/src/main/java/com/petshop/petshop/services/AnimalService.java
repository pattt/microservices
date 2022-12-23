package com.petshop.petshop.services;

import com.petshop.grpc.HelloRequest;
import com.petshop.grpc.HelloWorldServiceGrpc.HelloWorldServiceBlockingStub;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    @GrpcClient("__name__")
    private HelloWorldServiceBlockingStub helloWorldServiceBlockingStub;

    public String getHello(String text) {
        HelloRequest request = HelloRequest.newBuilder()
            .setText(text)
            .build();

        return helloWorldServiceBlockingStub.hello(request).getText();
    }
}
