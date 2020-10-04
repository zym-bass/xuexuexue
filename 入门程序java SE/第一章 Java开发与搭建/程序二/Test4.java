/*
1.Java可以同时定义多个类
2.public没有也可以 其不是必须的
3.每个class都是独立的
4. public修饰的类必须与文件名一致
*/

//想从哪个入口进去执行，就可以加载哪个类   在生成.class文件是 已经把每个类文件分成单个的.class文件 //对函数的测试
class A{
	public static void main(String[] args){
		System.out.println("fewfew");
	}
}
class B{
		public static void main(String[] args){
		System.out.println("fewfew");
}
class C{
		public static void main(String[] args){
		System.out.println("fewfew");
}