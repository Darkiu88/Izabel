package com.Programas;

public class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] resolver() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            return null; // No hay soluciones reales
        }
        double sqrtDiscriminante = Math.sqrt(discriminante);
        double x1 = (-b + sqrtDiscriminante) / (2 * a);
        double x2 = (-b - sqrtDiscriminante) / (2 * a);
        return new double[]{x1, x2};
    }

    public static void main(String[] args) {
        EcuacionCuadratica ec = new EcuacionCuadratica(1, -3, 2);
        double[] soluciones = ec.resolver();
        if (soluciones != null) {
            System.out.println("Soluciones: x1 = " + soluciones[0] + ", x2 = " + soluciones[1]);
        } else {
            System.out.println("No hay soluciones reales.");
        }
    }
}
