/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Piezas.Parabrisas;

/**
 *
 * @author rodol
 */
public enum VelocidadLimpiaParabrisas {
    
    APAGADO(0),
    BAJA(1),
    MEDIA(2),
    ALTA(3);
    
    private final int velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    private VelocidadLimpiaParabrisas(int velocidad) {
        this.velocidad = velocidad;
    }

    
    
}
