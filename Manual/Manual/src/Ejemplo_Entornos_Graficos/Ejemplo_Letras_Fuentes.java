/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

/**
 *
 * @author david
 */
public class Ejemplo_Letras_Fuentes {

    public static void main(String[] args) {

        String fuentes = JOptionPane.showInputDialog("Introduce fuente letras");

        boolean comprobacionletra = false;

        String[] letrasfuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String nombreLetras : letrasfuentes) {

            if (nombreLetras.equals(fuentes)) {

                comprobacionletra = true;

            }

            //  System.out.println(nombreLetras); 
        }

        if (comprobacionletra) {

            System.out.println("Fuente de letra instalada");

        } else {

            System.out.println("Fuente de lerta no instalada");

        }

    }

}
