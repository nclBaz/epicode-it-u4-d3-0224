package entities;

import java.util.Objects;
import java.util.Random;

public class Student {
	public static String school = "Epicode";
	// Questa classe non dovrà essere eseguibile; mi servirà solo per definire un modello per stabilire quali siano le caratteristiche di tutti gli Studenti

	// LISTA ATTRIBUTI, ovvero le caratteristiche di uno studente
	public int id;
	public String name;
	public String surname;
	public boolean isFullStack;

	// LISTA COSTRUTTORI, ovvero come creerò uno studente, cioè definisco i valori dei suoi attributi
	// Se non metto nessun costruttore ci sarà quello "vuoto" di default

	// I Costruttore
	public Student() { // <-- Costruttore "vuoto"
		Random rndm = new Random();
		this.id = rndm.nextInt(1, 10000);
		this.name = "Nome di default";
		this.surname = "Cognome di default";
		this.isFullStack = true;
	}

	// II Costruttore
	public Student(String name) {
		Random rndm = new Random();
		this.id = rndm.nextInt(1, 10000);
		this.name = name;
		this.surname = "Cognome di default";
		this.isFullStack = true;
	}

	// III Costruttore
	public Student(String name, String surname) {
		Random rndm = new Random();
		this.id = rndm.nextInt(1, 10000);
		this.name = name;
		this.surname = surname;
		this.isFullStack = true;
	}

	// IV Costruttore
	public Student(String name, String surname, boolean isFullStack) {
		Random rndm = new Random();
		this.id = rndm.nextInt(1, 10000);
		// L'id potrebbe essere un esempio di valore non passato come parametro perché solitamente non è uno di quei valori decisi dall'utente
		// E' quindi molto importante quando si creano le classi ed i loro costruttori stabilire QUALI ATTRIBUTI DEBBANO VENIR PASSATI COME PARAMETRO
		// E QUALI INVECE DEBBANO VENIR INIZIALIZZATI DALL'APPLICAZIONE
		this.name = name;
		this.surname = surname;
		this.isFullStack = isFullStack;
	}

	// LISTA METODI, ovvero cosa uno studente può fare
	public void sayHello() {
		System.out.println("Ciao io sono " + this.name + " " + this.surname + ", il mio id è: " + this.id);
		// this si riferisce sempre all'oggetto corrente, qua sarebbe anche opzionale (ma per ora meglio abituarsi ad utilizzarlo)
	}

	public String returnHello() {
		this.sayHello(); // Siccome 'this' rappresenta l'oggetto corrente, posso anche richiamare un metodo da un altro
		return "CIAO";
	}

	@Override
	public boolean equals(Object o) { // Per poter comparare 2 oggetti devo implementarmi il metodo .equals() perché con == viene effettuato un controllo
		// Solo se i 2 sono lo stesso oggetto (stessa cella di memoria). Quindi se invece voglio creare una logica che dica che 2 oggetti sono uguali se hanno
		// stesso nome, stesso cognome, stesso id, ed entrambi sono fullstack, allora posso implementare questa logica nel metodo equals. Per fortuna
		// intelliJ consente di crearlo in maniera semiautomatica con tasto dx --> generate --> equals() and hashcode()
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return id == student.id && isFullStack == student.isFullStack && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
	}

	@Override
	public String toString() { // Anche per quanto riguarda la stampa di oggetti in un println(), il metodo di default non porta risultati soddisfacenti,
		// quindi possiamo sovrascrivere tale comportamento andando ad implementare il metodo toString()
		// intelliJ consente di crearlo in maniera semiautomatica con tasto dx --> generate --> toString()
		return "{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", isFullStack=" + isFullStack +
				'}';
	}
}
