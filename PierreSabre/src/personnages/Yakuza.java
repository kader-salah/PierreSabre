package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 4;
	
	
	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int sommeExtorque = victime.seFaireExtorquer();
		setArgent(getArgent() + sommeExtorque);
		parler("J’ai piqué les " + sommeExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()  +" sous dans ma poche. Hi ! Hi !");
		
	}
	
	public int perdre() {
		int argentPerdu = getArgent();
		setArgent(0);
		assert reputation >= 0 : "reputation minimale est zéro";
		reputation--;
		parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		setArgent(getArgent() + gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
}
