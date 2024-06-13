package com.Programas;

public class InvertirCadena {
    private String cadena;

    public InvertirCadena(String cadena) {
        this.cadena = cadena;
    }

    public String invertir() {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static void main(String[] args) {
        InvertirCadena ic = new InvertirCadena("Hola Mundo");
        System.out.println("Cadena invertida: " + ic.invertir());
    }
}
