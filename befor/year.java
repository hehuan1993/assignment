package year;

import java.util.Scanner;
public class year {
	public static boolean isLeap(int y)
	{
		if(y%4==0&&y%100!=0||y%400==0)
			return true;
	   else
			return false;
   }
public static void main(String[] args)
     {int i;
	  System.out.print("ÇëÊäÈëÄê·İi");
	  Scanner input = new Scanner(System.in);
	  i=input.nextInt();
	  System.out.print(isLeap(i));
	
     }
}