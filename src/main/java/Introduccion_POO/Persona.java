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
 * Clase que representa a una persona.
 * Aplica encapsulamiento con atributos privados y métodos públicos.
 * Cada persona tiene un domicilio y una cuenta bancaria (reutilización de clases).
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;   // Reutilización: persona tiene un domicilio
    private CuentaBancaria cuenta; // Reutilización: persona tiene una cuenta bancaria

    public Persona(String dni, String nombre, String apellido, Domicilio domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.cuenta = new CuentaBancaria(); // Cada persona tiene su propia cuenta bancaria
    }

    /**
     * Método para obtener el nombre completo de la persona (abstracción).
     */
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public void mostrarDatosBancarios() {
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Alias: " + cuenta.getAlias());
        System.out.println("Saldo: $" + cuenta.obtenerSaldo());
    }

    /**
     * Método que devuelve la cuenta bancaria asociada a la persona.
     */
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
}