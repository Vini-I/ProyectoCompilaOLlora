/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Seguridad;

/**
 *
 * @author llean
 */
public class Alarma {
    private boolean armada;
    private boolean sonando;

    public boolean isArmada() {
        return armada;
    }

    public boolean isSonando() {
        return sonando;
    }


    public Alarma() {
        this.armada = false;
        this.sonando = false;
    }
    
    public void armar() {
        this.armada = true;
    }
    
    public void desarmar() {
        this.armada = false;
    }
    
    public void sonar() {
        this.sonando = true;
    }
    
    public void apagarAlarma() {
        this.sonando = false;
    }
}
