/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico01;

import java.util.ArrayList;

/**
 *
 * @author lab14
 */
public class Compra {
    
    private ArrayList<Producto> pasajes;
    private Float total;
    private Usuario comprador;

    public Compra(ArrayList<Producto> pasajes, Float total, Usuario comprador) {
        this.pasajes = pasajes;
        this.total = total;
        this.comprador = comprador;
    }

    public ArrayList<Producto> getPasajes() {
        return pasajes;
    }

    public Float getTotal() {
        return total;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setPasajes(ArrayList<Producto> pasajes) {
        this.pasajes = pasajes;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }
    
}
