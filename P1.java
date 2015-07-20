import java.util.Scanner;
public class p1 {
public static void main(String[] args){
	String s;
	Scanner in = new Scanner(System.in);
	System.out.print("请输入邮编");
	s=in.nextLine();
	String regex="[0-9]{6}";
	if(s.matches(regex))
		System.out.print("邮箱合法");	
	else System.out.print("输入的邮箱不合法");
}
}