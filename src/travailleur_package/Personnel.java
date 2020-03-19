package travailleur_package;

public class Personnel {
	private Employee equipe[];
	private final static int TAILLE = 100;
	private int nbSalarie;

	public Personnel() {
		this.equipe = new Employee[TAILLE];
		this.nbSalarie = 0;
	}

	public void ajouter(Employee e) {
		this.nbSalarie++;
		if (nbSalarie < TAILLE) {
			this.equipe[nbSalarie - 1] = e;
		} else {
			System.out.print("Vous ne pouvez pas rajouter un employé ");
		}
	}

	public double moyenne() {
		double total = 0;
		for (int i = 0; i < this.nbSalarie; i++) {
			total += equipe[i].calculSalaire();
		}
		return total / this.nbSalarie;
	}

	public void affiche() {
		for (int i = 0; i < this.nbSalarie; i++) {
			System.out.print(this.equipe[i]+" votre salaire est de "+equipe[i].calculSalaire()+"\n");
		}
	}

}
