package com.ebrokers.Beans;

public class PropertyBean {

	public Integer  id;
	public String name;
	public String location;
	private String meid;

	public Integer  getId() {
		return id;
	}

	public void setId(Integer  id) {
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
