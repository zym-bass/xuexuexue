class Demo05_对象练习 {
	/*
	在测试类中，定义一个方法showPerson，可以打印Person对象中的所有属性值
	在主方法中，创建一个对象p，并修改属性值，然后调用showPerson方法，打印p对象的所有属性值
	*/
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "wanglaowu";
		p.age = 25;
		p.sex = "m";
		showPerson(p);

		Person pz = new Person();
		pz.name = "zhaoliu";
		pz.age = 26;
		pz.sex = "f";
		showPerson(pz);

	}

	//定义一个方法，可以打印Person中的所有属性值
	public static void showPerson(Person p) {
		System.out.println(p.name + "..." + p.age + "..." + p.sex);
	}
}

class Person {
	String name;
	int age;
	String sex;
}
