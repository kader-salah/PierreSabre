package personnages;

public class Humain {
	
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	
	
	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}


	public String getNom() {
		return nom;
	}
	

	public int getArgent() {
		return argent;
	}
	
	
	public void setArgent(int argent) {
		this.argent = argent;
	}


	public String prendreParole() {
		return '('+ nom +") - ";
	}
	
	public void parler(String texte) {
		
		System.out.println(prendreParole() + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if ( prix > argent) {
			parler("J'ai " + argent + " sous en poche. Je ne peux même pas m'o frir un.e " + bien + " à " + prix + " sous.");
		} else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'o frir un.e " + bien + " à " + prix + " sous." );
			argent -= prix;
		}
	}
	
	
	private void perdreArgent(int perte) {		
	}
	
	private void gagnerArgent(int gain) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
