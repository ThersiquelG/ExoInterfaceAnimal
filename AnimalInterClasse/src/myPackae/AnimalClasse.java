package myPackae;

public class AnimalClasse implements AnimalInterface{
	public String name;

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		System.out.println("J'ai faim.");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("Je suis fatigué.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
