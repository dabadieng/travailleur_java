package travailleur_package;

public class Representant  extends Commercial{
	private final static double PRIME = 800;

	public Representant(String nom, String prenom, int age, double ca) {
		super(nom, prenom, age, ca);
	}
	
	public double calculSalaire() {
		return super.calculSalaire() + PRIME; 
	}
	
	

}
