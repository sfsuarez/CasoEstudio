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
public class Transmision {
    int no;
    List<Intento> intentos;

    public Transmision(int no, List<Intento> intentos) {
        this.no = no;
        this.intentos = intentos;
    }

    public Transmision() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public List<Intento> getIntentos() {
        return intentos;
    }

    public void setIntentos(List<Intento> intentos) {
        this.intentos = intentos;
    }
    
    
}
