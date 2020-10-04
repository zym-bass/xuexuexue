/*
一、在Java程序中，单词颜色不一样 代表含义不一样

黑色  标识符
1.标识符可以表示：
	
	类名
	方法名
	变量名
	接口名
	常量名
	......
	即程序员能自己命名的统称为标识符
标识符书写规则 1.只能有数字 字母(包括中文) 下划线 美元符号$ 组成  
			   2.不能以数字开头
			   3.关键字不能作为标识符 基本与C语言相通
			   4.标识符是严格区分大小写的 ，但是类名实际也是区分大小写但是在生成.class文件上是谁在前声明谁产生.class 文件

*/
public class biaoshifuTest{
	//main属于标识符 但其不能修改 因为main是SUN公司固定死的

	public static void main(String[] args){
		int k = 100 ;
		int nianLing = 20 ;
	}
}

/*
class 123ABC
{
//其错误标识符  标识符开头不能是数字 
}
class Hello World
{
	//标识符不能有空格 也就是只能有数字 字母 下划线 并且数字不能开头  其编译错误只检测到了Hello 这个合法标识符，所以提示加{}
}
*/
class B
{
}
class b
{
}
//在类文件声明中 B和b同时声明下 哪个在前面在编译生成.class文件是就生成哪给  
//EX：现在dos窗口通过javac 生成 一个biaoshifuTest.class 和B.class不会生成b.class  
// 其适用范围 对类名  在Java编译中其实要区分大小写但是在生成.class谁在前生成谁 
// 在声明类名中 除非特殊情况下最好不要通过大小写区分类名
