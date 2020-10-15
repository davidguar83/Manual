/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class Serializando {

    public static void main(String[] args) throws ClassNotFoundException {

        Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);

        jefe.setIncentivo(5000);

        Empleado[] personal = new Empleado[3];

        personal[0] = jefe;

        personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);

        personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);

        try {

            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/david/Desktop/prueba clase file/empleado.txt"));

            escribiendo_fichero.writeObject(personal);

            escribiendo_fichero.close();

            ObjectInputStream recu_fichero = new ObjectInputStream(new FileInputStream("C:/Users/david/Desktop/prueba clase file/empleado.txt"));

            Empleado[] personal_recu = (Empleado[]) recu_fichero.readObject();

            recu_fichero.close();
            
            for(Empleado e: personal_recu){
                
                System.out.println(e);
                
            }
            

        } catch (IOException e) {

            System.out.println("Error");

        }

    }

}

class Empleado implements Serializable {

    private String nombre;
    private double sueldo;
    private Date fecha_contrato;

    public Empleado(String n, double s, int anho, int mes, int dia) {

        nombre = n;

        sueldo = s;

        GregorianCalendar calendario = new GregorianCalendar(anho, mes - 1, dia);
        fecha_contrato = calendario.getTime();

    }

    public double getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public void Subir_Sueldo(double porcentaje) {

        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", fecha_contrato=" + fecha_contrato + '}';
    }

}

class Administrador extends Empleado {

    private double incentivo;

    public Administrador(String n, double s, int anho, int mes, int dia) {

        super(n, s, anho, mes, dia);

        incentivo = 0;

    }

    public double getSueldo() {
        double sueldoBase = super.getSueldo();

        return sueldoBase + incentivo;
    }

    public void setIncentivo(double b) {

        incentivo = b;

    }

    @Override
    public String toString() {
        return super.toString() + "Incentivo= " + incentivo;
    }

}
