package travailleur_package;

public class Mannutentionnaire_risque extends Mannutentionnaire implements Arisque {

	
	public Mannutentionnaire_risque(String nom, String prenom, int age, double heure) {
		super(nom, prenom, age, heure);
		// TODO Auto-generated constructor stub
	}

	public double primeRisque() {
		return 200; 
	}
	
	public double calculSalaire() {
		return super.calculSalaire() + primeRisque(); 
	}
}
