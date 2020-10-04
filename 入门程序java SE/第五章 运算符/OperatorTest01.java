/*
关系运算符运算结果都是布尔类型boolean 就是true false

逻辑运算符 要求左右两边都是布尔运算符，并且最终结果都是布尔类型
短路与 &&  短路或 ||
*/
public class OperatorTest01{
	public static void main(String[] args){

		System.out.println("true  &   true 是："+(true  &   true));//true
		System.out.println("true  &   false是："+(true  &   false));//false
		System.out.println("false &   false是："+(false &   false));//false

		//短路现象用&& 
		System.out.println("true  &&  true 是："+(true  &&  true ));//true
		System.out.println("true  &&  false是："+(true  &&  false));//false
		System.out.println("false &&  false是："+(false &&  false));//false

		//接下来解释一下什么是短路现象，什么时候会发生“短路”。
		int x = 10;
		int y = 11;
		System.out.println( x>y & x>y++);
		System.out.println(y);//输出12
		//说明在&逻辑运算符中 那怕左边已经知道是假，还是运算右边式子是否正确 
		System.out.println( x>y && x>y++);
		System.out.println(y);//输出12  
		//说明&& 短路与 在左边等式判断后不会再运算后面的公式
	}
}