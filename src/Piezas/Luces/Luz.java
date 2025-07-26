/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Luces;

import Piezas.Encendible;

/**
 *
 * @author rodol
 */
public class Luz implements Encendible{
    
    protected boolean encendido;
    
    public boolean isEncendido() {
        return encendido;
    }

    public Luz() {
        this.encendido = false;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    
    
}
