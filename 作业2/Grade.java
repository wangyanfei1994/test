import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        for(;;)
        {
        Scanner input = new Scanner(System.in);   
		System.out.println("请输入学生的课程编号：");
		int CourseNo = input.nextInt();
        System.out.println("请输入学生的分数：");
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
            //System.out.print("该生的成绩等级是：  优");
			System.out.println("课程编号为" + CourseNo + "的考生平均成绩为优");
            break;
        case 2:
            System.out.println("课程编号为" + CourseNo + "的考生平均成绩为良");
            break;
        case 3:
            System.out.println("课程编号为" + CourseNo + "的考生平均成绩为中");
            break;
        case 4:
            System.out.println("课程编号为" + CourseNo + "的考生平均成绩为及格");
            break;
        case 5:
            System.out.println("课程编号为" + CourseNo + "的考生平均成绩为不及格");
            break;
        }  
  
        }    
}
}