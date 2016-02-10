package com.webmonk.services.yate;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.webmonk.service.yate.models.User;

/**
 * Root resource (exposed at "coreResources" path)
 */
@Path("coreResources")
public class CoreResources {
	/**
	 * Default API displaying the core resource
	 * @return
	 */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String defaut() {
        return "This is a sample resource, welcome to the Yate location exchange Services!";
    }
    
    @GET
    @Path("getLastPeerPosition")
    @Produces(MediaType.APPLICATION_JSON)
    public User getLastPeerPostion(@QueryParam("peerID") String peerID){
    	return SampleStaticData.getUser(peerID);
    }
    
    @POST
    @Path("updatePosition")
    @Produces(MediaType.TEXT_PLAIN)
    public Boolean updatePosition(@QueryParam("userId") String userId,@QueryParam("lat") double lat,@QueryParam("lon") double lon){
    	return SampleStaticData.updateCoordinates(userId, lat, lon);
    }
}
