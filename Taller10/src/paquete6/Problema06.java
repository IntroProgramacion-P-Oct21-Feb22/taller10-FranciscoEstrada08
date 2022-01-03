/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        
        int numCaracteres;
        int lim = 11;
        String cadena = "";
  
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columnas = 0; columnas < estudiantes[0].length; columnas++) {
                numCaracteres = estudiantes[fila][columnas].length();
                if (numCaracteres == lim) {
                    cadena = String.format("%s\n%s", cadena,
                             estudiantes[fila][columnas]);
                }
            }
        }
        System.out.println(cadena);
    }
}
