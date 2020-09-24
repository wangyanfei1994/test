import java.util.Scanner;
public class Grade1 {
    public static void main(String[] args) {
		for(;;){
        Scanner input = new Scanner(System.in);   
		System.out.println("请输入学生的课程编号：");
		int CourseNo = input.nextInt();
        System.out.println("请输入学生的分数：");
        double score = input.nextDouble();
        if(score>=90.0 && score<=100.0){
			System.out.println("课程编号为" + CourseNo + "的考生平均成绩为优");
		}else if(score>=80.0){ 
			System.out.println("课程编号为" + CourseNo + "的考生平均成绩为良");
		}else if(score>=70.0){ 
			System.out.println("课程编号为" + CourseNo + "的考生平均成绩为中");
		}else if(score>=60.0){ 
			System.out.println("课程编号为" + CourseNo + "的考生平均成绩为及格");
		}else if(score>0){ 
			System.out.println("课程编号为" + CourseNo + "的考生平均成绩为不及格");
		}
        }    
	}
}