import java.util.Scanner;
public class Email {
	public static void main(String[] args){
		String s;
		Scanner in = new Scanner(System.in);
		System.out.print("�����������ַ");
		s=in.nextLine();
		String regex="^[a-zA-Z_0-9]+@[a-zA-Z_0-9]+[\\.][a-z]{2,3}$";
		if(s.matches(regex))
			System.out.print("������������ַ�Ϸ�");	
		else System.out.print("������������ַ���Ϸ�");

}
}
