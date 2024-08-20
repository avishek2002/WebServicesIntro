# How to guide on setting up web services

## Create a maven project for the server 
### Terminal
```
mvn archetype:generate -DgroupId=ToolsQA -DartifactId=DemoMavenProject -DarchetypeArtifactId= maven-archetype-quickstart -DinteractiveMode=false
```
### IntelliJ
1. Click on "New Project" on the Project tab
2. Enter the name and path directory where you want your project
3. Select Java as the language and Maven as the build system
### VS Code
1. Press shift + command + p, and type in Maven: New Project
2. Select any archetype and version
3. For the artifact Id, enter your project name
4. Navigate to where you want to place your project

## Add the jaxws-ri dependency into the pom.xml file
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

## Copy the service side code from here directory to <your_project_name>/src/main/java

./wsimport.sh hello.xml -keep # this is for extracting seng4400 folder from the downloaded wsdl file