# RabbitMQDemo
Small project to show how to easily implement Rabbit MQ on SpringBoot

How to:

1. Install RabbitMQ in your docker. You can use this script for Docker-compose:
```
version: "3.2"
services:
  rabbitmq:
    image: rabbitmq:3-management-alpine
    container_name: 'rabbitmq'
    ports:
      - 5672:5672
      - 15672:15672
    networks:
      - rabbit_net
    # volumes:
      # - ~/.docker-conf/rabbitmq/data/:/var/lib/rabbitmq/
      # - ~/.docker-conf/rabbitmq/log/:/var/log/rabbitmq
      
networks:
  rabbit_net:
    driver: bridge
```
2. Run both modules, Producer and Consumer
3. Open your Postman and launch a Rest POST request with any string in the body, to the next endPoint:
`http://localhost:19090/send`

Your request has been launched to the Producer, which sent it to RabbitMQ, and while your Consumer was listening, it must have logged that string in the console.
