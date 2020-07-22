/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ejemplo_Primera_Lamina {
    
     public static void main(String[] args){
         
         Marco_Texto lamina1 = new Marco_Texto();
         
         
         
         lamina1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
    
    
    
}



class Marco_Texto extends JFrame{ 

    public Marco_Texto() {
        
        setVisible(true);
        
        setBounds(600, 300, 500, 500);
        
        setTitle("Mi primera lamina con texto");
        
        Mi_Lamina lamina1 = new Mi_Lamina();
        
        add(lamina1);
        
    }
    
 
    
    
    
    
}



class Mi_Lamina extends JPanel{

   @Override
   public void paintComponent(Graphics g){
       
       super.paintComponent(g);
       
       g.drawString("ESTE EL PRIMER TEXTO", 100, 100);
       
   }
    
    
    
    
}
