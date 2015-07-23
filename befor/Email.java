import java.util.Scanner;
public class Email {
	public static void main(String[] args){
		String s;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入邮箱地址");
		s=in.nextLine();
		String regex="^[a-zA-Z_0-9]+@[a-zA-Z_0-9]+[\\.][a-z]{2,3}$";
		if(s.matches(regex))
			System.out.print("您输入的邮箱地址合法");	
		else System.out.print("您输入的邮箱地址不合法");

}
}
