/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;


import java.awt.Frame;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;
/**
 *
 * @author david
 */
public class Marcos_Ventanas_Frames {
    
    
    public static void main(String[] args){
        
        
        miMarco ventana1 = new miMarco();
        
        ventana1.setVisible(true);
        
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
    }
    
    
    
    
}


class miMarco extends JFrame{
    
    public miMarco(){
        
        //setSize(400, 400); // medicion en pixel   // tamaño ventana
        
        //setLocation(500, 300); // localizacion de apertura de ventana
        
        setBounds(500, 300, 400, 400); // hace lo mismo que los dos set anteriores
        
        
       // setResizable(false);// hace que la ventana sea fija, no se podria mover ni ampliar
        
        //setExtendedState(Frame.MAXIMIZED_BOTH);// marco o ventana a pantalla completa
         //setExtendedState(6);   hace lo mismo que el de arriba, le ponemos el valor equivalente a Frame.MAXIMIZED_BOTH
        
        setTitle("mi primera ventana");
        
    }
    
    
}
