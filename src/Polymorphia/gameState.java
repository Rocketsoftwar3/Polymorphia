package Polymorphia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class gameState {
	Scanner scanner;
	Javalt javalt;
	ArrayList<Monstre> monstre_aux_niv;
	Random r = new Random();
	
	public Monstre choixMonstre() {
		this.monstre_aux_niv=new ArrayList<Monstre>();
		int niv_javalt=javalt.getNiveau();
		for(Monstre m:Monstre.getMonstres()) {
			if (m.getNiveauMonstre()==niv_javalt) {
				this.monstre_aux_niv.add(m);}}
		int randint= r.nextInt(this.monstre_aux_niv.size());		
		return this.monstre_aux_niv.get(randint);}
	
	
	
	public void voyager() {
		System.out.println("Vous êtes dans une jolie ville. Alors petit Javalt, on va chasser du monstre ou acheter des trucs ?");
		System.out.println("1: chasser du monstre");
		System.out.println("2: être coquet");
		Scanner scanner= new Scanner(System.in);
		int choix= scanner.nextInt();
		switch(choix) {
		case(1):
			System.out.println("Fantastique, aallons tuer des êtres sans valeurs !");
			Combat c = new Combat(javalt,choixMonstre());
		case(2):
			System.out.println("Allons acheter des trucs nuls");
			
		
		}
		
		
		
		
	}
	
	

}
