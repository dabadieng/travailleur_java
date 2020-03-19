package travailleur_package;

public class Vendeur extends Commercial {

	private final static  double PRIME = 400;

	public Vendeur(String nom, String prenom, int age, double ca) {
		super(nom, prenom, age, ca);
	}

	public double calculSalaire() {
		return super.calculSalaire() + PRIME; 
	}

}
