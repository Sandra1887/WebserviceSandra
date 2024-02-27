## Web Service Application with AWS and Github Actions
##### by Sandra Jeppsson Kristiansson - 2024-02

### Project
Joke database with 
- Automated CI/CD pipeline in Java through AWS 
- with build process through GitHub Actions
- using Spring Boot Maven
- and MongoDB Atlas
- Tested with JUnit and Mockito

### Use
- Start this app on your local machine
- in your uri/or on Postman enter: https://webservice-app.us-west-2.elasticbeanstalk.com/jokes<endpoint>

*Endpoints*
- "/" - (GET) - see all jokes
- "" - (POST) - add joke
- "/question" - (GET) - for show
- "/answer" - (GET) - for show

Access to database:
- Download MongoDBCompass 
- Connect in Compass with: mongodb+srv://Guest:qwerty123@aws-jokes.qej31ae.mongodb.net/

### Creation
- Build and testing on:
  - Github Actions Workflows
  - maven.yml
- Database server:
  - MongoDB Atlas
- Server running on AWS using:
  - IAM
  - Elastic Beanstalk
  - CodeBuild - *triggered on 'push' to GitHub Repo* 

----------------------------------------------------------------

***Java 17***

***MIT LICENSE***
