package travailleur_package;

public interface  Arisque {

	public  double primeRisque(); 
	
	public static void descris() {
		System.out.print("je travail avec les nouvelles interfaces ! "); 
	}
	default void nouveau() {
		System.out.print("voici la nouvelle methode defautl "); 
	}
}
