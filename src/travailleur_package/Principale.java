package travailleur_package;

public class Principale {

	public static void main(String[] args) {
		Personnel p = new Personnel();
		Vendeur daba = null;
		try {
			 daba = new Vendeur("daba", "diing", 10, 100);
			/*p.ajouter(new Vendeur("aa", "dieng", 36, 3000));
			p.ajouter(new Representant("bb", "dieng", 40, 8000));
			p.ajouter(new Production("cc", "dieng", 40, 50));
			p.ajouter(new Mannutentionnaire("dd", "dieng", 40, 10));
			p.ajouter(new Production_risque("ee", "dieng", 40, 50));
			p.ajouter(new Mannutentionnaire_risque("ff", "dieng", 40, 10));*/
		} catch (AgeException e) {
		}

		p.affiche();
		System.out.print("le salaire moyen de l'entreprise est de : " + p.moyenne());

	}

}
