FROM eclipse-temurin:17
COPY target/name.jar name.jar
CMD [ "java","-jar","name.jar" ]
