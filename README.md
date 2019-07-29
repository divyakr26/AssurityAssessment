# AssurityAssessment

> TO validate the Webservices with the given Acceptance Criteria.

## TOOLS
[JAVA V_1.7 or greater](https://www.java.com/en/download/)<br/>
[Maven Build](https://maven.apache.org/download.cgi)<br/>
[TestNG Framework](https://mvnrepository.com/artifact/org.testng/testng/7.0.0-beta7)<br/>
[Simple JsonParser , Rest Assured](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1)

## Project Description
> With the given webservice endpoint, the url is passed in to JsonObject (Via Buffered reader and encoded the response and reponse as json object
<br/>The json object is passed in to restassured Json path
<br/>Although we have option to convert json object to json array and retrive the response as string it is a long process.
<br/>Via Json path it is easy to get each parameter value and even the array of values with key value pairs.
<br/>The input test data is also formatted in <B>.json</B> format for easy handling of test input and validations
<br/>The input json which has the acceptance criteria is validated with the response data via assertion

## Architech Diagram of the Framework
(../src/test/resource/readmeimage/AssurityArchitectural Diagram.jpg)

## Installation/Pre conditions for Running the test

Java 1.7 or higher
<br/>Maven 
<br/>Any IDE/Command promt to run the test
<br/>Set Java_Home and Maven_Home in environmental variables

To check if Java and maven are installed in your Machine:

```sh
Java -version
Mvn -version
```

## Usage example


_For more examples 

## Development setup


```sh
make install
npm test
```


## Contributing

1. Fork it (<https://github.com/yourname/yourproject/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

