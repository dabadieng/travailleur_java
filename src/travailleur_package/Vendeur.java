package travailleur_package;

public class Vendeur extends Commercial {

	protected double prime;
	protected double salaire;

	public Vendeur(String nom, String prenom, int age, double ca) {
		super(nom, prenom, age, ca);
		this.prime = 400;
	}

	public double calculSalaire() {
		this.salaire = super.getSalaire() + this.prime; 		
		return this.salaire;
	}

}
