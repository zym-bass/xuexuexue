/*
	����java�����еĸ���������
	flaot   4���ֽ�  ������
	double  8���ֽ�  ˫����

	����������ߵľ��� ʹ��java.math.BigDecimal(������������)
	float ��������

java�й涨���κ�һ���ĸ�����������Ĭ�ϣ�default������double���ʹ���   Ҫ����flaot �ú�׺F/f
*/
public class FloatTest01{
	public static void main (String[] args){
		double p1 = 3.1415926;
		System.out.println(p1);
		float  p2 = 3.1415926F;
		//int p3 = 10.0/5;
		// ����: �����ݵ�����: ��doubleת����int���ܻ�����ʧ 
		//˵��10.0/5����һ��double���͵ı���
		int  p3 = (int)10.5/5;
	}
}