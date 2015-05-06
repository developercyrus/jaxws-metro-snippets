
package javase.jaxws.metro.example3.rpc;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TimeServer", targetNamespace = "http://server.example3.metro.jaxws.javase/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeServer {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.example3.metro.jaxws.javase/TimeServer/getTimeAsUTCRequest", output = "http://server.example3.metro.jaxws.javase/TimeServer/getTimeAsUTCResponse")
    public String getTimeAsUTC();

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.example3.metro.jaxws.javase/TimeServer/getTimeAsElapsedRequest", output = "http://server.example3.metro.jaxws.javase/TimeServer/getTimeAsElapsedResponse")
    public long getTimeAsElapsed();

}