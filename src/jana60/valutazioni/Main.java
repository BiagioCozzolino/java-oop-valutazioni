package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Ciao, benvenuto nel nuovo programma di valutazioni!");

		System.out.print("Inserisci quanti Alunni vuoi inserire: ");
		int sceltaUtente = scan.nextInt();

		Studente[] listaStudenti = new Studente[sceltaUtente];

		for (int i = 0; i < listaStudenti.length; i++) {
			System.out.println("Inserisci ID dello studente in ordine crescente: ");
			int id = scan.nextInt();

			System.out.println("Inserisci percentuale di assenze senza il simbolo percentuale: ");
			int percassenze = scan.nextInt();

			System.out.println("Inserisci la media dei voti dello studente: ");
			int medVoti = scan.nextInt();

			listaStudenti[i] = new Studente(id, percassenze, medVoti);
		}

		System.out.println("Ecco la lista degli alunni inseriti con esito della valutazione");

		int totalePromossi = 0;
		for (int i = 0; i < listaStudenti.length; i++) {
			System.out.println("Id studente: " + listaStudenti[i].id);
			System.out.println("Percentuale assenze studente: " + listaStudenti[i].percAssenze + "%");
			System.out.println("Media voti studente: " + listaStudenti[i].medVoti);

			if (listaStudenti[i].promozioneStudente()) {
				System.out.println("L'alunno risulta Promosso!");
				totalePromossi++;
			} else {
				System.out.println("L'alunno risulta Bocciato!");

			}
		}

		System.out.println("Numero di promossi totale degli alunni inseriti è di : " + totalePromossi);

		scan.close();
	}
}
