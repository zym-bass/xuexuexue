import java.util.Scanner;
public class studentText{
	public static void main(String[] agrs){
		Scanner s = new Scanner(System.in);
		System.out.print("������ѧ���ɼ���");
		double info = s.nextDouble();
		if(info < 0 || info > 100)
			System.out.println("�Բ����������ѧ���ɼ����Ϸ�");
		System.out.print(info);
		String str = "������";
		int infoInt= (int)(info/10);
		switch(infoInt){
		case 10 : case 9:
			str = "����";
		    break;
		case 8:
			str = "��";
		    break;
		case 6:
			str = "����";
			break;
		case 7:
			str = "��";
			break;
		}
		System.out.println("ѧ���ɼ�״��Ϊ��"+str);
	}
}