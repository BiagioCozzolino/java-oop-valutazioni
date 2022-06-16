package jana60.valutazioni;

import java.util.Scanner;

import jana60.shop.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Ciao, benvenuto nel nuovo programma di valutazioni!");
		
		System.out.print("Inserisci quanti Alunni vuoi inserire: ");
		int sceltautente = scan.nextInt();
	
		Studente[] listastudenti = new Studente[sceltautente];

		
		for (int i = 0; i < listastudenti.length; i++) {
			System.out.println("Inserisci marca: ");
			String marca = scan.nextLine();
			System.out.println("Inserisci nome: ");
			String nome = scan.nextLine();
			System.out.println("Inserisci prezzo: ");
			// Aggiunto il parse per evitare errori con lo scan int-double ecc.
			float prezzo = Float.parseFloat(scan.nextLine());
			System.out.println("Inserisci Iva: ");
			int iva = Integer.parseInt(scan.nextLine());
	}

}
