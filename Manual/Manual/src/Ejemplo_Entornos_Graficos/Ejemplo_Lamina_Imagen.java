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

        setBounds(300, 200, 700, 700);

        LaminaImagen milaminaimagen = new LaminaImagen();

        add(milaminaimagen);

    }

}

class LaminaImagen extends JPanel {

    private Image imagen;

    public LaminaImagen() {

        try {

            imagen = ImageIO.read(new File("COCHE.png"));

        } catch (IOException e) {

            System.out.println("La imagen no se encuentra en la ruta descrita");

        }

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        //Graphics2D g2 = (Graphics2D)g;
        File miimagen = new File("COCHE.png");

        /*try {

        // imagen= ImageIO.read(new File("COCHE.png"));              forma abrebiado de declaracion de la imagen
            
        imagen = ImageIO.read(miimagen);

        } catch (IOException e) {

            System.out.println("La imagen no se encuentra en la ruta descrita");

        }*/
        
        
        // SI NO SABEMOS EL TAMAÑO DE LA IMAGEN LA CONSEGUIMOS CON LAAS DOS LINEAS SIGUIENTES
        
        
        
        int anchoImagen = imagen.getWidth(this);
        int altoImagen = imagen.getHeight(this);

        g.drawImage(imagen, 0, 0, null);

        for (int i = 0; i < 700; i++) {

            for (int j = 0; j < 700; j++) {
                
                if(i+j>0){
                
           

                g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen * i, altoImagen * j);        // SI NO SE PUSIERA EL IF, SE DIBUJA LA PRIMERA IMAGEN Y LA COPYA SE MONTA ENCIMA DE OTRA 
            }
            }

        }

        //g.copyArea(0, 0, 300, 300, 300, 300);          //sirve para copiar una imagen, 2 primeros parametros son para imdicar la localizacion del objeto a copiar, las 3y4 cuartas el tamaño que queremos copiar y las dos ultimas el lugar donde vamos a copiar la imagen.
    }

}
