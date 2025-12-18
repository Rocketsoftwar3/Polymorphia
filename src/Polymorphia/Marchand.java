package Polymorphia;

import java.util.ArrayList;

public class Marchand {
	private String arme;
	private String armure;
	private ArrayList<String> portion;
	private String sorts;
	private String materia;
	private int prix;
	
	public Marchand(String arme, String armure, ArrayList<String> portion, String sorts, String materia,int prix) {
		this.arme=arme;
		this.armure=armure;
		this.portion=portion;
		this.sorts=sorts;
		this.materia=materia;
		this.prix=prix;
	}
	public String getArme() {return arme;}

    public String getArmure() {return armure;}

    public ArrayList<String> getPortion() {return portion;}

    public String getSorts() {return sorts;}

    public String getMateria() {return materia;}
    
    public int getPrix() {return prix;}
   

    public void setArme(String arme) {this.arme = arme;}

    public void setArmure(String armure) {this.armure = armure;}

    public void setPortion(ArrayList<String> portion) {this.portion = portion;}

    public void setSorts(String sorts) {this.sorts = sorts;}

    public void setMateria(String materia) {this.materia = materia;}
    
    public void setPrix(int prix) {this.prix=prix;}
    
    
	
}
