package com.mycompany.izabel;

import javax.swing.JOptionPane;

public class Carro {
    private String color;
    private String material;
    private String marca;

    public Carro(String material, String color, String marca) {
        this.material = material;
        this.color = color;
        this.marca = marca;
    }

    public Carro(String material, String marca) {
        this.material = material;
        this.marca = marca;
    }

    public Carro() {
    }

    public String Encender() {
        return "El carro está prendiendo.......";
    }

    public void Conduciendo(boolean instruction) {
        if (instruction) {
            JOptionPane.showMessageDialog(null, "El carro se está usando para conducir");
        } else {
            JOptionPane.showMessageDialog(null, "El carro no se está usando para conducir");
        }
    }

    public String Reversa() {
        return "El carro se está usando para ir de reversa";
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void cambiarColorAMorado() {
        this.color = "morado";
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola, nuestros nombres son Andrea y Eduardo");
        Carro carro = new Carro("aluminio", "Morado", "Audi");
        
        JOptionPane.showMessageDialog(null, "Atributos de la clase carro: Material " + carro.getMaterial()
                + ", color " + carro.getColor() + ", Marca " + carro.getMarca());
        
        JOptionPane.showMessageDialog(null, carro.Encender());
        carro.Conduciendo(true);
        JOptionPane.showMessageDialog(null, carro.Reversa());
        
        carro.cambiarColorAMorado();
        JOptionPane.showMessageDialog(null, "Muchas Grasias por ver");
    }
}
