FROM eclipse-temurin:17
COPY target/mark.jar mark.jar
CMD ["java","-jar","mark.jar"]