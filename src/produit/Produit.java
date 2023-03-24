package produit;


public abstract class Produit {
	private String nom;
	private Unite unite;
		
	public String getNom() {
		return nom;
	}

	public Produit(String nom, Unite unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}
	
	public abstract String descriptionProduit();
	
}
