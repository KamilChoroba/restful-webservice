package choroba.example.rest.database;

import java.util.HashMap;
import java.util.Map;

import choroba.example.rest.dto.User;

public class MongoDb {

	private Map<String, User> userList = new HashMap<String, User>();

	public MongoDb() {
		userList.put("1", new User("1", "Kamil", "Choroba"));
		userList.put("2", new User("2", "Hans", "Wurst"));
		userList.put("3", new User("3", "Peter", "Pan"));
	}

	public User searchForId(String id) {
		return userList.get(id);
	}
}
