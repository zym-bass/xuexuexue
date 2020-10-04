/*
    字符型 
	char
	1.char占用两个字节
	2.char的取值范围是（0~65535）
	3.char采用unicode编码方式。
	4.char类型的字面量用单引号定义



	转义字符
*/
public class CharTest{
	public static void main(String[] args){
		//错误：不兼容类型：String无法转换为char
		//char c1="a";
		//错误 ：未结束的字符文字
		//char c2='ab';
		char c1='t';
		System.out.println(c1);
		//
		char c2='\t';//\t 属于一个字符 \t属于"制表符tab"
		System.out.println(c2);
		System.out.print("wefw\twef");//println中ln具备换行（\n）功能
		System.out.println("wefw\twef");
		//如何输出‘，“，/这个特殊意义的字符？
		System.out.println('\'');//\具有抵消特殊字符 和让普通字符变成特殊字符的符号    print("\'");  输出： ’
		System.out.println('\\');//输出： \ 
		System.out.println("'Test'");
		System.out.println("\"Test\"");//此为英文”“的写法方式
		System.out.println('分');//此为中文”“的写法方式/中文”“在Java中无特殊含有 不需要转义符号转义

		// 反斜杠u表示后面的是一个字符的unioode编码。
		// unioode编码是十六进制的。
		char x = '\u4e2d';// 将其转换成unioode码表里的字符
		System.out.println(x);
	}
}