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
		System.out.println("��:" + cha1.length + " ��" + cha1.width + " ��ɫ��" + cha1.color
				+ " ���" + cha1.getArea());
		Changfx_3 cha2 = new Changfx_3(20,  "red");
		System.out.println("��:" + cha2.length + " ��" + cha2.width + " ��ɫ��" + cha2.color
				+ " ���" + cha2.getArea());
		Changfx_3 cha3 = new Changfx_3(20);
		System.out.println("��:" + cha3.length + " ��" + cha3.width + " ��ɫ��" + cha3.color
				+ " ���" + cha3.getArea());
		Changfx_3 cha4 = new Changfx_3();
		System.out.println("��:" + cha4.length + " ��" + cha4.width + " ��ɫ��" + cha4.color
				+ " ���" + cha4.getArea());
		Changfx_4 ss = new Changfx_4(30, "blue");
		System.out.println("��:" + ss.length + " ��" + ss.width + " ��ɫ��" + ss.color
				+ " ���" + ss.getArea());
		Changfx_4 dd = new Changfx_4(30,30, "blue");
		System.out.println("��:" + dd.length + " ��" + dd.width + " ��ɫ��" + dd.color
				+ " ���" + dd.getArea());
	}
}

