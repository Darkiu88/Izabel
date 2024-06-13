package com.Programas;

public class CalculoIntereses {
    private double principal;
    private double tasa;
    private int tiempo;

    public CalculoIntereses(double principal, double tasa, int tiempo) {
        this.principal = principal;
        this.tasa = tasa;
        this.tiempo = tiempo;
    }

    public double calcularInteresSimple() {
        return principal * tasa * tiempo;
    }

    public double calcularInteresCompuesto() {
        return principal * Math.pow((1 + tasa), tiempo) - principal;
    }

    public static void main(String[] args) {
        CalculoIntereses ci = new CalculoIntereses(1000, 0.05, 3);
        System.out.println("Interés Simple: " + ci.calcularInteresSimple());
        System.out.println("Interés Compuesto: " + ci.calcularInteresCompuesto());
    }
}
