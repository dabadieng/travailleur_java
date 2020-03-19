package travailleur_package;

public class Production extends Employee {
	private final static double REVENU_UNITE = 5;
	protected int unite;

	public Production(String nom, String prenom, int age, int unite) {
		super(nom, prenom, age);
		this.setUnite(unite);
	}

	public double calculSalaire() {
		return getUnite() * REVENU_UNITE;
	}

	public int getUnite() {
		return unite;
	}

	public void setUnite(int unite) {
		if (unite < 0)
			this.unite = 0;
		else
			this.unite = unite;
	}

}
