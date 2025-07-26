/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Radio;

import Piezas.Encendible;

/**
 *
 * @author rodol
 */
public class Radio implements Encendible {
    
    private boolean encendida;
    private String[] estaciones;
    private boolean bluetoothActivo;

    public boolean isEncendida() {
        return encendida;
    }

    public String[] getEstaciones() {
        return estaciones;
    }

    public boolean isBluetoothActivo() {
        return bluetoothActivo;
    }

    public Radio() {
        this.estaciones = new String[] {"Desconectado", "870 AM", "91.5 FM","93.9 FM"};
        this.encendida = false;
        this.bluetoothActivo = false;
    }

    @Override
    public void encender() {
        this.encendida = true;
    }

    @Override
    public void apagar() {
        this.encendida = false;
    }
    
    public void activarBluetooth(){
        this.bluetoothActivo = true;
    }
    
    public void desactivarBluetooth(){
        this.bluetoothActivo = false;
    }
    
    public String getIndiceDeEstaciones(int indice) {
        if (indice >= 0 && indice < estaciones.length) {
            return estaciones[indice];
        }
        return null;
    }
}
