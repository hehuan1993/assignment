import java.util.Scanner;
public class p1 {
public static void main(String[] args){
	String s;
	Scanner in = new Scanner(System.in);
	System.out.print("�������ʱ�");
	s=in.nextLine();
	String regex="[0-9]{6}";
	if(s.matches(regex))
		System.out.print("����Ϸ�");	
	else System.out.print("��������䲻�Ϸ�");
}
}