import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        for(;;)
        {
        Scanner input = new Scanner(System.in);   
		System.out.println("������ѧ���Ŀγ̱�ţ�");
		int CourseNo = input.nextInt();
        System.out.println("������ѧ���ķ�����");
        double score = input.nextDouble();
        int level1;
        if(score>=90.0 && score<=100.0){ level1 = 1;}
        else if(score>=80.0){ level1 = 2;}
        else if(score>=70.0){ level1 = 3;}
        else if(score>=60.0){ level1 = 4;}
        else{ level1 = 5;}
            
        switch(level1)
        {
        case 1:
            //System.out.print("�����ĳɼ��ȼ��ǣ�  ��");
			System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ��");
            break;
        case 2:
            System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ��");
            break;
        case 3:
            System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ��");
            break;
        case 4:
            System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ����");
            break;
        case 5:
            System.out.println("�γ̱��Ϊ" + CourseNo + "�Ŀ���ƽ���ɼ�Ϊ������");
            break;
        }  
  
        }    
}
}