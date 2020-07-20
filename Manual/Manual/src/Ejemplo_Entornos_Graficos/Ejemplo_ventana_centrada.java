/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Entornos_Graficos;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.Image;
/**
 *
 * @author david
 */
public class Ejemplo_ventana_centrada {
    
    public static void main(String[]args){
        
        
       VentanaCentrada marco1 = new VentanaCentrada();
       
       marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       marco1.setVisible(true);
        
        
    } 
    
    
}




 class VentanaCentrada extends JFrame{
    
    public VentanaCentrada(){
        
        Toolkit mipantalla=Toolkit.getDefaultToolkit(); //almacenamos en nuestro variable objeto nuetro sistema nativo de ventanas
        
        
        Dimension tamanoPantalla= mipantalla.getScreenSize(); // almacenamos en la variable objeto, el tamaño de la pantalla(anchoy alto) donde se ejecuta el programa. 
        
        int altura=tamanoPantalla.height;   //almacenamos en la variable altura, la altura  de nuestra pantalla
        int ancho=tamanoPantalla.width;        //almacena en la variable  anchura, la snchurs de nuestra pantalla 
        
        
        // vamos a crear la ventana 
        
        setSize(ancho/2, altura/2);
        setLocation(ancho/4, altura/4);
        
        setTitle("Marco centrado por toolkit");
        
        Image miLogo = mipantalla.getImage("src/Ejemplo_Entornos_Graficos/logo.jpg");
        
        setIconImage(miLogo);
        
    }
    
    
    
}




