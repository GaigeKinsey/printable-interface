package edu.neumont.kinsey.printableinterface.model;

public class Park implements ConsolePrintable{
	String name;
	int temperature;
	
	public Park() {}
	
	public Park(String name, int temp) {
		this.setName(name);
		this.setTemperature(temp);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void print() {
		System.out.println(this.getName() + "'s current temperature is " + this.temperature);
	}
}
