/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variables
        double[][] datos = new double[2][2];
        String cadena = "";
        for (int i = 0; i < datos.length; i++) {
            cadena = String.format("%s", cadena);
            for (int c = 0; c < datos.length; c++) {
                System.out.println("Ingrese un valor numérico");
                datos[i][c] = entrada.nextDouble();
                cadena = String.format("%s %.2f\n",cadena,datos[i][c]);
            }
        }
        System.out.printf("Los valores que han sido guardados son: %s\n", cadena);
    }
}
