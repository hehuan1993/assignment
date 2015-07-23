package Claa;

import java.util.Scanner;

class shape {
	double length;
	double width;
	double r;

	shape() {

	}

	shape(double length, double width, double r) {
		this.length = length;
		this.width = width;
		this.r = r;
	}

	public double getArea() {
		double s = this.length * this.width;
		return s;
	}
}

class Rectangle extends shape {
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return this.length * this.width;

	}

}

class Circle extends shape {
	Circle(double r) {
		this.r = r;
	}

	public double getArea() {
		return 3.14 * this.r * this.r;

	}
}

public class Testshape {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("«Î ‰»Î≥§");
		double length = in.nextDouble();
		System.out.print("«Î ‰»Î≥§");
		double width = in.nextDouble();
		System.out.print("«Î ‰»Î∞Îæ∂");
		double r = in.nextDouble();
		shape h = new Rectangle(width, length);
		h.getArea();
		System.out.println(h.getArea());
		shape w = new Circle(r);
		w.getArea();
		System.out.println(w.getArea());
	}
}