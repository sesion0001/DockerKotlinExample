FROM zenika/alpine-kotlin
RUN mkdir /app
WORKDIR /app
COPY main.kt /app
RUN kotlinc main.kt -include-runtime -d hello.jar
CMD [ "java", "-jar", "hello.jar" ]