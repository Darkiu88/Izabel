package com.mycompany.izabel;

import java.util.Scanner;

abstract class Figura {

	public abstract double calcularArea();
}

class Circulo extends Figura {

	private final double radio;

	public Circulo(double r) {
    	radio = r;
	}

	@Override
	public double calcularArea() {
    	return Math.PI * radio * radio;
	}
}

class Rectangulo extends Figura {

	private final double base;
	private final double altura;

	public Rectangulo(double b, double a) {
    	base = b;
    	altura = a;
	}

	@Override
	public double calcularArea() {
    	return base * altura;
	}
}

class Triangulo extends Figura {

	private final double base;
	private final double altura;

	public Triangulo(double b, double a) {
    	base = b;
    	altura = a;
	}

	@Override
	public double calcularArea() {
    	return base * altura / 2;
	}
}

class Paralelogramo extends Figura {

	private final double base;
	private final double altura;

	public Paralelogramo(double b, double a) {
    	base = b;
    	altura = a;
	}

	@Override
	public double calcularArea() {
    	return base * altura;
	}
}

public class AREAFIGURAS {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Elige una figura");
    	System.out.println("1. Círculo");
    	System.out.println("2. Rectángulo");
    	System.out.println("3. Triángulo");
    	System.out.println("4. Paralelogramo");
    	int opcion = scanner.nextInt();

    	Figura figura = null;
    	switch (opcion) {
        	case 1:
            	System.out.println("Ingresa el radio del círculo: ");
            	double radioCirculo = scanner.nextDouble();
            	figura = new Circulo(radioCirculo);
            	break;
        	case 2:
            	System.out.println("Ingresa la base del rectángulo: ");
            	double baseRectangulo = scanner.nextDouble();
            	System.out.println("Ingresa la altura del rectángulo: ");
            	double alturaRectangulo = scanner.nextDouble();
            	figura = new Rectangulo(baseRectangulo, alturaRectangulo);
            	break;
        	case 3:
            	System.out.println("Ingresa la base del triángulo: ");
            	double baseTriangulo = scanner.nextDouble();
            	System.out.println("Ingresa la altura del triángulo: ");
            	double alturaTriangulo = scanner.nextDouble();
            	figura = new Triangulo(baseTriangulo, alturaTriangulo);
            	break;
        	case 4:
            	System.out.println("Ingresa la base del paralelogramo: ");
            	double baseParalelogramo = scanner.nextDouble();
            	System.out.println("Ingresa la altura del paralelogramo: ");
            	double alturaParalelogramo = scanner.nextDouble();
            	figura = new Paralelogramo(baseParalelogramo, alturaParalelogramo);
            	break;
        	default:
            	System.out.println("Opción inválida");
            	return;
    	}

    	if (figura != null) {
        	System.out.println("Área de la figura: " + figura.calcularArea());
    	}
	}
}

