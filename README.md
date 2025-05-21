# Proyecto de Programación Orientada a Objetos (POO)

Este proyecto en Java es una simulación sencilla de una empresa que permite contratar empleados, gestionar sus cuentas bancarias y pagar salarios. A través de esta aplicación se ilustran conceptos clave de la Programación Orientada a Objetos, como:

- **Encapsulamiento**
- **Getters y Setters**
- **Modificadores de acceso (`public` y `private`)**
- **Reutilización de clases**
- **Abstracción**

## 🧠 Conceptos aplicados

### ✅ Encapsulamiento
Se utilizó para proteger los atributos sensibles de cada clase. Los atributos son `private` y el acceso a ellos se realiza mediante métodos públicos (`get` y `set`), lo cual permite mantener el control sobre cómo se accede y modifica la información interna de cada objeto.

Ejemplos:
- La clase `CuentaBancaria` encapsula `saldo`, `cbu` y `alias`.
- La clase `Empresa` controla internamente la cantidad de empleados contratados.

### 📥 Getters y Setters
Se implementaron para acceder y modificar atributos privados de forma segura y controlada.

- `getCuenta()` permite obtener la cuenta bancaria de una persona.
- `setAlias(String alias)` permite cambiar el alias de la cuenta bancaria, validando que no sea `null`.

### 🔒 Modificadores de acceso
- Se utilizaron `private` para restringir el acceso directo a atributos internos de las clases.
- Se utilizaron `public` en métodos que deben ser accesibles desde fuera de la clase.

### 🔁 Reutilización de clases
- La clase `Persona` reutiliza `Domicilio` y `CuentaBancaria`.
- La clase `Empresa` gestiona un arreglo de `Persona`.

### 🧩 Abstracción
Se crearon métodos que simplifican operaciones comunes, ocultando la lógica interna.

Ejemplos:
- `nombreCompleto()` en `Persona`
- `domicilioComoCadena()` en `Domicilio`
- `mostrarDatosBancarios()` en `Persona`

## 📂 Estructura del proyecto

- `Main.java`: clase principal donde se ejecuta el programa.
- `Persona.java`: representa a un empleado.
- `CuentaBancaria.java`: maneja el dinero y datos bancarios del empleado.
- `Empresa.java`: representa una empresa que contrata y paga a empleados.
- `Domicilio.java`: contiene datos de dirección para personas y empresas.

## 🚀 Ejecución

1. El usuario ingresa la cantidad de empleados a cargar.
2. Se ingresan datos personales y de domicilio.
3. Se contrata a cada empleado y se le crea una cuenta bancaria.
4. Se puede modificar el alias de la cuenta.
5. La empresa paga un salario a todos los empleados.
6. Se puede realizar una extracción de dinero de la cuenta del primer empleado.

## 🛠️ Requisitos

- Java 17 o superior
- IDE como NetBenas, IntelliJ IDEA, Eclipse, etc.

## 💡 Objetivo educativo

Este proyecto fue diseñado con fines pedagógicos para demostrar cómo se aplican los principios fundamentales de la POO en un sistema simple y práctico. Es ideal para estudiantes que están comenzando a familiarizarse con Java y los pilares de la orientación a objetos.
