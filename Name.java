import java.util.Scanner;
public class Name {
	public static void main(String[] args) {
		String s;
		Scanner in = new Scanner(System.in);
		System.out.print("������Ӣ������");
		s = in.nextLine();
		String regex = "^[A-Z]{1}[a-z]+\\s*[A-Z]+[a-z]*$";
		if (s.matches(regex))
			System.out.print("�������Ӣ�����Ϸ�");
		else
			System.out.print("�������Ӣ�������Ϸ�");
	}
}
