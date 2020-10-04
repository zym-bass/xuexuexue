/*
   条件运算符
		语法格式
			布尔表达式  ？ 表达式1 ：表达式2
			布尔 真 则选择表达式1 
			布尔 假 则选择表达式2 
*/
public class OperatorTest03{
	public static void main(String[] args){
		boolean sex = false;
		char i = sex ? '男' : '女';
		System.out.println(i);
		System.out.println(sex ? '男' : '女');//没有报错 运行步骤问题考虑清楚

	}
}