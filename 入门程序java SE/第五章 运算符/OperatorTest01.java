/*
��ϵ��������������ǲ�������boolean ����true false

�߼������ Ҫ���������߶��ǲ�����������������ս�����ǲ�������
��·�� &&  ��·�� ||
*/
public class OperatorTest01{
	public static void main(String[] args){

		System.out.println("true  &   true �ǣ�"+(true  &   true));//true
		System.out.println("true  &   false�ǣ�"+(true  &   false));//false
		System.out.println("false &   false�ǣ�"+(false &   false));//false

		//��·������&& 
		System.out.println("true  &&  true �ǣ�"+(true  &&  true ));//true
		System.out.println("true  &&  false�ǣ�"+(true  &&  false));//false
		System.out.println("false &&  false�ǣ�"+(false &&  false));//false

		//����������һ��ʲô�Ƕ�·����ʲôʱ��ᷢ������·����
		int x = 10;
		int y = 11;
		System.out.println( x>y & x>y++);
		System.out.println(y);//���12
		//˵����&�߼�������� ��������Ѿ�֪���Ǽ٣����������ұ�ʽ���Ƿ���ȷ 
		System.out.println( x>y && x>y++);
		System.out.println(y);//���12  
		//˵��&& ��·�� ����ߵ�ʽ�жϺ󲻻����������Ĺ�ʽ
	}
}