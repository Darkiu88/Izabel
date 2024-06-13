package com.Programas;

public class CodigoAscii {
    private int codigo;

    public CodigoAscii(int codigo) {
        this.codigo = codigo;
    }

    public char convertir() {
        return (char) codigo;
    }

    public static void main(String[] args) {
        CodigoAscii ca = new CodigoAscii(65);
        System.out.println("El carácter es: " + ca.convertir());
    }
}
