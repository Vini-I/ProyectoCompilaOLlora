/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Parabrisas;

import Piezas.Encendible;

/**
 *
 * @author rodol
 */
public class LimpiaParabrisas implements Encendible {
    
    private static final String[] velocidadesLista = {"Apagado", "Baja", "Media", "Alta"};
    private int indiceVelocidad;
    private boolean encendido;

    public boolean isEncendido() {
        return encendido;
    }

    public int getIndiceVelocidad() {
        return indiceVelocidad;
    }

    public void setIndiceVelocidad(int indiceVelocidad) {
        if (indiceVelocidad >= 0 && indiceVelocidad < velocidadesLista.length) {
            this.indiceVelocidad = indiceVelocidad;
        }
    }
    
    public String getNombreVelocidad(){
        return velocidadesLista[indiceVelocidad];
    }

    public LimpiaParabrisas() {
        this.indiceVelocidad = 0;
        this.encendido = false;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
        this.indiceVelocidad = 0;
    }
    
}
