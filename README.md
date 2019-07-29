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

## Project Highlights
> Vaidation of all API can be done without wrapper class/ script updation .<br/>
> All new validation can be covered in adding new test data json<br/>
> Any new Automation resource will be able to learn and implement this framework as quick as possible

## Architech Diagram of the Framework
![](src/test/resource/Readmeimage/Assurity%20Architectural%20Diagram.jpg)

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

## Creating testdata

As the input test data is .Json format, The parameter to validate is also given as json
<br/>For all the parameter which is to be validated should be given inside Acceptance_Criteria
<br/>If only one parameter is to be validated it should be given in below format
> #### Test data Input format for single acceptance criteria without key 
><br/> _"Acceptance_Criteria1" : 
  <br/>    {
  <br/>      "Name" : "Carbon credits"
  <br/>    }_


>#### Test data Input format for one parameter validation with key object 
><br/> _"Acceptance_Criteria1" : 
  <br/>    {
<br/>			"Promotions": 
<br/>        {
<br/>	            "Description": "=Good position in category 2x larger image in desktop site search results",
<br/>	            "Name": "Gallery"
<br/>	        }
<br/>		}_


>#### Test data Input format for multiple acceptance criteria with key object 
><br/> _"Acceptance_Criteria1" : 
  <br/>    {
  <br/>      "Name" : "Carbon credits"
  <br/>    }_
  <br/> _"Acceptance_Criteria2" : 
  <br/>    {
  <br/>      "Name" : "Carbon credits"
  <br/>    }_
  <br/> _"Acceptance_Criteria3" : 
  <br/>    {
            "Promotions": 
	  <br/>     {
        <br/>      "Description": "~2x larger image",
       <br/>       "Name": "Gallery"
    <br/>        }
  <br/>     }_
  
  
  
  > *To check the exact match with the response when key object is given ' = ' is used in the test data
  
  > *To check the text is present in the response when key object is given ' ~ ' is used in the test data
  
  > *To check the text is not present in the response when key object is given ' ! ' is used in the test data
  
  FOR More live examples please refer to src/test/resource/testdata/ .json file





## How to run the test

Download the code from GITHUB 

```sh
git pull origin master 
<br/>https://github.com/divyakr26/AssurityAssessment.git
```

if you have TestNG installed as mentioned in precondition step, 

Open the project in any IDE (Eclipse preferred) right click TestNG.xml and run as TestNG suite

If you want to run the project as maven Build 

Open the command promt, Navigate to your project folder
```sh
C:\Users> cd path to your folder
C:\Users\Projectfolder> mvn clean install
```

## Reporting

For greater understanding Extent report is plugged in with the framework, However the inbuild testNG report is also available

Once all the test is executed,
<br/>Open the project folder and find the Extent report with the name 
>### APIAutomation suite.html

For testNG report
<br/> Open the project folder and navigate to test-output folder and find the report with the name
> ### emailable-report.html


## Contributing

1. Fork it (<https://github.com/yourname/yourproject/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

