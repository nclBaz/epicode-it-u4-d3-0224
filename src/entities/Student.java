package entities;

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

}
