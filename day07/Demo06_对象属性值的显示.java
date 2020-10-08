class Demo06_对象属性值的显示 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "zhouqi";
		p.age = 27;
		p.sex = "f";
		System.out.println(p);
	}
}

class Person {
	String name;
	int age;
	String sex;

	public String toString() {
		String result = name + "---" + age + "---" + sex;
		return result;
	}
}
