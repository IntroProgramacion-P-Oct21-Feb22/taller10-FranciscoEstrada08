/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double[][] notas = {
            {9, 10, 7, 8},
            {10, 5, 7, 9},
            {7, 9.4, 10, 9}
        };
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "DAvid Bell"};
        
        double[] promedios = new double[3];
        double suma;
        double nota;

        for (int fila = 0; fila < notas.length; fila++) {
            suma = 0;
            for (int columna = 0; columna < notas[fila].length; columna++) {
                nota = notas[fila][columna];
                suma = suma + nota;
                promedios[fila] = suma / notas[fila].length;
            }
            
        }
        for (int fila = 0; fila < estudiantes.length; fila++) {
                System.out.printf("Estudiantes: %s tiene un promedio de %.2f\n",
                        estudiantes[fila],
                        promedios[fila]);
            }
    }

}
