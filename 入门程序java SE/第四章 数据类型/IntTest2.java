/*
���ۣ�byte char short ���������ʱ��������ת����int ��������
*/
public class IntTest2{
	public static void main(String[] args){
		char c1 = 'a';
		byte c2 = 1;
		System.out.println(c1+c2);//�����������Ϊint���� ���й�����JVM��java��������а�c1 ��c2ת����int���ͱ��� 
		//����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		//short c3 = c1 + c2;
		//��c1+c2����������int���� ������ΪJVM��int�����Զ�����ת��ֻ����һ�� 
	}
}