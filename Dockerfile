# Usa una imagen con JDK para compilar
FROM maven:3.9.4-eclipse-temurin-17 as builder

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Usa una imagen más liviana para correr la app
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copia el JAR generado en la etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Usa el puerto proporcionado por Fly.io
ENV PORT=8080
EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
