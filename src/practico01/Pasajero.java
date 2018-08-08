/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico01;

/**
 *
 * @author lab14
 */
public class Pasajero {
    
    private Integer dni;
    private String nombre;

    public Pasajero(Integer dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
