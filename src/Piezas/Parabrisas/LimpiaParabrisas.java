/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Parabrisas;

import Piezas.Cambiable;
import Piezas.Encendible;

/**
 *
 * @author rodol
 */
public class LimpiaParabrisas implements Encendible, Cambiable {
    
    private int indiceVelocidad;
    private boolean encendido;

    public boolean isEncendido() {
        return encendido;
    }

    public int getIndiceVelocidad() {
        return indiceVelocidad;
    }

    public LimpiaParabrisas() {
        this.indiceVelocidad = 0;
        this.encendido = false;
    }

    @Override
    public void encender() {
        this.encendido = true;
        this.indiceVelocidad = 1;
    }

    @Override
    public void apagar() {
        this.encendido = false;
        this.indiceVelocidad = 0;
    }
    
    @Override
    public void cambiar(int indiceVelocidad) {
        if (indiceVelocidad >= 1 && indiceVelocidad <= 3) {
            this.indiceVelocidad = indiceVelocidad;
        }
    }
}
