/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Evento;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ejemplo_Evento_Botones_2 {

    public static void main(String[] args) {

        MarcoBotonesII marcobotonII = new MarcoBotonesII();

        marcobotonII.setVisible(true);

        marcobotonII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoBotonesII extends JFrame {

    public MarcoBotonesII() {

        setTitle(" Marco Botones");

        setBounds(700, 300, 600, 600);

        MiLaminaBotonII milaminabotonII = new MiLaminaBotonII();

        add(milaminabotonII);

    }

}

class MiLaminaBotonII extends JPanel {

    JButton botonRojoII = new JButton(" Rojo ");

    JButton botonVerdeII = new JButton(" Verde ");

    JButton botonAzulII = new JButton(" Azul ");

    public MiLaminaBotonII() {

        add(botonRojoII);

        add(botonAzulII);

        add(botonVerdeII);
        
        
        ColorFondo Rojo=new ColorFondo(Color.red);
        
        ColorFondo Azul = new ColorFondo(Color.blue);
        
        ColorFondo Verde = new ColorFondo(Color.GREEN);

        botonRojoII.addActionListener(Rojo);

        botonAzulII.addActionListener(Azul);

        botonVerdeII.addActionListener(Verde);

    }
    
    class ColorFondo implements ActionListener {
    
    private Color colorDeFondo;

    public ColorFondo(Color c) {
        
        colorDeFondo=c;

    }
    
    public void actionPerformed(ActionEvent e){
        
        
        setBackground(colorDeFondo);
        
        
    }

}
    
    
    
}



