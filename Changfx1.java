package Claa;
import java.util.Scanner;
class Changfx_1 {
	public int length;
	public int width;
	public String color;

	public Changfx_1(int length, int width, String color) {
		this.length = length;
		this.width = width;
		this.color = color;
	}

	public Changfx_1(int length, String color) {
		this.length = length;
		this.width = length;
		this.color = color;
	}

	public Changfx_1(int length) {
		this.length = length;
		this.width = length;
	}

	public Changfx_1() {
	}

	public int getArea() {
		return length * width;
	}
}

class Changfx_2 extends Changfx_1 {
	public Changfx_2(int length, String color) {
		super(length, color);
	}

	public Changfx_2(int length, int width, String color) {
		super(length, width, color);
	}
}

class Changfx1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入长度");
		int length = in.nextInt();
		System.out.print("请输入宽度");
		int width = in.nextInt();
		System.out.print("请输入颜色");
		String color = in.next();
		Changfx_1 cha1 = new Changfx_1(length, width, color);
		System.out.println("长:" + length + " 宽：" + width + " 颜色：" + color
				+ " 面积" + cha1.getArea());
		Changfx_1 cha2 = new Changfx_1(length, color);
		System.out.println("长:" + length + " 宽：" + width + " 颜色：" + color
				+ " 面积" + length * width);
		Changfx_1 cha3 = new Changfx_1(length);
		System.out.println("长:" + length + " 宽：" + width + " 颜色：" + color
				+ " 面积" + length * width);
		Changfx_1 cha4 = new Changfx_1();
		System.out.println("长:" + length + " 宽：" + width + " 颜色：" + color
				+ " 面积" + length * width);
		Changfx_2 ss = new Changfx_2(length, color);
		System.out.println("长:" + length + " 宽：" + width + " 颜色：" + color
				+ " 面积" + length * width);
		Changfx_2 dd = new Changfx_2(length, color);
		System.out.println("长:" + length + " 宽：" + width + " 颜色：" + color
				+ " 面积" + length * width);
	}
}

