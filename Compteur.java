public class Compteur {
	
	private int valeur = 0;
	public void increment() { // +1 a la valeur
		this.valeur += 1;
	}
	
	public void affiche() {
		System.out.println(this.valeur);

	}
	
	public int getValeur() {
		return this.valeur;

	}

}
