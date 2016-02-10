package com.webmonk.service.yate.models;

public class User{
	private String uUID;
	private String firstName;
	private String lastName;
	private Coordinates coordinates;
	
	public User(){}
	
	public User(String uuid, String firstName, String lastName, double lat, double lon){
		this.uUID = uuid;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getmUUID() {
		return uUID;
	}

	public void setmUUID(String mUUID) {
		this.uUID = mUUID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String mFirstName) {
		this.firstName = mFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String mLastName) {
		this.lastName = mLastName;
	}
	
	public void setCoordinates(Coordinates coordinates){
		this.coordinates = coordinates;
	}
	
	public Coordinates getCoordinates(){
		return this.coordinates;
	}


}
