package com.mycompany.izabel;



import java.util.Scanner;

abstract class Animal {
    public abstract void hacerSonido();
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra guauuuuu.");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato mauuuuuuulla.");
    }
}

class Pajaro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El pájaro canta.");
    }
}

class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("La vaca muuuuuuuuuge.");
    }
}

public class SonidoAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige un animal:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Pájaro");
        System.out.println("4. Vaca");
        int opcion = scanner.nextInt();

        Animal animal;
        switch (opcion) {
            case 1:
                animal = new Perro();
                break;
            case 2:
                animal = new Gato();
                break;
            case 3:
                animal = new Pajaro();
                break;
            case 4:
                animal = new Vaca();
                break;
            default:
                System.out.println("Opción inválida. Selecciona un número entre 1 y 4.");
                return;
        }

        animal.hacerSonido();
    }
}
