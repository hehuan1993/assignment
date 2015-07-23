import java.util.Scanner;
public class Name {
	public static void main(String[] args) {
		String s;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入英文名字");
		s = in.nextLine();
		String regex = "^[A-Z]{1}[a-z]+\\s*[A-Z]+[a-z]*$";
		if (s.matches(regex))
			System.out.print("您输入的英文名合法");
		else
			System.out.print("您输入的英文名不合法");
	}
}
