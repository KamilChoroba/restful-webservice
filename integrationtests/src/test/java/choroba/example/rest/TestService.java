package choroba.example.rest;

import org.junit.Before;
import org.junit.Test;

import choroba.example.rest.client.WebserviceClient;

import static org.junit.Assert.assertEquals;

public class TestService {

	WebserviceClient client = null;

	@Before
	public void setUp() throws Exception {
		client = new WebserviceClient("http://localhost:8080/restful-service");
	}

	@Test
	public void testGetPing() {
		assertEquals("{\"status\":\"running\"}",
				client.getPing().readEntity(String.class));
	}

	@Test
	public void testGetUser() {
		assertEquals(
				"{\"id\":\"1\",\"name\":\"Kamil\",\"surname\":\"Choroba\"}",
				client.getUser("1").readEntity(String.class));
	}
}
