FROM openjdk:17

WORKDIR /app

COPY Factorial.java .

RUN javac Factorial.java

CMD [ "java", "Factorial" ]

