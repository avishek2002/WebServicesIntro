import javax.jws.WebService;

@WebService(endpointInterface = "HelloWorld", targetNamespace = "seng4400")
public class HelloWorldImpl implements HelloWorld{  
    @Override  
    public String getHelloWorld() {  
        return "Hello World";
    }  
}  
