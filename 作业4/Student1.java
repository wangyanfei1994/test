import java.util.ArrayList;
import java.util.Collection;
public class Student1{
	//成员变量
	private int ID;
	private String name;
	private float score;
	//成员方法
	public int getID(){
		return ID;
	}
	public void setID(){
		this.ID=ID;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		this.name=name;
	}
	public float getScore(){
		return score;
	}
	public void setScore(){
		this.score=score;
	}
	public void SetRecord(int ID,String name,float score){
		this.ID=ID;
		this.name=name;
		this.score=score;
	}
	public float getRecord(int ID){
		if(ID==this.ID)
		return this.score;
		else
		return -1;
	}
	public static void main(String[] args){
		//创建集合对象
		Collection c=new ArrayList();
		//创建学生对象
		Student1 s1=new Student1();
		s1.SetRecord(1,"小王",100);
		Student1 s2=new Student1();
		s2.SetRecord(2,"小李",90);
		Student1 s3=new Student1();
		s3.SetRecord(3,"小赵",80);
		Student1 s4=new Student1();
		s4.SetRecord(4,"小孙",70);
		Student1 s5=new Student1();
		s5.SetRecord(5,"小杨",60);
		//把学生添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		//把集合转成数组
		Object[] objs=c.toArray();
		//遍历数组
		for(int x=0;x<objs.length;x++){
			Student1  s = (Student1)objs[x]; //向下转型
			System.out.println(s.getID()+ " " + s.getName()+ " " +s.getScore());
		}
		//通过学号得到考生的成绩
		Student1 s6=new Student1();
		s6.SetRecord(6,"alex",100);
		float Sco=s6.getRecord(6);
		System.out.print(Sco);
	}
	}