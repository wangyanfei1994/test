import java.util.ArrayList;
import java.util.Collection;
public class Student1{
	//��Ա����
	private int ID;
	private String name;
	private float score;
	//��Ա����
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
		//�������϶���
		Collection c=new ArrayList();
		//����ѧ������
		Student1 s1=new Student1();
		s1.SetRecord(1,"С��",100);
		Student1 s2=new Student1();
		s2.SetRecord(2,"С��",90);
		Student1 s3=new Student1();
		s3.SetRecord(3,"С��",80);
		Student1 s4=new Student1();
		s4.SetRecord(4,"С��",70);
		Student1 s5=new Student1();
		s5.SetRecord(5,"С��",60);
		//��ѧ����ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		//�Ѽ���ת������
		Object[] objs=c.toArray();
		//��������
		for(int x=0;x<objs.length;x++){
			Student1  s = (Student1)objs[x]; //����ת��
			System.out.println(s.getID()+ " " + s.getName()+ " " +s.getScore());
		}
		//ͨ��ѧ�ŵõ������ĳɼ�
		Student1 s6=new Student1();
		s6.SetRecord(6,"alex",100);
		float Sco=s6.getRecord(6);
		System.out.print(Sco);
	}
	}