/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Motor;

/**
 *
 * @author Brwni
 */
public class Kilometraje {
    private int velocidad;
    private double distanciaMetros;
    private int distanciaKm;
    
    public void actualizarInfo(double rpm, double tiempoSegundos) {
        distanciaMetros += rpm * 0.007407 * tiempoSegundos;
        while (distanciaMetros >= 1000) {
            distanciaKm ++;
            distanciaMetros -= 1000;
        }
        
        this.velocidad = (int) ((rpm * 1.6) / 60);
    }
    
    
    
    public int getVelocidad() {
        return velocidad;
    }

    public double getDistanciaMetros() {
        return distanciaMetros;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }
    
    public double getTotalDistancia() {
        return distanciaKm + (distanciaMetros / 1000.0);
    }

    public Kilometraje() {
        this.distanciaMetros = 0;
        this.distanciaKm = 0;
        this.velocidad = 0;
    }
    
    
}
