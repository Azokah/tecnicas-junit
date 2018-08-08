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
public class Aeropuerto {
    
    private String codigo;
    private String nombre;
    private String ciudad;
    private String pais;

    public Aeropuerto(String codigo, String nombre, String ciudad, String pais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
