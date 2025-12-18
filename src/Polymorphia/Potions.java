package Polymorphia;

public class Potions {
	private String nomPotion;
	private int prixPotion;
	private String effetPotion;
	
	protected Potions(String nomPotion,int prixPotion,String effetPotion) {
		this.nomPotion=nomPotion;
		this.prixPotion=prixPotion;
		this.effetPotion=effetPotion;
		
	}
	public String toString() {
		return this.nomPotion+", "+this.prixPotion+", "+this.effetPotion;
		
	}
	
	protected String getNomPotion() {
		return this.nomPotion;
	}
	protected String getEffetPotion() {
		return this.effetPotion;
	}
	protected int getPrixPotion() {
		return this.prixPotion;
	}
	
	

}
