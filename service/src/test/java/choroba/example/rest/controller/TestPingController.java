package choroba.example.rest.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import choroba.example.rest.dto.ServerStatus;

public class TestPingController {

	private PingController controller;

	@Before
	public void setUp() throws Exception {
		controller = new PingController();
	}

	@Test
	public void test() {
		assertEquals(new ServerStatus("running"), controller.ping());
	}

}
