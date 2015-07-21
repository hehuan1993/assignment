package Claa;
public class Person {
	private String name;
	private int age;
	private double height;
	private String gender;
	public Person(String n, int a,String g, double h) {
		name = n;
		age = a;
		height = h;
		gender=g;
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public String getgender() {
		return gender;
	}
	public double getheight() {
		return height;
	}
}


