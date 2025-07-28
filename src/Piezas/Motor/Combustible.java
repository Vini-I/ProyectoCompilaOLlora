/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Motor;

/**
 *
 * @author Brwni
 */
public class Combustible {
    private double litrosActuales;
    private int porcentajeActual;
    private final double CAPACIDADMAXIMA = 65;
    
    public void calcularPorcentaje() {
        this.porcentajeActual = (int) ((litrosActuales / CAPACIDADMAXIMA) * 100);
    }
    
    public void consumir(double rpm, double cc, double tiempoSegundos) {
        double consumoActual = (rpm*cc) / 15 * (tiempoSegundos / 60.0);
        this.litrosActuales -= consumoActual;
        calcularPorcentaje();
    }
    
    public boolean recargar(double cantidad) {
        if (cantidad > 0){
            this.litrosActuales += cantidad;
            if (litrosActuales > CAPACIDADMAXIMA) {
                litrosActuales = CAPACIDADMAXIMA;
            }
            calcularPorcentaje();
            return true;
        }else {
            return false;
        }
    }

    public int getPorcentajeActual() {
        return porcentajeActual;
    }

    public double getLitrosActuales() {
        return litrosActuales;
    }

    public double getCAPACIDADMAXIMA() {
        return CAPACIDADMAXIMA;
    }

    public boolean estaEnReserva() {
    return porcentajeActual <= 10;
    }

    public boolean estaVacio() {
    return litrosActuales <= 0;
    }
    
    public Combustible() {
    this.litrosActuales = CAPACIDADMAXIMA;
    calcularPorcentaje();
    }
    
}
