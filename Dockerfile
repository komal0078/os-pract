FROM openjdk
WORKDIR .
COPY . .
RUN javac Main.java
CMD ["java", "Main"]