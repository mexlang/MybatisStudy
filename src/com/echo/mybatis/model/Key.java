package com.echo.mybatis.model;

public class Key {
   private  int id;
   private  String keyName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getKeyName() {
	return keyName;
}
public void setKeyName(String keyName) {
	this.keyName = keyName;
}
@Override
public String toString() {
	return "Key [id=" + id + ", keyName=" + keyName + "]";
}
   
   
}
