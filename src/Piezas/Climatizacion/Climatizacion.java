/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Climatizacion;

import Piezas.Cambiable;
import Piezas.Encendible;

/**
 *
 * @author rodol
 */
public class Climatizacion implements Encendible, Cambiable {
    
    private boolean encendido;
    private int limiteTemperatura;
    private int indiceVelocidad;
    private static final String[] velocidadesLista = {"Apagado", "Baja", "Media", "Alta", "Muy Alta", "Maxima"};
    private static final String[] temperaturasLista = {"Apagado", "A/C", "Calefaccion"};

    public boolean isEncendido() {
        return encendido;
    }

    public int getLimiteTemperatura() {
        return limiteTemperatura;
    }

    public int getIndiceVelocidad() {
        return indiceVelocidad;
    }

    public void setLimiteTemperatura(int limiteTemperatura) {
        if (limiteTemperatura >= 18 && limiteTemperatura <= 23) {
            this.limiteTemperatura = limiteTemperatura;
        }
    }

    public Climatizacion() {
        this.encendido = false;
        this.limiteTemperatura = 18;
        this.indiceVelocidad = 0;
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
    
    @Override
    public void cambiar(int indiceVelocidad){
        if (indiceVelocidad >= 0 && indiceVelocidad < velocidadesLista.length) {
            this.indiceVelocidad = indiceVelocidad;
        }
    }
    
    public String getNombreVelocidades(){
        return velocidadesLista[indiceVelocidad];
    }
    
    public String getModoTemperatura(){
        if (!this.encendido){
            return temperaturasLista[0];
        }
        
        if (limiteTemperatura >= 18 && limiteTemperatura <= 20) {
            return temperaturasLista[1];
        } else if (limiteTemperatura >= 21 && limiteTemperatura <= 23) {
            return temperaturasLista[2];
        }else{
            return temperaturasLista[0];
        }
    }
    
    
}
