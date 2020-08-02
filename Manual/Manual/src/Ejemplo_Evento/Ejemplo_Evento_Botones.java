/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Evento;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ejemplo_Evento_Botones {
    
    
     public static void main(String[] args) {
         
         MarcoBotones marcoboton = new MarcoBotones();
         
         
         marcoboton.setVisible(true);
         
         marcoboton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
         
         
         
         
     }
     
     
     
}
    
    
    class MarcoBotones extends JFrame {

        public MarcoBotones() {
            
            setTitle(" Marco Botones");
            
            
            setBounds(700, 300, 600, 600);
            
            MiLaminaBoton milaminaboton = new MiLaminaBoton();
            
            add(milaminaboton);
            
            
            
            
            
            
            
        }
        
        
        
        
    }



class MiLaminaBoton extends JPanel implements ActionListener{
    
    
    JButton botonRojo = new JButton(" Rojo ");
    
    JButton botonVerde = new JButton(" Verde ");
    
    JButton botonAzul = new JButton(" Azul ");

    public MiLaminaBoton() {
        
        
        add(botonRojo);
        
        add(botonAzul);
        
        add(botonVerde);
        
        
        botonRojo.addActionListener(this);
        
        botonAzul.addActionListener(this);
        
        botonVerde.addActionListener(this);
        
        
    } 
    
         public void actionPerformed(ActionEvent e){
             
            Object botonPulsado=e.getSource();
             
             if (botonPulsado==botonRojo){
             
            
           setBackground(Color.red);
            
             }else if(botonPulsado==botonAzul){
                 
                 setBackground(Color.BLUE);
                 
             }else {
                 
                 setBackground(Color.GREEN);
                 
                 
             }
             
             
             
        }
        
        
        
        
        
    }
    
    
    
    

    

