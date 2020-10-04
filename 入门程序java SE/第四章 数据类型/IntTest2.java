/*
结论：byte char short 做混合运算时，各自先转换成int 再做运算
*/
public class IntTest2{
	public static void main(String[] args){
		char c1 = 'a';
		byte c2 = 1;
		System.out.println(c1+c2);//最终输出类型为int类型 运行过程在JVM（java虚拟机）中把c1 和c2转换成int类型变量 
		//错误: 不兼容的类型: 从int转换到short可能会有损失
		//short c3 = c1 + c2;
		//在c1+c2的数据中是int类型 初步认为JVM的int类型自动类型转换只进行一次 
	}
}