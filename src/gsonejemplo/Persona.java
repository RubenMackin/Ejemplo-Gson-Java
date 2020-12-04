/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsonejemplo;

/**
 *
 * @author ruben
 */
public class Persona {
    private String nombre;
    private int edad;
    private String ocupacion;

    public Persona(String nombre, int edad, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", ocupacion=" + ocupacion + '}';
    }
    
    
}
