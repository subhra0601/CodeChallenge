# Getting Started

###Java + Spring Boot + Maven:Code Challenge


#Endpoint:/randomizer/address
#If you are running in your local system, please enter "http://localhost:8080/randomizer/address" on your browser to get random address
#SOAP UI/Postman can be used to view in a proper JSON format.
#Method:GET
#Default port : 8080[If 8080 is in use, change the port to something else in application.properties file

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.0-SNAPSHOT/maven-plugin/reference/html/)


#More information about the requirement
    #As part of a testing framework,some of mock test data are externalized to a REST HTTP service that can generate a random address.

    #country are limited to below four, but not a mandatory field so it can return blank in some response.
    Since countryCode is not optional, so in case county is blank countyCode is set to "USA"
        US
        Canada
        Mexico
        Netherlands

#Log file is created to keep logs for 60 days,100MB of file size and total size cap of 20GB