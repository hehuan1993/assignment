package jiaoyanshenfen;
import java.util.Scanner;
public class Shenfen {
	public static boolean checkId(String[] array) {
		Integer[] a = new Integer[17];
		for (int k = 0; k < 17; k++) {
			a[k] = Integer.parseInt(array[k]);
		}
		int sum = 0;
		int[] b = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		for (int j = 0; j < 17; j++) {
			sum += a[j] * b[j];
		}
		int mod = sum % 11;
		boolean c = false;
		switch (mod) {
		case 0:
			if ("1".equals(array[17]))
				c = true;
			break;
		case 1:
			if ("0".equals(array[17]))
				c = true;
			break;
		case 2:
			if ("X".equals(array[17]))
				c = true;
			break;
		case 3:
			if ("9".equals(array[17]))
				c = true;
			break;
		case 4:
			if ("8".equals(array[17]))
				c = true;
			break;
		case 5:
			if ("7".equals(array[17]))
				c = true;
			break;
		case 6:
			if ("6".equals(array[17]))
				c = true;
			break;
		case 7:
			if ("5".equals(array[17]))
				c = true;
			break;
		case 8:
			if ("4".equals(array[17]))
				c = true;
			break;
		case 9:
			if ("3".equals(array[17]))
				c = true;
			break;
		case 10:
			if ("2".equals(array[17]))
				c = true;
			break;
		}

		return c;

	}

	public static void main(String[] args) throws Exception {
		String s;
		System.out.println("请输入18位身份证号码");
		Scanner input = new Scanner(System.in);
		s = input.next();
		if (s.length() != 18)
			System.out.println("请重新输入");
		String[] p = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			p[i] = (s.charAt(i) + "");
		}
		if (checkId(p))
			System.out.println("身份证合法");
		else
			System.out.println("身份证不合法");

	}
}
	