/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] ventas = new double[2][5];
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double suma=0;
        double valor;

        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("A continuacion ingrese las ventas diarias de %s\n",
                    vendedores[i]);
            for (int h = 1; h < ventas[i].length; h++) {
                System.out.printf("Dia %s\n", h);
                double ventaIngresada = entrada.nextDouble();
                ventas[i][h] = ventaIngresada;
            }

        }
        for (int i = 0; i < ventas.length; i++) {
            for (int h = 0; h < ventas[i].length; h++) {
                valor = ventas[i][h];
                suma = suma + valor;
            }
        }
        System.out.printf("Vendedor(a) %s\nVendedor(a) %s\n"
                + "Ha realizado un total de %.2f en ventas",
                vendedores[0], vendedores[1], suma);
    }
}
