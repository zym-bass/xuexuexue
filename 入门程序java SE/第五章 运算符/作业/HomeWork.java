public class HomeWork{
	public static void main(String[] args){
		int x =10;
		int a = x + x++;//20
		System.out.println("a="+a);//20
		System.out.println("x="+x);//11
		int b = x + ++x;//23
		System.out.println("b="+b);//23
		System.out.println("x="+x);//12
		int c = x + x--;//24
		System.out.println("c="+c);//24
		System.out.println("x="+x);//11
		int d = x + --x;//21
		System.out.println("d="+d);//21
		System.out.println("x="+x);//10
		double s = 2;
		System.out.println(a/s);


	}
}