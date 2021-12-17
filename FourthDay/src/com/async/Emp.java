package com.async;

public class Emp {
  private int sno;
  private String name;
  private String city;
  
public Emp() {}
public Emp(int sno, String name, String city) {
	super();
	this.sno = sno;
	this.name = name;
	this.city = city;
}
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Emp [sno=" + sno + ", name=" + name + ", city=" + city + "]";
}
  
  
}
