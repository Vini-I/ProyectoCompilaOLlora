/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Seguridad;

/**
 *
 * @author llean
 */
public class Cinturon {
    private boolean puesto;

    public boolean isPuesto() {
        return puesto;
    }

    public Cinturon() {
        this.puesto = false;
    }
    
    public void poner() {
        this.puesto = true;
    }
    
    public void quitar() {
        this.puesto = false;
    }
}
