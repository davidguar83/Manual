/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Evento;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class Ejemplo_Evento_Ventana {
    
    
    public static void main(String[]args){
        
        
        MarcoEventoVentana eventoVentana= new MarcoEventoVentana();
        
        
        eventoVentana.setVisible(true);
        
        eventoVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
    }
    
    
    
}





class MarcoEventoVentana extends JFrame{ 

    public MarcoEventoVentana() {
        
        
        setTitle(" Marco Evento Ventana ");
        
        setBounds(700, 300, 400, 400);
        
        setVisible(true);
        
        
        
    }
    
    
    
    
    
}




class EventoVentana implements WindowListener{

   
    
    @Override
    public void windowOpened(WindowEvent e) {
       
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
        System.out.println(" Ventana Minimizada");
        
       
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
    
    
    
}

