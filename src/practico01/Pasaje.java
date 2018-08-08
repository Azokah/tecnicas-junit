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
public class Pasaje implements Producto{
    
    private String posicion;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private Float costo;

    public Pasaje(String posicion, Vuelo vuelo, Pasajero pasajero, Float costo) {
        this.posicion = posicion;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.costo = costo;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }
    
    public String getPosicion() {
        return posicion;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public Float getPrecio() {
        throw new UnsupportedOperationException("Not supported yet.");   
    }





}
