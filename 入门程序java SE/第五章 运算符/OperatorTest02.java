/*
 赋值运算符“=”，右边的优先级比左边的优先级高，所以先执行右边运算符 再执行左边的
*/
public class OperatorTest02{
	public static void main(String[] args){
		int i = 10;
		i+=2;//i=i+2=12;
		i+=2+i;//i=i+i+2=12+12+2=26: 没有报错说明先运算后边等式
		System.out.println(i);//

		byte x = 100;
		//x=x + 1; x+1 转换成为了int 类型  
		//错误: 不兼容的类型: 从int转换到byte可能会有损失
		x+=1;// x =byte(x+1); 
		//编译通过 说明扩展运算符永远都不会改变运算结果类型。
		System.out.println(x);//101
		x+=199;
		System.out.println(x);//44 溢出了
      

		long j = 100;
		j = j+1;//long类型可以转换还是又说明了到小得强制类型转换

	}
} 