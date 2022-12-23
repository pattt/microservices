Test:
grpcurl --plaintext  -d '{"text": "test"}' localhost:9090 com.petshop.grpc.HelloWorldService/hello
https://yidongnan.github.io/grpc-spring-boot-starter/en/server/getting-started.html