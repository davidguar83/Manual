/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ejemplo_Lamina_Texto {

    public static void main(String[] arg) {

        MarcoTexto Marcotexto = new MarcoTexto();

        Marcotexto.setVisible(true);

        Marcotexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoTexto extends JFrame {

    public MarcoTexto() {

        setBounds(200, 200, 400, 400);

        setTitle("Lamina con texto");

        LaminaTexto miLaminaTexto = new LaminaTexto();

        add(miLaminaTexto);

        Toolkit mipantallatexto = Toolkit.getDefaultToolkit();

        // Image milogo = mipantallatexto.getImage("logo.jpg");
        // setIconImage(milogo);
        setIconImage(mipantallatexto.getImage("logo.jpg"));

        miLaminaTexto.setForeground(Color.red);  // cambia el color de todo lo quer escribamos en la lamina
    }

}

class LaminaTexto extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Font miFuente = new Font("Courier New", Font.ITALIC, 26);            // Font ( tipo letra(Arila,Courier), estilo(nredrita,cuesiva...), tamaño letra)

        g2.setFont(miFuente);

        //g2.setColor(Color.red);
        g2.drawString("David", 100, 100);

        g2.setFont(new Font("Arial", Font.BOLD, 30));

        //g2.setColor(Color.YELLOW.darker());
        g2.drawString("Carolina", 200, 200);

    }

}
