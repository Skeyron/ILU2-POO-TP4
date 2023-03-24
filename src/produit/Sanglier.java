package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poid;
	private Gaulois chasseur;
	
	
	
	public Sanglier( Unite unite, int poid, Gaulois chasseur) {
		super("Sanglier", unite);
		this.poid = poid;
		this.chasseur = chasseur;
	}


	@Override
	public String descriptionProduit() {

		return("Sanglier de " + poid + " chassé par " + chasseur );
	}
	
}
