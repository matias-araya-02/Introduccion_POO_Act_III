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
 * Clase que representa un domicilio.
 * Demuestra encapsulamiento: atributos privados y método público para acceso controlado.
 */
public class Domicilio {
    private String calle;
    private int altura;
    private String barrio;

    public Domicilio(String calle, int altura, String barrio) {
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;
    }

    /**
     * Método público que devuelve el domicilio como una cadena legible.
     * Ejemplo de abstracción: oculta los detalles internos y muestra solo lo necesario.
     */
    public String domicilioComoCadena() {
        return calle + " " + altura + ", " + barrio;
    }
}
