package com.webmonk.services.yate;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;

import com.webmonk.service.yate.models.User;

@Path("userServices")
public class UserServices {
	
	static Logger log = Logger.getLogger(SampleStaticData.class.getName());
	
	@POST
	@Path("registerUser")
	@Consumes(MediaType.APPLICATION_JSON)
	public String registerUser(User user){
		log.info(user.getCoordinates().lat);
		return SampleStaticData.addNewUser(user);//SampleStaticData.addNewCoordindates(lat,lon);
	}
	
	@GET
	@Path("getUser")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@QueryParam("uuid") String uuid){
		return SampleStaticData.getUser(uuid);
	}
}
