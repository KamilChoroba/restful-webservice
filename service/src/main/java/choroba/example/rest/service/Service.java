package choroba.example.rest.service;

import choroba.example.rest.database.MongoDb;
import choroba.example.rest.dto.User;

public class Service {

	private MongoDb mongoDb;

	public User getUser(String id) {
		return this.mongoDb.searchForId(id);
	}

	public void setMongoDb(MongoDb mongoDb) {
		this.mongoDb = mongoDb;
	}
}
