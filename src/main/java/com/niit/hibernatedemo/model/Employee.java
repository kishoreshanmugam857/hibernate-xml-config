package com.niit.hibernatedemo.model;

import javax.persistence.Entity;


public class Employee 
{
 int empid;
 String empname;
 String emploc;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmploc() {
	return emploc;
}
public void setEmploc(String emploc) {
	this.emploc = emploc;
}

}
