import entities.Circle;
import entities.Student;
import enums.TipoStudente;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Creo un nuovo studente
		Student studente1 = new Student(); // <-- I Costruttore
		// Per creare un nuovo studente richiamo uno dei suoi costruttori
		// In base a quali e quanti parametri inserisco nelle parentesi tonde, Java deciderà quale costruttore invocare
		studente1.sayHello();

		Student studente2 = new Student("Aldo");    // <-- II Costruttore
		studente2.sayHello();

		Student studente3 = new Student("Giovanni", "Storti");    // <-- III Costruttore
		studente3.sayHello();

		Student studente4 = new Student("Giacomo", "Poretti", false);    // <-- IV Costruttore
		studente4.sayHello();
		System.out.println(studente4.returnHello());

/*		System.out.println("Il nome dello studente 4 è: " + studente4.name);
		studente4.name = "Ajeje";
		System.out.println("Il nome dello studente 4 è: " + studente4.name);

		// Come NON si copiano gli oggetti
		Student studente5 = studente4; // Non sto semplicemente copiando le proprietà ma sto creando un riferimento allo stesso oggetto di sopra
		studente5.name = "Claudio";
		System.out.println("Il nome dello studente 5 è: " + studente5.name);
		System.out.println("Il nome dello studente 4 è: " + studente4.name);*/

		// ---------------------- METODI STATICI ---------------------------
		// Sono metodi che non necessitano della creazione di oggetti per poter essere utilizzati
		System.out.println(Math.sqrt(4)); // La classe Math è composta solo da metodi statici, ciò vuol dire che non c'è bisogno di creare un oggetto Math per poter usare i suoi metodi
		/*Math math = new Math();
		math.sqrt(4);*/
		System.out.println(Math.PI); // Inoltre nella classe Math ci sono anche un certo numero di attributi statici, quindi ancora una volta non avrò bisogno di creare un oggetto per accedervi

		System.out.println("L'attributo statico di student è: " + Student.school); // Essendo statico non ho bisogno di creare studenti per leggerlo/scriverlo

		System.out.println(Circle.calculateArea(50));

		// ------------------------- COMPARARE 2 OGGETTI ------------------------------------

/*		studente1.id = studente2.id;
		studente1.name = "asdsadsa";
		studente1.surname = studente2.surname;
		studente1.isFullStack = studente2.isFullStack;*/

		if (studente1.equals(studente2)) { // Non si comparano mai con la doppia uguaglianza
			System.out.println("Gli studenti sono uguali");
		} else {
			System.out.println("Sono diversi");
		}


		// ------------------------- STAMPARE OGGETTI IN CONSOLE ------------------------------------
		System.out.println(studente1); // Per gli oggetti nostri devo crearmi un metodo toString() (NON STATICO)
		System.out.println(studente2);

		String[] array = {"Ciao", "Mondo"};
		System.out.println(Arrays.toString(array)); // <-- Per stampare gli array esiste già un metodo (STATICO) .toString() che fa parte della classe Arrays

		System.out.println(TipoStudente.valueOf("FULLSTACK"));

		// --------------------------- INCAPSULAMENTO --------------------
		// Mettendo tutti gli attributi come PUBLIC, vuol dire che questi possono essere scritti/letti
		// in maniera anche potenzialmente pericolosa (soprattutto la scrittura)
/*		System.out.println(studente1.name); // <-- Se name è PRIVATE non posso accedervi nè in lettura
		studente1.name = "Ciccio"; // nè in scrittura*/
		// Per ovviare a questo problema si creano i metodi GETTER & SETTER
		// Il getter mi consente di leggere il valore di un attributo
		// Il setter mi consente di scrivere un nuovo valore per un attributo
		// Questo mi consente di stabilire quali attributi debbano venir letti/scritti
		System.out.println(studente1.getId()); // L'id è leggibile...
		// System.out.println(studente1.setId()); // ...ma non scrivibile perché ho deciso di non mettere il suo setter
		// Un ulteriore vantaggio dei setter è quello di poter anche ora eseguire della logica prima di sovrascrivere un attributo
		// Es: se non inserisci un nome più lungo di 3 caratteri non te lo accetto

	}

}