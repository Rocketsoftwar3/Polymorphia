package Polymorphia;

public class Dragon extends Monstre{

	public Dragon(String nom, int point_vie, int attaque, int defense) {
		super(nom, point_vie, attaque, defense);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attaquer() {
		System.out.println("Le Dragon crache du feu sur: ");
		
	}

	@Override
	public void recevoirDegats() {
		
	}

	

}
