package Polymorphia;

import java.util.ArrayList;
import java.util.Scanner;

public class Combat {
	private Javalt javalt;
	private Scanner scanner;
	private Monstre monstre;
	private static boolean tour;//0=javalt, 1= monstre
	
	public Combat(Javalt javalt,Monstre monstre) {
		this.javalt=javalt;
		this.monstre=monstre;
		Scanner scanner = new Scanner(System.in);
	}
	
	public boolean boucleCombat() {
		tour=false;
		while ((javalt.getPV()!=0)||(monstre.getPVMonstre()!=0)){
			if (tour==false) {
				boolean action=false;
				while(action=false) {						
					System.out.println("A votre tour de jouer");
					System.out.println("Vous pouvez attaquer, boire une potion ou jeter un sort.");
					String action_javalt=scanner.nextLine();
					switch(action_javalt) {
					case("attaquer"):
						javalt.attaquer(monstre);
						action=true;
						break;
					case("potion"):
						ArrayList<String> nom_potions=new ArrayList<String>();
						ArrayList<Potions> potions_dispos=new ArrayList<Potions>();
						for(Potions p:javalt.getPotions()) {
							nom_potions.add(p.getNomPotion());
							p.toString();
						System.out.println("Ecrivez le nom de la potion que vous voulez boire ou ecrivez revenir pour aller en arrière");
						String potion_bue= scanner.nextLine();
						if (potion_bue=="revenir") {
							continue;}
						if (nom_potions.contains(potion_bue)) {
							int index_potion=nom_potions.indexOf(potion_bue);
							javalt.appliquerEffetPotion(potions_dispos.get(index_potion));
							action=true;
							break;}
						else {
							System.out.println("Cette potion n'est pas disponible ou n'existe pas");
							continue;}}
						case("sorts"):
							ArrayList<String> nom_sorts=new ArrayList<String>();
							ArrayList<Sorts> sorts_dispos=new ArrayList<Sorts>();
							for(Sorts s:javalt.getSorts()) {
								nom_sorts.add(s.getNomSort());
								s.toString();
							System.out.println("Ecrivez le nom du sort que vous voulez lancer ou ecrivez revenir pour aller en arrière");
							String sort_lance= scanner.nextLine();
							if (sort_lance=="revenir") {
								continue;}
							if (nom_sorts.contains(sort_lance)) {
								int index_sort=nom_sorts.indexOf(sort_lance);
								javalt.appliquerEffetSort(sorts_dispos.get(index_sort),monstre);
								action=true;
								break;}
							else {
								System.out.println("Ce sort n'est pas disponible ou n'existe pas");
								continue;}}}
					tour=true;}}
			else {
				monstre.monstreAttaque(javalt);
				tour=false;}
			if((javalt.getPV()==0)){
				System.out.println("Perdu! A jamais sale nul");
				scanner.close();
				return false;}
			else if((monstre.getPVMonstre()==0)) {
				javalt.addExperienceAcquise(monstre.getExperience());
				scanner.close();
				return true;}
				
				
				
			
		
		
				
						
						
						
						
						}
		return tour;
						
					}
				
				
				}
			
			
			

