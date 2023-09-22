FROM eclipse-temurin:17
COPY target/krishdev.jar krishdev.jar
CMD [ "java","-jar","krishdev.jar" ]