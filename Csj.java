package caishuzi;
import java.util.Scanner;
public class Csj {
	public static void guess(int n) {
		int mid = 0;
		int i;
		int left = 0;
		int right = 100;
		if (n < 0 || n > 100)
		{
			System.out.print("error!!!������һ��С�ڵ���100������n");
	    }
			for (i = 1;; i++)
			{
				System.out.println(mid =(left + right) / 2);
		       if (n == mid)
	         	{
			      break;
	         	}
		          if (n < mid) {
			        right = mid - 1;
			        mid = (left + right) / 2; 
		        }
		          else 
		          {
			       left = mid + 1;
			       mid = (left + right) / 2; 
		          }	
			}
			System.out.println(i);
	}
	public static void main(String[] args) {
		int n;
		System.out.println("������һ��С�ڵ���100������n");
		Scanner input = new Scanner(System.in);
        n = input.nextInt();
		Csj.guess(n);
	}
}
