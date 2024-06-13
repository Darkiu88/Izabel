
package com.Programas;
/**
 *
 * @author Isabel Zamora Zamora
 */
// Clase Singleton
public class Singleton {

    // Variable estática que contiene la única instancia de la clase Singleton
    private static Singleton uniqueInstance;

    // Otras variables de instancia aquí

    // Constructor privado para evitar la creación de nuevas instancias
    private Singleton() {
        // Inicialización de variables de instancia
    }

    // Método estático para obtener la instancia única de la clase
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Otros métodos de la clase aquí
    public void showMessage() {
        System.out.println("Hello World! Este es un ejemplo del patrón de diseño Singleton.");
    }
}
