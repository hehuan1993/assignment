import java.util.Scanner;
import Claa.Person;
public class  Test {
	public static void main(String[] args){ 
		String name; int age;String gender;double height ;
		Scanner in = new Scanner(System.in);
		System.out.print("ÇëÊäÈëname");
		name=in.next();
		System.out.print("ÇëÊäÈëage");
		age=in.nextInt();
		System.out.print("ÇëÊäÈëgender");
		gender=in.next();
		System.out.print("ÇëÊäÈëheight");
		height=in.nextDouble();
		Person man = new Person(name,age,gender,height);
		System.out.println(man.getname());
		System.out.println(man.getage());
		System.out.println(man.getgender());
		System.out.println(man.getheight());
		boolean flag=Canmarry(name,age,gender,height);
	if(flag)
		System.out.println("name:"+man.getname()+" can marry");
	else
		System.out.println("name:"+man.getname()+" can not marry");		
	}
	private static boolean Canmarry(String name, int age,String gender,double height ) {	
		if((gender=="male" && age>22) || (gender=="famale"&& age>20))
			return true;
		else 
			return false;
		}
	}

