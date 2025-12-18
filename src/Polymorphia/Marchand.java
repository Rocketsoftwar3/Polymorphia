package Polymorphia;

import java.util.ArrayList;

public class Marchand {
	private ArrayList<Armes> armes;
	private ArrayList<Potions> potions;
	private ArrayList<Sorts> sorts;
	
	public Marchand(ArrayList<Armes> arme, ArrayList<Potions> potions, ArrayList<Sorts> sorts, String materia,int prix) {
		this.armes=arme;
		this.potions=potions;
		this.sorts=sorts;
	}
	public ArrayList<Armes> getArmeMarchand() {return this.armes;}

    public ArrayList<Potions> getPortionMarchand() {return this.potions;}

    public ArrayList<Sorts> getSortsMarchand() {return this.sorts;}
   
  
    
    
	
}
