package travailleur_package;

public abstract class Employee {
	protected String nom, prenom;
	protected int age;

	public Employee(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		
		//controle de l'âge 
		if (age < 0)
			this.age = 0;
		else
			this.age = age;

	}
	
	
	protected abstract double calculSalaire(); 

	protected  String getNom() {
		return nom;
	}

	protected String getPrenom() {
		return prenom;
	}

	protected int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return getClass() + " [nom=" + nom + ", prenom=" + prenom + "]";
	}
	

}
