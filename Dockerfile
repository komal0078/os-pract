FROM openjdk
WORKDIR usr/src/myapp
COPY . .
RUN javac Main.java
CMD ["java", "Main"]