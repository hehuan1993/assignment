package Claa;
class MyString{
  char [] s;
 public MyString(String str){
		this.s=str.toCharArray();
	}
//测字符串长度
 public int length(){
	 int n=0;
	 for(char c:this.s)
	 { n++;}
	 return n;
 }
//反转的字符串，
public void reverse(){
	char[] a=new char[this.length()];
    for(int i=this.length()-1;i>=0;i--)
    	a [this.length()-1-i]=s[i];
        this.s=a;
}
//转换成字符串
public String toValue(){
	String L="";
	for(int i=0;i<this.length();i++)
		L+=this.s[i];
	return L;
}

//字符串连接 
 public void concat(MyString x){
	 String m=this.toValue()+x.toValue();
	 this.s=m.toCharArray();
 }
 //转换为小写
 public void lower(){
	 for(int i=0;i<this.length();i++)
	 { if(s[i]>64&&s[i]<92)
		 s[i]+=32;
		 else {;}
	 }
 }
//转换成小写
 public void upper(){
	 for(int i=0;i<this.length();i++) 
	 { if(s[i]>96&&s[i]<123)
		 s[i]-=32; 
	 else {;}
	 }
 } 
 }


public class MS {
	public static void main(String[] args){
		MyString x=new MyString("abc");
		System.out.println(x.toValue());
		System.out.println(x.length());
		x.reverse();
		System.out.println(x.toValue());
		System.out.println(x.length());
		MyString y=new MyString("AbCd");
		x.concat(y);
		System.out.println(x.toValue());
		y.lower();
		System.out.println(y.toValue());
		y.upper();
		System.out.println(y.toValue());
	}

}


 