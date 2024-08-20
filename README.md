# How to guide on setting up web services

## Creating a maven project
### Terminal
```
mvn archetype:generate -DgroupId=com.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
Replace "my-app" in DartifactId with your project name
### IntelliJ
1. Click on "New Project" on the Project tab
2. Enter the name and path directory where you want your project
3. Select Java as the language and Maven as the build system
### VS Code
1. Press shift + command + p, and type in Maven: New Project
2. Select any archetype and version
3. For the artifact Id, enter your project name
4. Navigate to where you want to place your project

## Server
1. Copy the server side code from web_service_server_code directory to <your_project_name>/src/main/java
2. Add the jaxws-ri dependency into the pom.xml file
```
<dependencies>
    <dependency>
        <groupId>com.sun.xml.ws</groupId>
        <artifactId>jaxws-ri</artifactId>
        <version>2.3.3</version>
        <type>pom</type>
    </dependency>
</dependencies>
```
3. Run the HelloWorldPublisher.java
4. Go to http://localhost:7779/ws/hello and download the WSDL file
5. Download the wsimport tool from https://repo1.maven.org/maven2/com/sun/xml/ws/jaxws-ri/4.0.0/jaxws-ri-4.0.0.zip
6. Navigate to jaxws-ri/bin, where the wsimport.sh is located
7. Run the following command for extracting seng4400 folder from the downloaded wsdl file
```
./wsimport.sh hello.wsdl -keep
```
   > alternatively, if the wsdl file has not been downloaded, replace "hello.wsdl" with "http://localhost:7779/ws/hello?wsdl"
8. This should create a new folder "seng4400", with stub code


## Client
1. Create a new client maven project
2. Add the jaxws-ri dependency
2. Move the seng4400 folder into client/src/main/java
3. Create a new class with the following in the main method
```
HelloWorldImplService service = new HelloWorldImplService();
HelloWorld helloWorldObj = service.getHelloWorldImplPort();
String result = helloWorldObj.getHelloWorld();
System.out.println(result);
```
4. Run the newly created class (Note: if you get errors; try using a recent, 4.0.3, version of jaxws and/or replacing jakarta with javax in the stub code

