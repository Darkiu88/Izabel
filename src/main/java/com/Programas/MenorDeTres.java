package com.Programas;
public class MenorDeTres {
    private int num1;
    private int num2;
    private int num3;

    public MenorDeTres(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int calcularMenor() {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static void main(String[] args) {
        MenorDeTres mdt = new MenorDeTres(10, 20, 5);
        System.out.println("El menor de los tres números es: " + mdt.calcularMenor());
    }
}
