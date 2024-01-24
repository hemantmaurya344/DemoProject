# You can change this base image to anything else
# But make sure to use the correct version of Java
FROM amazoncorretto:latest
# Simply the artifact path
ARG artifact=target/*.jar

WORKDIR /opt/app

COPY ${artifact} app.jar

# This should not be changed
ENTRYPOINT ["java","-jar","app.jar"]
