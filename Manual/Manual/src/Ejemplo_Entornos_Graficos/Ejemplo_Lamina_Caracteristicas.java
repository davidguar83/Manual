/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ejemplo_Lamina_Caracteristicas {

    public static void main(String[] args) {

        Marco marco1 = new Marco();

        marco1.setVisible(true);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Marco extends JFrame {

    public Marco() {

        Toolkit miResolucuion = Toolkit.getDefaultToolkit();

        Dimension resolucionPantalla = miResolucuion.getScreenSize();

        int altura = resolucionPantalla.height;
        int anchura = resolucionPantalla.width;

        setBounds(anchura / 4, altura / 4, anchura / 2, altura / 2);

        setTitle("Lamina con dibujos");

        LaminaDibujos lamina1 = new LaminaDibujos();

        add(lamina1);

    }

}

class LaminaDibujos extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponents(g);

        g.drawString("HOLA", 500, 250);

        g.drawRect(50, 50, 200, 200);

        g.drawLine(50, 50, 200, 200);

        g.drawArc(50, 50, 200, 200, 90, 150);

    }

}
