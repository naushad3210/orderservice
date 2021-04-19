# Added slim adoptopenjdk
FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /app

ADD target/OrderService.jar OrderService.jar
EXPOSE 9091
ENTRYPOINT ["java", "-jar", "OrderService.jar"]