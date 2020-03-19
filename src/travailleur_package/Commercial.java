package travailleur_package;

public abstract class Commercial extends Employee {
	private final static double TAUX_VENTE = 0.20; 
	protected double ca; 

	public Commercial(String nom, String prenom, int age, double ca) {
		super(nom, prenom, age);
		this.setCa(ca);
	}
	
	public double getCa() {
		return this.ca;
	}

	public void setCa(double ca) {
		if (ca < 0)
			this.ca = 0;
		else
			this.ca = ca;
	}
	
	protected double calculSalaire() {
		return getCa() * TAUX_VENTE; 
	}



}
