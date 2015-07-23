package ages;
import java.util.Scanner;
public class age{
public static void getLevel(int age)
{
if(age<3)
	System.out.print("婴儿");
	  else if(age<15)
		 System.out.print("少年");
	    else if(age<30)
	    	System.out.print("青年");
	       else if(age<55)
	    	  System.out.print("中年");
	             else System.out.print("老年");
}
public static void main(String[] args)
{
int i;
System.out.print("请输入年龄i");
Scanner input = new Scanner(System.in);
i=input.nextInt();
age.getLevel(i);

}
}
