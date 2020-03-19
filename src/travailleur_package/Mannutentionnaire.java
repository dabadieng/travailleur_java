package travailleur_package;

public class Mannutentionnaire extends Employee {
	private final static double REVENU_HORAIRE = 65;
	protected double heure;

	public Mannutentionnaire(String nom, String prenom, int age, double heure) {
		super(nom, prenom, age);
		this.setHeure(heure);
	}

	public double calculSalaire() {
		return getHeure() * REVENU_HORAIRE;
	}

	public double getHeure() {
		return heure;
	}

	public void setHeure(double heure) {
		if (heure < 0)
			this.heure = 0;
		else
			this.heure = heure;
	}

}
