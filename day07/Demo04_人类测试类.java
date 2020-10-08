class Demo04_人类测试类 {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name + "..." + p1.age + "..." + p1.sex);
		p1.name = "zhangsanfeng";
		p1.age = 123;
		p1.sex = "m";
		System.out.println(p1.name + "..." + p1.age + "..." + p1.sex);
	
	
		Person p2 = new Person();
		p2.name = "lisiguang";
		p2.age = 124;
		p2.sex = "m";
		System.out.println(p2.name + "..." + p2.age + "..." + p2.sex);
	}
}

class Person {
	//人类的属性：姓名、年龄、性别
	String name;
	int age;
	String sex;
}
