package javase.jaxws.metro.example3.server;

import javax.xml.ws.Endpoint;

public class TimeServerPublisher {
    public static void main(String[] args) {
    	// accessible by browser through http://localhost:9876/ts?wsdl
        String address = "http://localhost:9876/ts";
        TimeServer implementor = new TimeServerImpl();
        Endpoint.publish(address, implementor);
    }    
}