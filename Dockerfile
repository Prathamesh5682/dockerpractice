FROM openjdk:17

WORKDIR /app

COPY Factorial.java .
COPY Swap.java .

RUN javac Factorial.java
RUN javac Swap.java

# CMD [ "java", "Factorial" ]
CMD [ "java", "Swap" ]

