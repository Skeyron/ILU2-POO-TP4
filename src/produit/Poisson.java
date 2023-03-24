package produit;



public class Poisson extends Produit {
	private String date;
	
	public Poisson(String date) {
		super("Poisson", Unite.PIECE);
		this.date = date;
	}

	@Override
	public String descriptionProduit() {
		return("poisson pêchés " + date );
	}
	
}