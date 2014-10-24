package choroba.example.rest.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class WebserviceClient {

	WebTarget target = null;

	public WebserviceClient(String baseUri) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		target = client.target(convertToURI(baseUri));
	}

	public Response getPing() {
		return target.path("ping").request()
				.accept(MediaType.APPLICATION_JSON).get();
	}

	public Response getUser(String id) {
		return target.path("user").path(id).request()
				.accept(MediaType.APPLICATION_JSON).get();
	}

	private URI convertToURI(String uri) {
		return UriBuilder.fromUri(uri).build();
	}

}
