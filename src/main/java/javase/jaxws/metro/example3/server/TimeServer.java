package javase.jaxws.metro.example3.server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface TimeServer {
	
    @WebMethod
    public String getTimeAsUTC();
    
    @WebMethod
    public long getTimeAsElapsed();
}