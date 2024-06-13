package com.mycompany.izabel;


import java.util.Scanner;

class Empleado {
    private int diasLaborales;
    private int horasTrabajadas;
    private double salarioHora;
    private double descuentoRetardo;
    private int horasExtra;

    public Empleado(int diasLaborales, int horasTrabajadas, double salarioHora, double descuentoRetardo) {
        // this sirve para agregar mas valores a una variable 
        this.diasLaborales = diasLaborales;
        this.horasTrabajadas = horasTrabajadas;
        this.salarioHora = salarioHora;
        this.descuentoRetardo = descuentoRetardo;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }  

    public double calcularSalario() {
        double salario = diasLaborales * horasTrabajadas * salarioHora;
        salario -= descuentoRetardo;
        salario += horasExtra * (salarioHora * 1.5); 
        return salario;
    }
}

public class CalculoNomina {
    public static void main(String[] args) {

        // esto hace las preguntas y contesta dependiendo los valores 
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los días laborales:");
        int diasLaborales = scanner.nextInt();
        
        System.out.println("Ingrese las horas trabajadas por día:");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.println("Ingrese el salario por hora:");
        double salarioHora = scanner.nextDouble();
        
        System.out.println("Ingrese el descuento por retardo:");
        double descuentoRetardo = scanner.nextDouble();
        
        System.out.println("Ingrese las horas extra trabajadas:");
        int horasExtra = scanner.nextInt();
        
        Empleado empleado = new Empleado(diasLaborales, horasTrabajadas, salarioHora, descuentoRetardo);
        empleado.setHorasExtra(horasExtra);
        
        double salarioTotal = empleado.calcularSalario();
        System.out.println("El salario total del empleado es: " + salarioTotal);
    }
}
