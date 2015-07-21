package Claa;
class Changfx_3 {
	public int length;
	public int width;
	public String color;

	public Changfx_3(int length, int width, String color) {
		this.length = length;
		this.width = width;
		this.color = color;
	}

	public Changfx_3(int length, String color) {
		this.length = length;
		this.width = length;
		this.color = color;
	}

	public Changfx_3(int length) {
		this.length = length;
		this.width = length;
	}

	public Changfx_3() {
	}

	public int getArea() {
		int s=length * width;
		return s;
	}
}

class Changfx_4 extends Changfx_3 {
	
	public Changfx_4(int length, String color) {
		this.length = length;
		this.color = color;
	}

	public Changfx_4(int length, int width, String color) {
		this.length = length;
		this.color = color;
		this.width = width;
	}
}

public class Cfxzfx {
	public static void main(String[] args) {
		int length =0;int width=0;String color=null; 
		Changfx_3 cha1 = new Changfx_3(20, 20, "red");
		System.out.println("长:" + cha1.length + " 宽：" + cha1.width + " 颜色：" + cha1.color
				+ " 面积" + cha1.getArea());
		Changfx_3 cha2 = new Changfx_3(20,  "red");
		System.out.println("长:" + cha2.length + " 宽：" + cha2.width + " 颜色：" + cha2.color
				+ " 面积" + cha2.getArea());
		Changfx_3 cha3 = new Changfx_3(20);
		System.out.println("长:" + cha3.length + " 宽：" + cha3.width + " 颜色：" + cha3.color
				+ " 面积" + cha3.getArea());
		Changfx_3 cha4 = new Changfx_3();
		System.out.println("长:" + cha4.length + " 宽：" + cha4.width + " 颜色：" + cha4.color
				+ " 面积" + cha4.getArea());
		Changfx_4 ss = new Changfx_4(30, "blue");
		System.out.println("长:" + ss.length + " 宽：" + ss.width + " 颜色：" + ss.color
				+ " 面积" + ss.getArea());
		Changfx_4 dd = new Changfx_4(30,30, "blue");
		System.out.println("长:" + dd.length + " 宽：" + dd.width + " 颜色：" + dd.color
				+ " 面积" + dd.getArea());
	}
}

