FROM eclipse-temurin:17

LABEL mentainer="cesariza2014@gmail.com"

WORKDIR /app

COPY target/prueba-0.0.1-SNAPSHOT.jar /app/prueba.jar

ENTRYPOINT ["java", "-jar", "prueba.jar"]