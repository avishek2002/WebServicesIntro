import javax.jws.WebService;

@WebService(endpointInterface = "HelloWorld", targetNamespace = "seng4400")
public class HelloWorldImpl implements HelloWorld{  
    @Override
    // added parameter here
    public String getHelloWorld(String name, String country) {
        //return "Hello World";
        return "Hi " + name + " from " + country + " , welcome to the Hello World program";
    }  
}  
