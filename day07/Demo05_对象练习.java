class Demo05_������ϰ {
	/*
	�ڲ������У�����һ������showPerson�����Դ�ӡPerson�����е���������ֵ
	���������У�����һ������p�����޸�����ֵ��Ȼ�����showPerson��������ӡp�������������ֵ
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

	//����һ�����������Դ�ӡPerson�е���������ֵ
	public static void showPerson(Person p) {
		System.out.println(p.name + "..." + p.age + "..." + p.sex);
	}
}

class Person {
	String name;
	int age;
	String sex;
}
