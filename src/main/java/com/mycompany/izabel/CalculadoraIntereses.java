package com.mycompany.izabel;


import java.util.Scanner;

public class CalculadoraIntereses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el capital (c): ");
        double c = scanner.nextDouble();
        
        System.out.print("Ingrese la tasa de interés nominal (r) en tanto por ciento: ");

        double r = scanner.nextDouble();
        
        System.out.print("Ingrese el periodo de cálculo en días (t): ");
        int t = scanner.nextInt();
        
        // Cálculo de los intereses
        double I = (c * r * t) / (360 * 100);
        
        // Cálculo del capital acumulado
        double capitalAcumulado = c + I;
        
        // Salida de resultados
        System.out.println("Intereses producidos (I): " + I);
        System.out.println("Capital acumulado: " + capitalAcumulado);
        
        scanner.close();
    }
}
