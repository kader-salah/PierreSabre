package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	private int force = 2 * honneur;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = (int) (0.1 * getArgent());
		beneficiaire.setArgent(beneficiaire.getArgent() + argentDonne);
		parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous.");
		beneficiaire.recevoir(argentDonne);
	}
	
	public void provoquer(Yakuza adversaire) {
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t’ai eu petit yakusa!");
			int argentGagne = adversaire.perdre();
			setArgent(getArgent() + argentGagne);
			honneur++;
			
		} else {
			int argentPerdu = getArgent();
			setArgent(0);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentPerdu);
			assert honneur >= 0 : "honneur minimale est zéro";
			honneur--;
		}
	}
}

