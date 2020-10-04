public class KeyInput{
	public static void main(String[] args){
		
		//创建一个键盘扫描仪对象
		//s可以修改 其他不能改
		java.util.Scanner s = new java.util.Scanner(System.in);//写一次就可以了

		//接受用户的输入，接受数据为int类型
		int userInputNum = s.nextInt();//整型输入 ： 变量名.nextInt()
		System.out.println("您输入的数字为："+userInputNum);
		String str = s.next();//字符串类型输入 ： 变量名.next()
		System.out.println("您输入的是："+str);
	}
}