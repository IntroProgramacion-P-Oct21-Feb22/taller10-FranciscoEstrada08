/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        //variables
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        char nombre;
        String cadena = "";
        char [] iniciales = {'S', 'P', 'T'};
        
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columnas = 0; columnas < estudiantes[0].length; columnas++) {
                nombre = estudiantes[fila][columnas].charAt(0);
                for (int i = 0; i < iniciales.length; i++) {
                    if (nombre == (iniciales[i])) {
                        cadena = String.format("%s%s\n",
                                 cadena,
                                 estudiantes[fila][columnas]);
                    }
                }
            }
        }
        System.out.println(cadena);
    }
}
