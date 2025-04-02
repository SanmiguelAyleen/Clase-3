/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.terceraclase;

/**
 *
 * @author aylee
 */
public class TerceraClase {

    public static void main(String[] args) {

        //**WHILE** SE EJECUTA MIENTRAS LA CONDICION SEA VERDADERA, SINO NO LO HACE.
        int contador = 5;
        while (contador < 5) {
            contador++;
            System.out.println("" + contador);
        }
        //----------------------------------------------------------------------
        //**DO-WHILE** SE EJECUTA UNA VEZ, NO IMPORTA QUE LA CONDICION SEA FALSA.
        int contadorDos = 5;
        do {
            contadorDos++;
            System.out.println("" + contadorDos);
        } while (contadorDos < 5);
        //----------------------------------------------------------------------
        //1.
        /*Escriba un programa que calcule el area de un rectangulo.
        Determine al usuario el ancho y la altura del rectangulo.
        Imprimir el area calculada.*/
        float altura = 4;
        float base = 2;
        float area = 0;
        area = base * altura;
        System.out.println("La altura del rectangulo es: " + area);
        //----------------------------------------------------------------------
        //2.
        /*Escribe un programa que determine si un numero entero
        Imprime si el numero ingresado es positivo.*/
        int num = 2;
        if (num > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
        //----------------------------------------------------------------------
        //3.
        /*Escribe un programa que determine si un numero es par o impar*/
        int numDos = 10;
        int op = numDos % 2;
        if (op == 0) {
            System.out.println("El numero es par");
        } else {
            if (op != 0) {
                System.out.println("El numero es impar");
            }
        }
        //----------------------------------------------------------------------
        //4.
        /*Escriba un programa si un estudiante aprueba o reprueba segun su nota.
        mayor a 90, "Excelente"
        70 - 89, "Aprobado"
        menor 70, "Reprobado"*/
        int nota = 70;
        if (nota >= 0 && nota <= 100) {
            if (nota >= 90) {
                System.out.println("EXCELENTE");
            } else if (nota >= 70 && nota <= 89) {
                System.out.println("APROBADO");
            } else if (nota < 70) {
                System.out.println("REPROBADO");
            }
        } else {
            System.out.println("LA NOTA INGRESADA ES INVALIDA");
        }
    }
}
