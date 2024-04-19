package personnages;

public class Humain {
	
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	
	
	
	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}


	public String getNom() {
		return nom;
	}
	

	public int getQuantiteArgent() {
		return quantiteArgent;
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
		if ( prix > quantiteArgent) {
			parler("J'ai " + quantiteArgent + " sous en poche. Je ne peux même pas m'o frir un.e " + bien + " à " + prix + " sous.");
		} else {
			parler("J'ai " + quantiteArgent + " sous en poche. Je vais pouvoir m'o frir un.e " + bien + " à " + prix + " sous." );
			perdreArgent(prix);
		}
	}
	
	
	public void perdreArgent(int perte) {
		quantiteArgent -= perte;
		
	}
	
	public void gagnerArgent(int gain) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
