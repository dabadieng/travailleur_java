package travailleur_package;

public abstract class Commercial extends Employee {
	protected double ca;
	protected double salaire;

	public Commercial(String nom, String prenom, int age, double ca) {
		super(nom, prenom, age);
		this.setCa(ca);
		this.salaire = 0;
	}

	protected double calculSalaire(double ca) {
		this.salaire = this.ca * 0.20;

		return this.salaire;
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

	public double getSalaire() {
		return this.salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
