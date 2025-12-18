package Polymorphia;

public abstract class Monstre {
	String nom;
	int point_vie;
	int attaque;
	int defense;
	
	public Monstre(String nom, int point_vie,int attaque, int defense) {
		this.nom=nom;
		this.point_vie=point_vie;
		this.attaque=attaque;
		this.defense=defense;
		
	}
	
	public abstract void Attaquer();
	
	public abstract void recevoirDegats();
	
	public boolean Vivant() {
		return this.point_vie > 0;
	}
	
	
}
	
