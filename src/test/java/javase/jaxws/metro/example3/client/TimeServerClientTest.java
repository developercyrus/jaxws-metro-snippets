package javase.jaxws.metro.example3.client;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import javase.jaxws.metro.example3.client.TimeServerClient;

import org.junit.Test;

public class TimeServerClientTest {
	@Test
	public void test1() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");

		String actual = TimeServerClient.getTimeAsUTC();
		String expected = f.format(new Date());

		System.out.println(actual);
		System.out.println(expected);

		assertEquals(expected.compareTo(actual), 0);
	}
}
