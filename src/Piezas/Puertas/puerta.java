/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Puertas;

/**
 *
 * @author llean
 */
public class Puerta {
    private boolean abierta;
    private boolean bloqueada;

    public boolean isAbierta() {
        return abierta;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public Puerta() {
        this.abierta = false;
        this.bloqueada = false;
    }
    
    public void abrir() {
        this.abierta = true;
    }
    
    public void cerrar() {
        this.abierta = false;
    }
    
    public void bloquear() {
        this.bloqueada = true;
    }
    
    public void desbloquear() {
        this.bloqueada = false;
    }
}
