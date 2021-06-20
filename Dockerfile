FROM openjdk:11 as build
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
RUN ./mvnw package

FROM openjdk:11-jre
WORKDIR /app
COPY --from=build /app/calculator-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "calculator-0.0.1-SNAPSHOT.jar"]