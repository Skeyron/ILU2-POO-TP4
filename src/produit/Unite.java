package produit;

public enum Unite {
	LITRE("litre"),GRAMME("gramme"),KILOGRAMME("kilogramme"),CENTILITRE("centilitre"),MILILITRE("mililitre"), PIECE("pi�ce");
	
	private String nom;
	
	private Unite(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return nom;
	}
	
}
