package com.training.jsf.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="data")
@RequestScoped

public class UserData {
	private String usrClass;
	private String name;
	private int rollNo;
	private int age;
	
	private static final List<Student> studList =new ArrayList<>(Arrays.asList(
			new Student("Rohan","Civil",101,21),
			new Student("Priya","Cs",103,21),
			new Student("Titu","mechanical",102,23)));
	
	public List<Student> getStudents(){
		return studList;
	}
	public void addStudent() {
		studList.add(new Student(name,usrClass,rollNo,age));
	}
	
	public String getUsrClass() {
		return usrClass;
	}
	public void setUsrClass(String usrClass) {
		this.usrClass = usrClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
