package travailleur_package;

public class AgeException extends Exception {
	
	public AgeException() {
		System.out.println("vous essayer d'instancier un objet avec un age négatif"); 
	}

}
