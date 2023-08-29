FROM eclipse-temurin:17
COPY target/captain.jar captain.jar
CMD [ "java","-jar","captain.jar" ]