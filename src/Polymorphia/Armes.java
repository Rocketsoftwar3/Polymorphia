package Polymorphia;

public class Armes {
	private int degatArme;
	private int prixArme;
	private int typeArme;
	private String nomArme;
	private int tempsCoup;
	private boolean estInfuse;
	private int toursInfuses;
	private String typeInfusion;
	
	public Armes(int degatArme,int prixArme,int typeArme,String nomArme,int tempsCoup) {
		this.degatArme=degatArme;
		this.prixArme=prixArme;
		this.typeArme=typeArme;
		this.nomArme=nomArme;
		this.tempsCoup=tempsCoup;
		this.estInfuse=false;
		this.toursInfuses=0;
		
	}
	public Armes(int degatArme,int prixArme,int typeArme,String nomArme,int tempsCoup,boolean estInfuse,int toursInfuses,String typeInfusion) {
		this.degatArme=degatArme;
		this.prixArme=prixArme;
		this.typeArme=typeArme;
		this.nomArme=nomArme;
		this.tempsCoup=tempsCoup;
		this.estInfuse=estInfuse;
		this.toursInfuses=toursInfuses;
		this.typeInfusion=typeInfusion;
		
	}
	
	protected String getNomArme() {
		return this.nomArme;
	}
	protected int getDegatArme() {
		return this.degatArme;
	}
	protected int getPrixArme() {
		return this.prixArme;
	}
	protected int getTempsCoup() {
		return this.tempsCoup;
	}
	protected boolean getEstInfuse() {
		return this.estInfuse;
	}
	protected int getToursInfuses() {
		return this.toursInfuses;
	}
	protected void Infuser(int toursInfuses,String typeInfusion) {
		if (this.estInfuse==false) {
			this.estInfuse=true;
			this.toursInfuses=toursInfuses;
			this.typeInfusion=typeInfusion;
			this.degatArme+=30;
		}
		else {
			System.out.println("Arme déjà infusée,veuillez attendre "+this.toursInfuses+"avant de pouvoir infuser à nouveau votre arme !");
		}
	}

}
