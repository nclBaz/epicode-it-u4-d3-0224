import entities.Circle;
import entities.Student;

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

		System.out.println("Il nome dello studente 4 è: " + studente4.name);
		studente4.name = "Ajeje";
		System.out.println("Il nome dello studente 4 è: " + studente4.name);

		// Come NON si copiano gli oggetti
		Student studente5 = studente4; // Non sto semplicemente copiando le proprietà ma sto creando un riferimento allo stesso oggetto di sopra
		studente5.name = "Claudio";
		System.out.println("Il nome dello studente 5 è: " + studente5.name);
		System.out.println("Il nome dello studente 4 è: " + studente4.name);

		// ---------------------- METODI STATICI ---------------------------
		// Sono metodi che non necessitano della creazione di oggetti per poter essere utilizzati
		System.out.println(Math.sqrt(4)); // La classe Math è composta solo da metodi statici, ciò vuol dire che non c'è bisogno di creare un oggetto Math per poter usare i suoi metodi
		/*Math math = new Math();
		math.sqrt(4);*/
		System.out.println(Math.PI); // Inoltre nella classe Math ci sono anche un certo numero di attributi statici, quindi ancora una volta non avrò bisogno di creare un oggetto per accedervi

		System.out.println("L'attributo statico di student è: " + Student.school); // Essendo statico non ho bisogno di creare studenti per leggerlo/scriverlo

		System.out.println(Circle.calculateArea(50));
	}

}