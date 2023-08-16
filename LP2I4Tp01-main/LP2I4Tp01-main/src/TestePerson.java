//Marcelo Marques Araujo CB3005631

public class TestePerson {
	public static void main(String[] args)
	{
		
		Student student;
		Staff staff;
		
		Person p1 = new Person("João?","Person?");
		Student s1 = new Student("estudante1","estudante2","S",2023,6.0);
		Staff s2 = new Staff("Staff1","Staff2","Staff3",2);
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}

