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
public class Modelo {
    
    private String nombre;
    private Integer cantidadPlazas;

    public Modelo(String nombre, Integer cantidadPlazas) {
        this.nombre = nombre;
        this.cantidadPlazas = cantidadPlazas;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidadPlazas() {
        return cantidadPlazas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadPlazas(Integer cantidadPlazas) {
        this.cantidadPlazas = cantidadPlazas;
    }
}
