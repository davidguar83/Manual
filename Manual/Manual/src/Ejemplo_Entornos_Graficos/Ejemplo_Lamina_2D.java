/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ejemplo_Lamina_2D {
    
    public static void main(String[]args){
        
        Marco_2D marco2d1 = new Marco_2D();
        
        marco2d1.setVisible(true);
        
        
        marco2d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    
}


class Marco_2D  extends JFrame{

    public Marco_2D() {
        
        
        
        setTitle("Lamina 2D");
        
        setBounds(300, 300, 600, 600);
        
        Lamina_2D lamina2D1 = new Lamina_2D();
        
        add(lamina2D1);
        
        
        
    }

    
    
    
    
}

class Lamina_2D extends JPanel{
    
    @Override
    public void paintComponent (Graphics g){

    super.paintComponent(g); 
    
    
    
    
    Graphics2D g2 = (Graphics2D)g;
    
    
    
    
    Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
    
    Ellipse2D elipse = new Ellipse2D.Double();
    
    g2.draw(rectangulo);
    
    elipse.setFrame(rectangulo);
    
   // elipse.setFrame(100, 100, 100, 100);
    
    g2.draw(elipse);
    
    g2.draw(new Line2D.Double(100, 100, 300, 250));
    
    
    double centrox = rectangulo.getCenterX();
    
    double centroy = rectangulo.getCenterY();
    
    
    double radio = 125;
    
    Ellipse2D circulo = new Ellipse2D.Double();
    
    circulo.setFrameFromCenter(centrox, centroy, centrox+radio, centroy+radio);
    
    g2.draw(circulo);
    
    
    int x = (int)centrox;
     int y = (int)centroy;
     
     
    
    g.drawString("CAROLINA", x,y);
   
    
    }
    
    
}
    
    
    
