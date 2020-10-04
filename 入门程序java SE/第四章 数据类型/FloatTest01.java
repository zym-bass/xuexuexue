/*
	关于java语言中的浮点型数据
	flaot   4个字节  单精度
	double  8个字节  双精度

	财务方面需更高的精度 使用java.math.BigDecimal(引用数据类型)
	float 容量更大

java中规定，任何一个的浮点类型数据默认（default）当作double类型处理   要当做flaot 用后缀F/f
*/
public class FloatTest01{
	public static void main (String[] args){
		double p1 = 3.1415926;
		System.out.println(p1);
		float  p2 = 3.1415926F;
		//int p3 = 10.0/5;
		// 错误: 不兼容的类型: 从double转换到int可能会有损失 
		//说明10.0/5后是一个double类型的变量
		int  p3 = (int)10.5/5;
	}
}