package ages;
import java.util.Scanner;
public class age{
public static void getLevel(int age)
{
if(age<3)
	System.out.print("Ӥ��");
	  else if(age<15)
		 System.out.print("����");
	    else if(age<30)
	    	System.out.print("����");
	       else if(age<55)
	    	  System.out.print("����");
	             else System.out.print("����");
}
public static void main(String[] args)
{
int i;
System.out.print("����������i");
Scanner input = new Scanner(System.in);
i=input.nextInt();
age.getLevel(i);

}
}
