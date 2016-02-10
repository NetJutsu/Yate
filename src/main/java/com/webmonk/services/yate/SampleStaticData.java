package com.webmonk.services.yate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;

import com.webmonk.service.yate.models.User;


public class SampleStaticData {
	static Logger log = Logger.getLogger(SampleStaticData.class.getName());
	
	public static List<User> userCollection = new ArrayList<User>();

	
	public static String addNewUser(User user) {
		log.info("Adding new user coordinates");
		String uuid = UUID.randomUUID().toString();
		user.setmUUID(uuid);
		userCollection.add(user);
		log.info(uuid);
		return uuid;
	}

	public static User getUser(String userId) {
		log.info("fetching user coordinates for user: " + userId);
		if(userCollection.size() > 0){
			for (User aUser : userCollection) {
				log.info(aUser.getFirstName());
				if (aUser.getmUUID().equals(userId)) {
					log.info("Found, returning coordinates...");
					return aUser;
				}
			}
			log.info("UUID not found!");
		}else
		log.info("No data");
		return null;
	}

	public static boolean updateCoordinates(String userId, double lat, double lon) {
		for (User aUser : userCollection) {
			if (aUser.getmUUID() == userId) {
//				aUser.getCoordinates().setLat(lat);
//				aUser.getCoordinates().setLon(lat);
				return true;
			}
		}
		return false;
	}
}
