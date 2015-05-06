package javase.jaxws.metro.example3.client;

import javase.jaxws.metro.example3.rpc.TimeServer;
import javase.jaxws.metro.example3.rpc.TimeServerImplService;

public class TimeServerClient {
	public static String getTimeAsUTC() {
		TimeServerImplService service = new TimeServerImplService();
		TimeServer ts = service.getTimeServerImplPort();
		return ts.getTimeAsUTC();
	}
	
	public static void main(String[] args) {
		System.out.println(getTimeAsUTC());
	}
}