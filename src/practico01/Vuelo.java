/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico01;

import java.util.Date;

/**
 *
 * @author lab14
 */
public class Vuelo {
    
    private Integer Id;
    private Date fechaSalida;
    private Float duracionHoras;
    private Float costoBase;
    private Aeropuerto destino;
    private Aeropuerto origen;
    private Avion avion;

    public Vuelo(Integer Id, Date fechaSalida, Float duracionHoras, Float costoBase, Aeropuerto destino, Aeropuerto origen, Avion avion) {
        this.Id = Id;
        this.fechaSalida = fechaSalida;
        this.duracionHoras = duracionHoras;
        this.costoBase = costoBase;
        this.destino = destino;
        this.origen = origen;
        this.avion = avion;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    public Integer getId() {
        return Id;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Float getDuracionHoras() {
        return duracionHoras;
    }

    public Float getCostoBase() {
        return costoBase;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setDuracionHoras(Float duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void setCostoBase(Float costoBase) {
        this.costoBase = costoBase;
    }
    
    
}
