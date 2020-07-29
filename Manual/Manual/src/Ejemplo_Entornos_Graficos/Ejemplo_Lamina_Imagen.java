/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author david
 */
public class Ejemplo_Lamina_Imagen {

    public static void main(String[] args) {

        MarcoImagen marcoimagen = new MarcoImagen();

        marcoimagen.setVisible(true);

        marcoimagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoImagen extends JFrame {

    public MarcoImagen() {

        setTitle("Lamina con imagen");

        setBounds(500, 500, 500, 500);

        LaminaImagen milaminaimagen = new LaminaImagen();

        add(milaminaimagen);

    }

}

class LaminaImagen extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        //Graphics2D g2 = (Graphics2D)g;
        File miimagen = new File("COCHEee.png");
        
        
        try{
            
           // imagen= ImageIO.read(new File("COCHE.png"));              forma abrebiado de declaracion de la imagen
       imagen = ImageIO.read(miimagen);
        }
        catch(IOException e){
            
            System.out.println("La imagen no se encuentra en la ruta descrita");
            
        }
        
        g.drawImage(imagen, 5, 5, null);
        
    }

    private Image imagen;

}
