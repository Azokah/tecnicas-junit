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
public class Pasaje {
    
    private String posicion;
    private Vuelo vuelo;
    private Pasajero pasajero;

    public Pasaje(String posicion, Vuelo vuelo, Pasajero pasajero) {
        this.posicion = posicion;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
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





}
