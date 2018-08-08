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
public class Avion {
    
    private String codigo;
    private Modelo modelo;

    public Avion(String codigo, Modelo modelo) {
        this.codigo = codigo;
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
}
