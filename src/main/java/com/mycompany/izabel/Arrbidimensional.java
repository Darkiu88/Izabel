package com.mycompany.izabel;

/**
 *
 * @author Eduardo Perez Luna
 */
public class Arrbidimensional {

    public static void main(String[] args) {
        int[][] arrBidi = {
            {0, 1, 2, 0},
            {0, 3, 4, 0},
            {0, 5, 6, 7},
            {0, 8, 9, 0}
        };
        for (int filas = 0; filas <= arrBidi.length - 1; filas++) {
            for (int columnas = 0; columnas <= arrBidi.length - 1; columnas++) {
                System.out.println(arrBidi[filas][columnas] + "");

            }
            System.out.println("tamano del arreglo: " + arrBidi.length);

            System.out.println("Mi nombre es: Jose guadalupe Ruiz Morales");

            System.out.println(":::: Muestra tu fecha de nacimineto::::");
            System.out.println("       Dia: " + arrBidi[0][0] + "" + arrBidi[1][1]);
            System.out.println("       Mes: " + arrBidi[0][0] + "" + arrBidi[1][2]);
            System.out.println("       Ano: " + arrBidi[0][2] + "" + arrBidi[0][0] + "" + arrBidi[0][0] + "" + arrBidi[2][3]);

            System.out.println("Mi nombre es: Angel ignacio  Flores Quezada");

            System.out.println(":::: Muestra tu fecha de nacimineto::::");
            System.out.println("       Dia: " + arrBidi[0][1] + "" + arrBidi[2][3]);
            System.out.println("       Mes: " + arrBidi[0][1] + "" + arrBidi[0][2]);
            System.out.println("       Ano: " + arrBidi[0][2] + "" + arrBidi[0][0] + "" + arrBidi[0][0] + "" + arrBidi[2][3]);
        }

    }
}
