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

	}

	// Metodi
	boolean promozioneStudente() {
		boolean promozione;
		if (percAssenze > 25 && percAssenze < 50 && medVoti > 2) {
			return promozione = true;
		} else if (percAssenze < 25 && medVoti >= 2) {
			return promozione = true;
		} else {
			return promozione = false;
		}
	}

}
