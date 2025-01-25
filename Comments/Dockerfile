FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Maven'ı yükle
RUN apk add --no-cache maven
COPY . .
RUN mvn package -DskipTests
EXPOSE 8081
CMD java -jar /app/target/midterm-0.0.1-SNAPSHOT.jar