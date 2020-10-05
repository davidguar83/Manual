/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Clase_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Creando {

    public static void main(String[] args) {

        File ruta = new File("c:" + File.separator + "Users" + File.separator + "david" + File.separator + "Desktop" + File.separator + "prueva clase file" + File.separator + " nuevo directorio" + File.separator + " prueba_texto");

        // ruta.mkdir();                         crea una nueva carpeta
        
        String archivo_destino=ruta.getAbsolutePath();
        
        try {
            ruta.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Escribiendo accede_es=new Escribiendo();
        
        accede_es.escribir(archivo_destino);
        
        
    }

}

class Escribiendo {

    public void escribir(String ruta_archivo) {

        String frase = "Esto es un ejemplo";

        try {

            FileWriter escritura = new FileWriter(ruta_archivo);

            for (int i = 0; i < frase.length(); i++) {

                escritura.write(frase.charAt(i));

            }

            escritura.close();

        } catch (IOException e) {

        }

    }

}
