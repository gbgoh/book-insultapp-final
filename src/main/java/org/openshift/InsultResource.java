package org.openshift;

import java.util.HashMap;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/insult")
public class InsultResource {
	
	@GET()
	@Produces("application/json")
	public String getInsult() {
		return (new HashMap<String, String>().put("insult", new InsultGenerator().generateInsult()));
	}
}
