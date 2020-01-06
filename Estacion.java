/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sfsuarez
 */
public class Estacion {
    String idStacion;
    int tiempo;
    int noAleatorio;
    int TxMb;

    public Estacion() {
    }

    public Estacion(String idStacion, int tiempo, int noAleatorio, int TxMb) {
        this.idStacion = idStacion;
        this.tiempo = tiempo;
        this.noAleatorio = noAleatorio;
        this.TxMb = TxMb;
    }

    public String getIdStacion() {
        return idStacion;
    }

    public void setIdStacion(String idStacion) {
        this.idStacion = idStacion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getNoAleatorio() {
        return noAleatorio;
    }

    public void setNoAleatorio(int noAleatorio) {
        this.noAleatorio = noAleatorio;
    }

    public int getTxMb() {
        return TxMb;
    }

    public void setTxMb(int TxMb) {
        this.TxMb = TxMb;
    }

    
    
    
    
    
}
