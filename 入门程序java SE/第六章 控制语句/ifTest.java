import java.util.Scanner;
public class ifTest{
	public static void main(String[] args){
		/*
		java.util.Scanner s = new java.util.Scanner��System.in��;
		*/
		Scanner a = new Scanner(System.in);
		System.out.println("������0~10��һ�����ִ������Ĵ˿̵�����:");
		int gender = a.nextInt();//�����������͸ı� a.next����������()  a.nextDouble()  
		System.out.println(gender);
		if(gender == 9)
			System.out.println("������");
		else if( gender>0 && gender<9 )
			System.out.println("����");
		else if( gender==10 )
			System.out.println("��");
		}
}