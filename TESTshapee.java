package Claa;

import java.util.ArrayList;

abstract class Shape{
	public abstract double area();
}
class CFX extends Shape{
	private double length;
	private double wide;
	public CFX(double length,double wide){
		this.length=length;
		this.wide=wide;
	}
	public double area(){
		return length*wide;
	}
}
class ZFX extends Shape{
	private double length;
	public ZFX(double length){
		this.length=length;
	}
	public double area() {
		return length*length;
	}
	
}
class Circle extends Shape{
	private double R;
	public Circle(double R){
		this.R=R;
	}
	public double area() {
		return Math.PI*R*R;
	}
	
}
class Sjx extends Shape{
	private double length;
	private double height;
	public Sjx(double length,double height){
		this.length=length;
		this.height=height;
	}
	public double area() {
		return 0.5*length*height;
	}
}
public class TESTshapee {
	
	public static void main(String[] args){
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new CFX(4,5));
		shapes.add(new ZFX(6));
		shapes.add(new Circle(2));
		shapes.add(new Sjx(3,4));
		System.out.println("Total Area:" + getTotalArea(shapes));
	}
	public static double  getTotalArea(ArrayList<Shape> shapes){
		double totalarea=0;
		for(int i=0;i<shapes.size();i++){
			totalarea+=shapes.get(i).area();
		}
		return totalarea;
	}
}
