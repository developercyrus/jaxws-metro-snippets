package javase.jaxws.metro.example3.server;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "javase.jaxws.metro.example3.server.TimeServer")
public class TimeServerImpl implements TimeServer {
	
    public String getTimeAsUTC() {    	
    	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        return f.format(new Date());
    }    
    
    public long getTimeAsElapsed() {
        return new Date().getTime();
    }       
}