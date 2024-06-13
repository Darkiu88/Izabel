

/**
 * @author Isabel
 */
import java.util.Scanner;

// Definición de la clase Empleado
class Empleado {
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;
    private int horasExtras;
    private int minutosRetraso;

    // Constructor
    public Empleado(String nombre, double salarioPorHora, int horasTrabajadas, int horasExtras, int minutosRetraso) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.minutosRetraso = minutosRetraso;
    }

    // Método para calcular el salario del empleado
    public double calcularSalario() {
        double salario = (horasTrabajadas + horasExtras) * salarioPorHora;
        double descuento = minutosRetraso * (salarioPorHora / 60.0); // Descuento por minutos de retraso
        return salario - descuento;
    }

    // Método para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }
}
