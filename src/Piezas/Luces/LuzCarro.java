/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Luces;

/**
 *
 * @author rodol
 */
public class LuzCarro extends Luz {
    
    private boolean intensidadLuz;
    private boolean activa;

    public boolean isIntensidadLuz() {
        return intensidadLuz;
    }

    public LuzCarro() {
        this.intensidadLuz = false;
        this.activa = false;
    }

    public boolean isActiva() {
        return activa;
    }
    
    public void activar() {
        this.activa = true;
    }
    
    public void desactivar() {
        this.activa = false;
    }
    
    public void cambiarIntensidad(){
        if (this.intensidadLuz){
            this.intensidadLuz = false;
        }else{
            this.intensidadLuz = true;
        }
    }
    
}
