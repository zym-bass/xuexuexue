/*
 ��ֵ�������=�����ұߵ����ȼ�����ߵ����ȼ��ߣ�������ִ���ұ������ ��ִ����ߵ�
*/
public class OperatorTest02{
	public static void main(String[] args){
		int i = 10;
		i+=2;//i=i+2=12;
		i+=2+i;//i=i+i+2=12+12+2=26: û�б���˵���������ߵ�ʽ
		System.out.println(i);//

		byte x = 100;
		//x=x + 1; x+1 ת����Ϊ��int ����  
		//����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		x+=1;// x =byte(x+1); 
		//����ͨ�� ˵����չ�������Զ������ı����������͡�
		System.out.println(x);//101
		x+=199;
		System.out.println(x);//44 �����
      

		long j = 100;
		j = j+1;//long���Ϳ���ת��������˵���˵�С��ǿ������ת��

	}
} 