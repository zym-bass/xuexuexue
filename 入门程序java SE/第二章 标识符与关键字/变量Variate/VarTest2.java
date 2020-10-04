/**
*变量测试2
*@author 赵一名
*@version 1.5
*@since 1.0
*/
/*对于一个变量  三要素  
	变量的数据类型
	变量的名字
	变量中保存的值
命名规范 首字母小写 后面每个单词首字母大写
变量必须先声明再赋值
*/
/*
在方法体之中，声明的变量为局部变量
在方法体之外，声明的变量为成员变量


*/


public class VarTest2{
	/**
	*这是程序的入口
	*@param agrs是main方法的参数
	*/
	int k =90;//成员变量
	public static void main(String[] args){
		int manAge = 10; //局部变量 在main函数结束运行后 局部变量的内存空间会释放
		double girlAge=9;
		int a,b,c=100;      // a , b 只是声明并没有被赋值   
		a=300;
		b=200;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}