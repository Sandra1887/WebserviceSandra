version: 0.2

phases:
install:
runtime-versions:
java: corretto17
pre_build:
commands:
- echo nothing on pre_build 
build:
commands:
- echo Build started on `date`
- mvn install
- mvn clean package
post_build:
commands:
- echo Build completed on `date`
artifacts:
files:
- target/webservice-app.jar
discard-paths: yes