package travailleur_package;

public class Production_risque extends Production implements Arisque {

	
	public Production_risque(String nom, String prenom, int age, int unite) {
		super(nom, prenom, age, unite);
		// TODO Auto-generated constructor stub
	}

	public double primeRisque() {
		return 200; 
	}
	
	public double calculSalaire() {
		return super.calculSalaire() + primeRisque(); 
	}
}
