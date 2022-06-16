package jana60.valutazioni;

public class Studente {

	// Attributi
	int id;
	int percAssenze;
	double medVoti;

	// Costruttore
	Studente(int id, int percAssenze, double medVoti) {
		super();
		this.id = id;
		this.percAssenze = percAssenze;
		this.medVoti = medVoti;

		if (percAssenze > 25 && percAssenze < 50 && medVoti > 2) {
			System.out.println("L'alunno selezionato risulta Promosso");
		} else if (percAssenze < 25 && medVoti >= 2) {
			System.out.println("L'alunno selezionato risulta Promosso");
		} else {
			System.out.println("L'alunno selezionato risulta Bocciato");
		}

		// Metodi

	}
}
