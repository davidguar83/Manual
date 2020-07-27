/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ejemplo_Lamina_Colores {

    public static void main(String[] arg) {

        MarcoColores marcocolor1 = new MarcoColores();

        marcocolor1.setVisible(true);

        marcocolor1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoColores extends JFrame {

    public MarcoColores() {

        setTitle(" Marco con colores ");

        setLocationRelativeTo(null);

        setSize(500, 500);

        //setIconImage("logo.jpg");
        LaminaColor laminacolor = new LaminaColor();

        add(laminacolor);

        //laminacolor.setBackground(Color.red);
        laminacolor.setBackground(SystemColor.window);   //color por defecto de las ventanas de window

    }

}

class LaminaColor extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;          // casteo estas convirtiendo y almacenando el objeto(Graphics) g en el objeto(Graphics2D) g2 

        // Rectangulo
        Rectangle2D rectangulocolor = new Rectangle2D.Double(100, 100, 200, 150);

        g2.setPaint(Color.YELLOW);

        g2.draw(rectangulocolor);

        g2.setPaint(Color.blue);

        g2.fill(rectangulocolor);

        // Elipse 
        Ellipse2D elipsecolor = new Ellipse2D.Double();

        elipsecolor.setFrame(rectangulocolor);

        // Color micolor = new Color(98, 233, 16);
        //g2.setPaint(micolor);
        g2.setPaint(new Color(98, 233, 16).brighter().brighter().brighter().darker());            // gama de colores rgb  red,green,blue  // brighter = quita brillo //  darker = oscurecer el color

        // g2.setBackground(Color.black);   no funciona
        g2.fill(elipsecolor);

    }

}
