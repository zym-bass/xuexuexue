import java.util.Scanner;
public class studentText{
	public static void main(String[] agrs){
		Scanner s = new Scanner(System.in);
		System.out.print("请输入学生成绩：");
		double info = s.nextDouble();
		if(info < 0 || info > 100)
			System.out.println("对不起，您输入的学生成绩不合法");
		System.out.print(info);
		String str = "不及格";
		int infoInt= (int)(info/10);
		switch(infoInt){
		case 10 : case 9:
			str = "优秀";
		    break;
		case 8:
			str = "良";
		    break;
		case 6:
			str = "及格";
			break;
		case 7:
			str = "中";
			break;
		}
		System.out.println("学生成绩状况为："+str);
	}
}