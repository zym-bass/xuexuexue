/*
 *****在java中整数都以int类型存储*****************
	整数型 
	byte   1  -128~127
	short  2
	int    4  2147483647最大值
	long   8

	整数型字面量有4种表达形式：
	十进制，
	二进制
	八进制
	十六进制
	如果希望该“整数型字面量”被当作long类型处理，需要在“字面量”后面添加L/l建议使用大写L 小写看不清
	*******隐式类型转换由JVM自动完成。 所以编程可以直接用***********
*/

public class IntTest{
	public static void main(String[] args){
		int a = 10;
		System.out.println(a);
		int b = 010;//八进制用0
		System.out.println(b);
		int c = 0x10;//十六进制用0x
		System.out.println(c);
		int d = 0b10;//二进制用0b
		System.out.println(d);

		//byte-->short-->int-->long 小容量可以自动转换成大容量的   这个是自动类型转换（隐式类型转换）
		long a1 = 300L;
		long a2 = 2147483648L;//该数以超出int类型的最大范围 由于赋值整数默认为int，所以必须在该数字后面加‘L’。
		byte a3 = 121;
		long a4 = a3;
		System.out.println("long类型在JVM（java虚拟机）中自动将byte自动转换成 short int long 类型，\n所以输出应为2 \n实际输出输出："+a3);

		//显式类型转换（强制类型转换）
		//在java中大容量不可以直接赋值给小容量  能强制转换 但数值大的超过转换小容量 会导致精度损失
		long x = 200L;
		System.out.println(x);
		int  z =(int)x;//强制类型转换  long类型的强制转换int 会自动将前面的4个字节砍掉 
		System.out.println(z);
		//计/；‘算机中负数存储的是补码
		byte h=(byte)300;//八个字节 主要考虑最高次为是否为1 为1则为负数 计算机存储没补码 所以负数实际值等于让补码最高次进位的值
/*已知一个数的补码， 求原码 的操作分两种情况： 
（1）如果补码的符号位为“0”，表示是一个正数，所以补码就是该数的原码。 
（2）如果补码的符号位为“1”，表示是一个负数，求原码的操作可以是：符号位为1，其余各位取反，然后再整个数加1。
*/
		System.out.println(h);
	}
}