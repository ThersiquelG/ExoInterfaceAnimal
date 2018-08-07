package myPackae;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatClasse Felix = new ChatClasse();
		Felix.setName("Felix");
		
		System.out.println("My name's " + Felix.getName());
		Felix.meow();
		Felix.manger();
		Felix.dormir();
	}

}
