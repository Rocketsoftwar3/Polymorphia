package Polymorphia;

import java.util.ArrayList;

public class Javalt implements appliquerEffet {
	private int PV=100;
	private int niveau=1;
	private double experienceAcquise=0;
	private double experienceRequise=1000;
	private double mana=1000;
	private ArrayList<?> equipement;
	private Armes arme;
	private int degatJavalt;
	private ArrayList<Potions> potions_equipees;
	private int intcoins;
	private ArrayList<Sorts> sorts_appris;
	
	protected int getPV() {
		return this.PV;
	}
	protected double getMana() {
		return this.mana;
	}
	protected int getNiveau() {
		return this.niveau;
	}
	protected double getExperienceAcquise() {
		return this.experienceAcquise;
		
	}
 	protected ArrayList<?> getEquipement() {
		return this.equipement;
	}
	protected ArrayList<Potions> getPotions() {
		return this.potions_equipees;
	}

	protected Armes getArme() {
		return this.arme;
	}
	protected int getIntcoins() {
		return this.intcoins;
	}
	protected ArrayList<Sorts> getSorts() {
		return this.sorts_appris;
	}
	
	protected void setArme(Armes arme) {
		this.arme=arme;
	}
	protected void addExperienceAcquise(double new_experience) {		
		if (this.experienceAcquise+new_experience>=this.experienceRequise) {
			double rest_experience=this.experienceAcquise+new_experience-this.experienceRequise;
			niveau+=1;
			this.experienceAcquise=rest_experience;
			this.experienceRequise=this.niveau*1000;}
		else {
			this.experienceAcquise+=new_experience;					
		}
	}
 	protected void addPV(int soin) {
		this.PV+=soin;
		if (this.PV>100) {
			this.PV=100;
		}
	}
	protected void removePV(int degat) {
		this.PV-=degat;
		if(this.PV<0) {
			this.PV=0;
		}
	}
 	protected void addMana(double mana) {
		this.mana+=mana;
		if (this.mana>1000) {
			this.mana=1000;
		}
	}
 	protected void removeMana(double mana) {
		this.mana-=mana;
		if (this.mana<0) {
			this.mana=0;
		}
	}
 	protected void addEquipement(Object obj) {
 		if (this.equipement.contains(obj)) {
 			System.out.println("Vous ne pouvez pas avoir deux "+obj.toString()+" à la fois !");
 		}
 		
 	}
 	protected void addCoins(int coins) {
 		this.intcoins+=coins;
 	}
 	protected void removeCoins(int coins) {
 		this.intcoins-=coins;
 	}
 	protected void addSort(Sorts sort) {
 		this.sorts_appris.add(sort);
 	}
 	protected void addPotion(Potions potion) {
 		this.potions_equipees.add(potion);
 	}
 	protected void removePotion(Potions potion) {
 		this.potions_equipees.remove(potion);
 	}
 	protected void attaquer() {
 	
	

 	}
 	protected void defendre() {}
 	protected void boire_potion(Potions potion) {}
 	protected void lancer_sort(Sorts sort) {}
 	
	@Override
	public void appliquerEffetPotion(Potions potion) {
		switch(potion.getEffetPotion()) {
		case("vie"):
			this.PV+=30;
		case("degat"):
			this.

			
		// TODO Auto-generated method stub
		
	}
	@Override
	public void appliquerEffetSort(Sorts sort) {
		// TODO Auto-generated method stub
		
	}
 	}
