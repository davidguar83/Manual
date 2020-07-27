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
public class Ejemplo_Lamina_Texto {
    
    
    public static void main(String[]arg){
        
        MarcoTexto Marcotexto = new MarcoTexto();
        
        Marcotexto.setVisible(true);
        
        Marcotexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
    }
    
    
}


class MarcoTexto extends JFrame{

    public MarcoTexto() {
        
        
        setBounds(200, 200, 400, 400);
        
        setTitle("Lamina con texto");
        
        
        
        
        
    }
    
    
    
    
}

class LaminaTexto extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
    }
   
    
    
    
    
    
    
    
    
}
