package seng4400;

public class Client{
    public static void main(String[] args){
        // creating a new instance of HelloWorldImplService
        HelloWorldImplService service = new HelloWorldImplService();

        // getting HelloWorld port from service instance
        HelloWorld helloWorldObj = service.getHelloWorldImplPort();

        // calling the getHelloWorld method from the above object and printing the result
        // this will call the function on the server and receive the message
        String result = helloWorldObj.getHelloWorld("avishek", "australia");
        System.out.println(result);
    }
}
