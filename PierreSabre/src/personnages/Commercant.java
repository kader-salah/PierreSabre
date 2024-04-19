package personnages;

public class Commercant extends Humain {


	public Commercant(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public int seFaireExtorquer() {
		int sommeExtorque = getArgent();
		setArgent(0);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return sommeExtorque;
	}
	
	public void recevoir(int argent) {
		setArgent(argent);
		parler( argent + " sous ! Je te remercie généreux donateur!");
	}
}
