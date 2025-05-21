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
 * Clase principal que ejecuta la aplicación.
 * Permite cargar empleados, contratarlos, mostrar y modificar datos bancarios,
 * pagar salarios y realizar extracciones.
 * Demuestra interacción entre las clases Empresa, Persona, Domicilio y CuentaBancaria.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario la cantidad de empleados a cargar y la almacena
        System.out.print("¿Cuántos empleados desea cargar?: ");
        int cantidadEmpleados = Integer.parseInt(sc.nextLine());

        // Crea un arreglo para almacenar los empleados que se cargarán
        Persona[] empleados = new Persona[cantidadEmpleados];

        // Crea el domicilio de la empresa con datos fijos de ejemplo
        Domicilio domicilioEmpresa = new Domicilio("Mitre", 123, "Centro");

        // Crea la empresa con razón social, CUIT, domicilio y capacidad de empleados
        Empresa empresa = new Empresa("MendoIA S.A.", "30-12345678-9", domicilioEmpresa, cantidadEmpleados);

        // Muestra información de la empresa creada
        System.out.println("\nEmpresa creada: MendoIA S.A");
        System.out.println("Domicilio: " + domicilioEmpresa.domicilioComoCadena());

        // Carga de empleados y contratación
        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("\n--- Empleado " + (i + 1) + " ---");
            System.out.print("DNI: ");
            String dni = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Calle: ");
            String calle = sc.nextLine();
            System.out.print("Altura: ");
            int altura = Integer.parseInt(sc.nextLine());
            System.out.print("Barrio: ");
            String barrio = sc.nextLine();

            Domicilio domicilioEmpleado = new Domicilio(calle, altura, barrio);
            Persona nuevoEmpleado = new Persona(dni, nombre, apellido, domicilioEmpleado);

            // Contratar al empleado antes de mostrar datos bancarios
            empresa.contratar(nuevoEmpleado);

            // Mensaje de felicitaciones
            System.out.println("¡Felicitaciones " + nuevoEmpleado.nombreCompleto() + ", ha sido contratado por la empresa!");

            // Separador visual
            System.out.println("----------------------------------------");

            // Mostrar datos bancarios de la cuenta creada por la empresa
            System.out.println("Datos bancarios del empleado:");
            nuevoEmpleado.mostrarDatosBancarios();

            // Permitir cambiar el alias
            System.out.print("\n¿Desea cambiar el alias de la cuenta? (s/n): ");
            String cambiarAlias = sc.nextLine();
            if (cambiarAlias.equalsIgnoreCase("s")) {
                System.out.print("\nIngrese el nuevo alias: ");
                String nuevoAlias = sc.nextLine();
                nuevoEmpleado.getCuenta().setAlias(nuevoAlias);
                // Mostrar nuevamente los datos bancarios actualizados
                System.out.println("Datos bancarios actualizados:");
                nuevoEmpleado.mostrarDatosBancarios();
            }

            empleados[i] = nuevoEmpleado;
        }

        // Pago de salarios
        System.out.print("\nMonto de salario a pagar: ");
        double salario = Double.parseDouble(sc.nextLine());
        empresa.pagarSalarios(salario);

        // Mostrar saldo de cada empleado
        for (int i = 0; i < cantidadEmpleados; i++) {
            Persona p = empleados[i];
            System.out.println("Saldo de " + p.nombreCompleto() + ": $" + p.getCuenta().obtenerSaldo());
        }

        // Extracción de dinero de la cuenta del primer empleado
        System.out.print("\n¿Desea extraer dinero de la cuenta del primer empleado? (s/n): ");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese monto a extraer: ");
            double monto = Double.parseDouble(sc.nextLine());
            empleados[0].getCuenta().extraer(monto);
            System.out.println("Nuevo saldo: $" + empleados[0].getCuenta().obtenerSaldo());
        }

        sc.close();
    }
}