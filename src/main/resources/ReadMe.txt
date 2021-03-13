##This project creates an exchange and queue in a rabbitmq.

## Home page for rabbitmq docker image
https://hub.docker.com/_/rabbitmq

##Important links are:
https://www.youtube.com/watch?v=5kxLeR_YuIk
https://github.com/dailycodebuffer/Spring-MVC-Tutorials/blob/master/spring-rabbitmq-producer/src/main/java/com/dailycodebuffer/mq/MessagePublisher.java
https://github.com/dailycodebuffer/Spring-MVC-Tutorials/blob/master/spring-rabbitmq-consumer/src/main/java/com/dailycodebuffer/mq/MessageListener.java
https://www.baeldung.com/rabbitmq-spring-amqp
https://www.baeldung.com/spring-amqp

##To Download the docker image
docker pull rabbitmq:3-management
 
##To run the docker image. This We expose port 5672 so that our application can connect to RabbitMQ.
##and, we expose port 15672 so that we can see what our RabbitMQ broker is doing via either the management UI: http://localhost:15672 or the 
##HTTP API: http://localhost:15672/api/index.html.
docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit-queue rabbitmq:3-management

##To access management console of the rabbitMQ. Login using guest/guest
http://localhost:15672/#/

##To simulate a message to the queue. 
##It delivers an object CustomMessage which includes date and message in the queue. 
##In this scenario "SecondMessage" will be part of the CustomMessage delivered to the queue
http://localhost:8080/rabbit-queue/publish/SecondMessage

##Incase project lombak doesnot work
https://stackoverflow.com/questions/11803948/lombok-is-not-generating-getter-and-setter