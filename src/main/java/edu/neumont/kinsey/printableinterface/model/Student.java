package edu.neumont.kinsey.printableinterface.model;

public class Student implements ConsolePrintable{
	String name;
	double GPA;
	
	public Student() {}
	
	public Student(String name, double GPA) {
		this.setName(name);
		this.setGPA(GPA);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public void print() {
		System.out.println(this.getName() + " has a GPA of " + this.getGPA());
	}
}
