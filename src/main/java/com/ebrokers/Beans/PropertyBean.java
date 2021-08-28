package com.ebrokers.Beans;

public class PropertyBean {

	public Long id;
	
	public String name;
	
	public String location;
	
	private String meid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMeid() {
		return meid;
	}

	public void setMeid(String meid) {
		this.meid = meid;
	}

}
