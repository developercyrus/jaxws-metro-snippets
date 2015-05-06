package javase.jaxws.metro.example2.client;

import javase.jaxws.metro.example2.stub.Service1;
import javase.jaxws.metro.example2.stub.Service1Soap;

public class Service1Client {
    public static String sayHello() {
    	Service1 s1 = new Service1();
        Service1Soap s = s1.getService1Soap();
        return s.sayHello();
    }
    
    public static void main(String[] args) {        
        System.out.println(sayHello());
    }
}


