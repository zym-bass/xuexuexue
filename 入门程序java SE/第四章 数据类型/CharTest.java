/*
    �ַ��� 
	char
	1.charռ�������ֽ�
	2.char��ȡֵ��Χ�ǣ�0~65535��
	3.char����unicode���뷽ʽ��
	4.char���͵��������õ����Ŷ���



	ת���ַ�
*/
public class CharTest{
	public static void main(String[] args){
		//���󣺲��������ͣ�String�޷�ת��Ϊchar
		//char c1="a";
		//���� ��δ�������ַ�����
		//char c2='ab';
		char c1='t';
		System.out.println(c1);
		//
		char c2='\t';//\t ����һ���ַ� \t����"�Ʊ��tab"
		System.out.println(c2);
		System.out.print("wefw\twef");//println��ln�߱����У�\n������
		System.out.println("wefw\twef");
		//��������������/�������������ַ���
		System.out.println('\'');//\���е��������ַ� ������ͨ�ַ���������ַ��ķ���    print("\'");  ����� ��
		System.out.println('\\');//����� \ 
		System.out.println("'Test'");
		System.out.println("\"Test\"");//��ΪӢ�ġ�����д����ʽ
		System.out.println("��Test��");//��Ϊ���ġ�����д����ʽ/���ġ�����Java�������⺬�� ����Ҫת�����ת��

		// ��б��u��ʾ�������һ���ַ���unioode���롣
		// unioode������ʮ�����Ƶġ�
		char x = '\u4e2d';// ����ת����unioode�������ַ�
		System.out.println(x);
	}
}