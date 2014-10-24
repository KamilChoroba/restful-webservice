package choroba.example.rest.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import choroba.example.rest.database.MongoDb;
import choroba.example.rest.dto.User;

public class TestService {

	private Service service;

	@Mock
	private MongoDb mongoDb;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		Mockito.when(mongoDb.searchForId(Mockito.anyString())).thenReturn(
				new User("1", "Kamil", "Choroba"));
		service = new Service();
		service.setMongoDb(mongoDb);
	}

	@Test
	public void testGetUser() {
		assertEquals(new User("1", "Kamil", "Choroba"), service.getUser("1"));
	}
}
