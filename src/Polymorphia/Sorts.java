package Polymorphia;

public class Sorts {
	private String nomSort;
	private String descriptionSort;
	private int prixSort;
	
	public Sorts(String nomSort,String descriptionSort,int prixSort) {
		this.nomSort=nomSort;
		this.descriptionSort=descriptionSort;
		this.prixSort=prixSort;
	}
	
	public String getNomSort() {
		return this.nomSort;
	}
	public String getDescriptionSort() {
		return this.descriptionSort;
	}
	public int getPrixSort() {
		return this.prixSort;
	}
	public String toString() {
		return "Nom: "+ this.nomSort + ", Description: "+ this.descriptionSort +",Prix: "+ this.prixSort;
	}
}
