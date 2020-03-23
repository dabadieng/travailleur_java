
package travailleur_package;

public abstract class Employee {
	protected String nom, prenom;
	protected int age;
	protected double salaire;

	public Employee(String nom, String prenom, int age) 
		throws AgeException 
		{ 
			// controle de l'âge
			if (age < 0)
				throw new AgeException();
			else {
				this.nom = nom;
				this.prenom = prenom;
				this.age = age;
			}

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
	
	@Override
	public String toString() {
		return getClass() + " [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
