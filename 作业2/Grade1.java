import java.util.Scanner;
public class Grade1 {
    public static void main(String[] args) {
		for(;;){
        Scanner input = new Scanner(System.in);   
		System.out.println("������ѧ���Ŀγ̱�ţ�");
		int CourseNo = input.nextInt();
        System.out.println("������ѧ���ķ�����");
        double score = input.nextDouble();
        if(score>=90.0 && score<=100.0){
			System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ��");
		}else if(score>=80.0){ 
			System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ��");
		}else if(score>=70.0){ 
			System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ��");
		}else if(score>=60.0){ 
			System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ����");
		}else if(score>0){ 
			System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ������");
		}
        }    
	}
}