//Marcelo Marques Araujo CB3005631

public class TesteAuthor {
	public static void main(String [] args) {

		Author a1 = new Author("Marcelo Marques", "marcelomrques@gmail.com", 'm');

		System.out.println("Author: " + a1.getName());
		System.out.println("Email: " + a1.getEmail());
		a1.setEmail("novo@email.com");
		System.out.println("Gender: " + a1.getGender());
		System.out.println("Author info: " + a1.toString());
	}
}
