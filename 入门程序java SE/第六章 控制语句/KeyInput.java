public class KeyInput{
	public static void main(String[] args){
		
		//����һ������ɨ���Ƕ���
		//s�����޸� �������ܸ�
		java.util.Scanner s = new java.util.Scanner(System.in);//дһ�ξͿ�����

		//�����û������룬��������Ϊint����
		int userInputNum = s.nextInt();//�������� �� ������.nextInt()
		System.out.println("�����������Ϊ��"+userInputNum);
		String str = s.next();//�ַ����������� �� ������.next()
		System.out.println("��������ǣ�"+str);
	}
}