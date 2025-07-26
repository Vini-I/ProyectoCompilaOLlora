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
    private int indiceEstaciones;
    private static final String[] estacionesLista = {"Desconectado", "870 AM", "91.5 FM","93.9 FM"};
    private boolean bluetoothActivo;

    public boolean isEncendida() {
        return encendida;
    }
    
    public boolean isBluetoothActivo() {
        return bluetoothActivo;
    }

    public int getIndiceEstaciones() {
        return indiceEstaciones;
    }

    public void setIndiceEstaciones(int indiceEstaciones) {
        if (indiceEstaciones >= 0 && indiceEstaciones < estacionesLista.length) {
            this.indiceEstaciones = indiceEstaciones;
        }
    }
    
    public String getNombreEstaciones(){
        return estacionesLista[indiceEstaciones];
    }
    
    public Radio() {
        this.encendida = false;
        this.indiceEstaciones = 0;
        this.bluetoothActivo = false;
    }

    @Override
    public void encender() {
        this.encendida = true;
    }

    @Override
    public void apagar() {
        this.encendida = false;
        this.indiceEstaciones = 0;
    }
    
    public void activarBluetooth(){
        this.bluetoothActivo = true;
    }
    
    public void desactivarBluetooth(){
        this.bluetoothActivo = false;
    }
}
