package com.Programas;

public class CalculoDescuento {
    private double precioOriginal;
    private double porcentajeDescuento;

    public CalculoDescuento(double precioOriginal, double porcentajeDescuento) {
        this.precioOriginal = precioOriginal;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double calcularPrecioConDescuento() {
        return precioOriginal - (precioOriginal * porcentajeDescuento / 100);
    }

    public static void main(String[] args) {
        CalculoDescuento cd = new CalculoDescuento(1000, 20);
        System.out.println("Precio con descuento: " + cd.calcularPrecioConDescuento());
    }
}
