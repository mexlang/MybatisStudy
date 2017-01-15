package com.echo.demo.handler;

/**
 * aoma 
 * @author tangsixiang
 *
 */
public enum Sex {
	MALE("M","ÄÐ"),FAMALE("F","Å®");
	private Sex(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String id;
	public String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 public static Sex getSex(String id){
		 if(id.equals("M"))
			 return MALE;
		 else return Sex.FAMALE;
		 
	 }
	
}
