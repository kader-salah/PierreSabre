package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = (int) (0.1 * getArgent());
		beneficiaire.setArgent(beneficiaire.getArgent() + argentDonne);
		parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous.");
		beneficiaire.recevoir(argentDonne);
	}
}
