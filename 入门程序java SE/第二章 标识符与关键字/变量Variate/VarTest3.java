/*
  变量的作用域：
  		1.作用域：变量的有效范围
		2.局部变量只能在本函数内使用。

成员变量和局部变量重名时，按就近原则使用 
*/



public class VarTest3{

	//成员变量
	int i = 10000;
	public static void main(String[] args){
		int i = 100;//main局部变量
		System.out.println(i);
		x();
		int k;
		for(k=0;k<10;k++){
			}
		System.out.println(k);
	}
	public static void x(){
		int i = 200;//x局部变量
		System.out.println(i);
	}
}