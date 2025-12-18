package Polymorphia;

import java.util.ArrayList;

public class Monstre {
	private String nom;
	private int pv_monstre;
	private int attaque;
	private int defense;
	private double experience_monstre;
	private int niveau_monstre;
	private static ArrayList<Monstre> liste_monstre = new ArrayList<Monstre>();
	
	public Monstre(String nom,int pv_monstre,int attaque,int defense,int niveau_monstre,double experience_monstre) {
		this.nom=nom;
		this.pv_monstre=pv_monstre;
		this.attaque=attaque;
		this.defense=defense;
		this.experience_monstre=experience_monstre;
		this.niveau_monstre=niveau_monstre;
		liste_monstre.add(this);
	}
	
	public int getPVMonstre() {
		return this.pv_monstre;
	}
	public static ArrayList<Monstre> getMonstres(){
		return liste_monstre;
	}
	
	public int getDefenseMonstre() {
		return this.defense;
	}
	public int getAttMonstre() {
		return this.attaque;
	}
	public void setAttaqueMonstre(int new_att) {
		this.attaque=new_att;
	}
	
	public void setPVMonstre(int new_pv_monstre) {
		this.pv_monstre=new_pv_monstre;
	}
	public void setDefenseMonstre(int new_def_monstre) {
		this.defense=new_def_monstre;
	}
	
    public void mourir() {
        pv_monstre= 0;
        System.out.println("Le monstre est mort");
    }
    public void rendreVulnerable() {
    	this.defense=(int)defense/2;
    	System.out.println("Le monstre est vulnérable");
    }
	
	public void monstreAttaque(Javalt javalt) {
		javalt.removePV(attaque);
		System.out.println("Vous subissez "+ attaque +" degats !");
	}
	
	public boolean Vivant() {
		return this.pv_monstre > 0;
	}

	public double getExperience() {
		// TODO Auto-generated method stub
		return this.experience_monstre;
	}

	public int getNiveauMonstre() {
		// TODO Auto-generated method stub
		return this.niveau_monstre;
	}
	
	
}
	
