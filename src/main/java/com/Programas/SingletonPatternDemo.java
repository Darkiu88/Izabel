package com.Programas;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        /**
         * Obtenemos la única instancia de Singleton usando el método getInstance()
         */
        Singleton singleton = Singleton.getInstance();
        
        /**
         * Intentar crear una nueva instancia de Singleton 
         * Esto no es posible debido al constructor privado 
         * Singleton singleton = new Singleton(); 
         */
        
        /**
         * Mostrar un mensaje usando el método de Singleton
         */
        singleton.showMessage();
    }
}
