package com.prog1.employeeDetails;

public class Employee {
	//Data Structure of list List<Data Type> data = new ArrayList<>();
	public String name;
	public int id;
	public double salary;
	
	//constructor is a method that doesn't have return type which share the name as a name of class itself called constructor.
	//Student stud = new Studnet() //creating new instance for the class of Student
	//Student is class ----stud is object of class ---new Student will create new instance for class---before we can get instance of a class we need to call constructor.
	//new Student--this Student that we put every time will call this constructor
	//by default java internally by hidden it for you is actually generating what we call default constructor for you.java provides a copy of your constructor, with that i can create class without worrying abt constructor.
	
	//
	//public Employee() {
	public Employee() {
		//public Student(String fName , String LName) --this method is called overloading means sharing the same name and the arguments/ parameters are different
		//we are giving public means it is possible for us student constructor outside 
		//we are giving private means we are overriding default constructor java
		//
		super();
		// TODO Auto-generated constructor stub
	}
	/** 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	


}
