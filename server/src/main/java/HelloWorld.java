import javax.jws.WebMethod;
import javax.jws.WebService;  
import javax.jws.soap.SOAPBinding;  
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace = "seng4400")
@SOAPBinding(style = Style.RPC)  
public interface HelloWorld{
    // added parameter here
    @WebMethod String getHelloWorld(String name, String country);
}  
