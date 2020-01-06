/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author sfsuarez
 */
public class Intento {
    int noIntent;
    
    List<Estacion> estaciones;

    public Intento() {
    }

    public Intento(int noIntent,  List<Estacion> estaciones) {
        this.noIntent = noIntent;
        
        this.estaciones = estaciones;
    }

    public int getNoIntent() {
        return noIntent;
    }

    public void setNoIntent(int noIntent) {
        this.noIntent = noIntent;
    }

    

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(List<Estacion> estaciones) {
        this.estaciones = estaciones;
    }
    
    
}
