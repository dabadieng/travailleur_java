package travailleur_package;

public abstract class Employee {
	protected String nom, prenom;
	protected int age;
	protected double salaire;

	public Employee(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;

		// controle de l'âge
		if (age < 0)
			this.age = 0;
		else
			this.age = age;
		
		//calcul du salaire 
		this.salaire = this.calculSalaire();

	}

	protected abstract double calculSalaire();

	protected String getNom() {
		return nom;
	}

	protected String getPrenom() {
		return prenom;
	}

	protected int getAge() {
		return age;
	}
	
	protected double getSalaire() {
		return salaire; 
	}
	
	public Employee ajouter(Employee salarie) {
		return salarie;
	}

	@Override
	public String toString() {
		return getClass() + " [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
