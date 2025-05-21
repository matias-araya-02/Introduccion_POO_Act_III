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
 * Clase que representa una cuenta bancaria.
 * Encapsula atributos sensibles (saldo, cbu, alias) y controla acceso mediante métodos.
 * Incluye validación para evitar estados inválidos (saldo negativo).
 */
public class CuentaBancaria {
    private String cbu;
    private String alias;
    private double saldo;

    /**
     * Constructor que inicializa la cuenta con un CBU y alias aleatorios, y saldo en cero.
     */
    public CuentaBancaria() {
        this.cbu = generarCbu();
        this.alias = "alias" + (int)(Math.random() * 10000);
        this.saldo = 0; // saldo inicializado en cero, encapsulado
    }

    /**
     * Método privado para generar un CBU aleatorio (no accesible desde fuera).
     */
    private String generarCbu() {
        return "000" + (int)(Math.random() * 1000000);
    }

    /**
     * Método público para establecer un nuevo alias para la cuenta.
     * Valida que el alias no sea null ni vacío.
     */
    public void setAlias(String nuevoAlias) {
        if (nuevoAlias != null) {
            this.alias = nuevoAlias;
        } else {
            System.out.println("El alias no puede ser null.");
        }
    }

    /**
     * Método público para obtener el CBU de la cuenta.
     */
    public String getCbu() {
        return cbu;
    }

    /**
     * Método público para obtener el alias de la cuenta.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Método público para obtener el saldo actual (acceso controlado).
     */
    public double obtenerSaldo() {
        return saldo;
    }

    /**
     * Método para depositar dinero en la cuenta.
     * No se valida aquí monto positivo para simplicidad, pero se podría mejorar.
     */
    public void depositar(double monto) {
        saldo += monto;
    }

    /**
     * Método para extraer dinero, verifica si hay saldo suficiente (integridad).
     */
    public void extraer(double monto) {
        if (saldoSuficiente(monto)) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    /**
     * Método privado que valida si el saldo es suficiente para una extracción.
     */
    private boolean saldoSuficiente(double monto) {
        return saldo >= monto;
    }
}