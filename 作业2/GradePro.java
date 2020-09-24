public class GradePro{
	public static void main(String[] args)
	{
		String[] CourseNum=new String[4];
		CourseNum[0]="1001";
		CourseNum[1]="3001";
		CourseNum[2]="2001";
		CourseNum[3]="1002";
		int Grade[]={90,85,66,51,69,78,88,94,68,88,81,90,
		65,74,64,46,68,90,85,88,68,70,60};
		double averNum[]=new double[4];
		if(CourseNum[0]){
			int y=0;
			for(x=0;x<8;x++){
				y=y+Grade[x];
			}
			averNum[0]=y/8;
		}else if(CourseNum[1]){
			int y=0;
			for(x=8;x<16;x++){
				y=y+Grade[x];
			}
			averNum[1]=y/8;
		}else if(Course[2]){
			int y=0;
			for(x=16;x<22;x++){
				y=y+Grade[x];
			}
			averNum[2]=y/6;
		}else if(Course[3]){
			averNum[3]=60;
		}
		switch(averNum[x]!=0){
			case averNum[x]>=90:
				System.out.println("课程编号为" + x + "的考生平均成绩为优");
				break;
			case 80<=averNum[x]<90:
				System.out.println("课程编号为" + x + "的考生平均成绩为良");
				break;
			case 70<=averNum[x]<80:
				System.out.println("课程编号为" + x + "的考生平均成绩为中");
				break;
			case 60<=averNum[x]<70:
				System.out.println("课程编号为" + x + "的考生平均成绩为及格");
				break;
		
		}
	}
}

	
		
	
		