package Claa;
import java.util.Scanner;
import Claa.Student;
public class Test1 {
	public static void main(String[] args){ 
		String name; int grade;String major; int[] cet_score=new int[3];
		Scanner in = new Scanner(System.in);
		System.out.print("请输入name");
		name=in.next();
		System.out.print("请输入grade");
		grade=in.nextInt();
		System.out.print("请输入major");
		major=in.next();
		System.out.print("请输入score(3个)");
		for(int i=0;i<3;i++)
		{
	    cet_score[i]=in.nextInt();
	    if(cet_score[i]>=425)
	    {
	    	System.out.println("过了");
	    	break;
	    }
	    else
	    {
	    	System.out.println("没过");
	    }
	    }
	    Student s = new Student( name,grade,major,cet_score);
	    System.out.println(s.getName());
		System.out.println(s.getGrade());
		System.out.println(s.getMajor());
		
		s.printInfo();
		s.level_up();
		s.printInfo();
		}	
	}


