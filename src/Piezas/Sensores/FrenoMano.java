/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Sensores;

/**
 *
 * @author Brwni
 */
public class FrenoMano {
    private boolean activo;
    
    public void activar() {
        this.activo = true;
    }
    
    public void desactivar() {
        this.activo = false;
    }

    public boolean isActivo() {
        return activo;
    }

    public FrenoMano() {
        this.activo = true;
    }
    
    
}
