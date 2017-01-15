package com.echo.mybatis.model;

public class Lock {
  private int id;
  private String lockName;
  private int keyId;
  private Key key;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLockName() {
	return lockName;
}
public void setLockName(String lockName) {
	this.lockName = lockName;
}
public Key getKey() {
	return key;
}
public void setKey(Key key) {
	this.key = key;
}
public int getKeyId() {
	return keyId;
}
public void setKeyId(int keyId) {
	this.keyId = keyId;
}
@Override
public String toString() {
	return "Lock [id=" + id + ", lockName=" + lockName + ", keyId=" + keyId + ", key=" + key + "]";
}
 
}
