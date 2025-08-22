package com.mvns.web.model;

public class Group {
	
	private int id;
	
	private String name;
	
	private String tech;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	
	

}
