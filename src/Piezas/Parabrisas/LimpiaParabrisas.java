/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Parabrisas;

/**
 *
 * @author rodol
 */
public class LimpiaParabrisas {
    
    private VelocidadLimpiaParabrisas velocidad;

    public VelocidadLimpiaParabrisas getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(VelocidadLimpiaParabrisas velocidad) {
        this.velocidad = velocidad;
    }

    public LimpiaParabrisas() {
        this.velocidad = VelocidadLimpiaParabrisas.APAGADO;
    }

   
    
}
