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

    public boolean isIntensidadLuz() {
        return intensidadLuz;
    }

    public LuzCarro() {
        this.intensidadLuz = false;
    }
    
    
    public void cambiarIntensidad(){
        if (this.intensidadLuz){
            this.intensidadLuz = false;
        }else{
            this.intensidadLuz = true;
        }
    }
    
}
