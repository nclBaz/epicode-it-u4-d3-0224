package entities;

public class Circle {
	public double radius;

	public static double calculateArea(double radius) {
		return radius * radius * Math.PI;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
}
// Nel main
/*Circle c = new Circle();
c.getArea(); // Calcola l'area dell'oggetto corrente

Circle.calculateArea("2.0"); // Gli passo un qualsiasi raggio e mi calcola l'area del cerchio corrispondente*/
