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

		Student studente3 = new Student("Aldo", "Baglio");    // <-- III Costruttore
		studente3.sayHello();

		Student studente4 = new Student("Aldo", "Baglio", false);    // <-- IV Costruttore
		studente3.sayHello();
	}
}