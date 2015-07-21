package Claa;
public class Student {
	private String name;
	private int grade;
	private String major;
	private int [] cet_score;
    public Student(String n, int g,String m,int [] c) {
		this.name = n;
		this.grade = g;
		this.major = m;
	    this.cet_score=c;	
	}
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int[] getCet_score() {
		return cet_score;
	}
	
	public void level_up()
	{
		this.grade++;
		System.out.println("恭喜你又升了一级");
	}
	public  boolean passed_cet(int[] cet_score){
		boolean b = false;
		for(int i=0;i<7;i++)
		{
			if(cet_score[i]>=425)
			{
				b = true;
				break;
			}
		}
		return b;
	}	
	public void printInfo()
	{
		System.out.println("姓名："+this.name+"  年级："+this.grade+"  专业："+this.major+"  是否过四级："+this.passed_cet(cet_score));
	}

	
}

