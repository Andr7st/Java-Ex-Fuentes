package paquete;
/**
 * @author Andrés Segura
 * @author Andr7st
 * 
 * Obtener los nombres de la fuentes (letras) instaladas en el sistema.
 */

import java.awt.GraphicsEnvironment;

public class Main {
    public static void main(String[] args) {

        Sistema s = new Sistema();

        s.MisFuentes();
    }
}

class Sistema {

    public void MisFuentes(){

        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        System.out.println("Hay " + fuentes.length + " fuentes instaladas en tu sistema.");

        System.out.println("Numero \t Fuente \n");

        for(int i=0; i<fuentes.length; i++){

            System.out.println((i+1) + " \t " + fuentes[i]);

        }
    }
}