/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ejemplo_Lamina_Imagen {
    
    public static void main(String[]args){
        
        MarcoImagen marcoimagen = new MarcoImagen();
        
        
        marcoimagen.setVisible(true);
        
        marcoimagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    
    
    
}



class MarcoImagen extends JFrame{

    public MarcoImagen() {
        
        
        setTitle("Lamina con imagen");
        
        setBounds(500, 500, 500, 500);
        
        
        
       LaminaImagen milaminaimagen = new LaminaImagen();
       
       add(milaminaimagen);
        
        
        
        
    }
    
    
    
    
}



class LaminaImagen extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        
        
        super.paintComponent(g); 
    
        Graphics2D g2 = (Graphics2D)g;
        
        
        g2.getColor();
    
    
    
    }
    
    

    
    
}
