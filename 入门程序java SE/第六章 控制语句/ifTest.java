import java.util.Scanner;
public class ifTest{
	public static void main(String[] args){
		/*
		java.util.Scanner s = new java.util.Scanner（System.in）;
		*/
		Scanner a = new Scanner(System.in);
		System.out.println("请输入0~10的一个数字代表您的此刻的心情:");
		int gender = a.nextInt();//根据数据类型改变 a.next数据类型名()  a.nextDouble()  
		System.out.println(gender);
		if(gender == 9)
			System.out.println("好心情");
		else if( gender>0 && gender<9 )
			System.out.println("良好");
		else if( gender==10 )
			System.out.println("好");
		}
}