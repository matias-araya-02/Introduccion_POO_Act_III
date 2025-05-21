/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion_POO;

/**
 *
 * @author elmat
 */


/**
 * Clase que representa una empresa.
 * Aplica encapsulamiento en todos sus atributos y controla acceso a empleados mediante métodos.
 * Reutiliza la clase Domicilio y Persona.
 * Utiliza arreglo privado para guardar empleados (encapsulamiento y control).
 */
public class Empresa {
    private String razonSocial;
    private String cuit;
    private Domicilio domicilio;
    private Persona[] empleados;      // Arreglo privado de empleados (encapsulamiento)
    private int cantidadEmpleados = 0; // Control interno del número de empleados actuales

    public Empresa(String razonSocial, String cuit, Domicilio domicilio, int capacidadEmpleados) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.empleados = new Persona[capacidadEmpleados]; // Inicialización con tamaño fijo
    }

    /**
     * Método para contratar un empleado, controlando que no se pase la capacidad.
     * Ejemplo de encapsulamiento y validación para mantener consistencia interna.
     */
    public void contratar(Persona p) {
        if (cantidadEmpleados < empleados.length) {
            empleados[cantidadEmpleados] = p;
            cantidadEmpleados++;
            System.out.println("Contratado: " + p.nombreCompleto());
        } else {
            System.out.println("No se pueden contratar más empleados.");
        }
    }

    /**
     * Método que paga salarios a todos los empleados depositando en su cuenta bancaria.
     * Muestra cómo interactúan objetos para realizar operaciones (abstracción).
     */
    public void pagarSalarios(double monto) {
        for (int i = 0; i < cantidadEmpleados; i++) {
            empleados[i].getCuenta().depositar(monto);
            System.out.println("Se le depositó $" + monto + " a " + empleados[i].nombreCompleto());
        }
    }
}
