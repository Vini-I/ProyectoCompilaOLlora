/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Sensores;

/**
 *
 * @author llean
 */
public class SensorReversa {
    private boolean personaDetectada;
    private boolean activo;
    
    public boolean isPersonaDetectada() {
        return personaDetectada;
    }

    public boolean isActivo() {
        return activo;
    }

    public SensorReversa() {
        this.personaDetectada = false;
        this.activo = false;
    }

    public void hayPersona() {
        this.personaDetectada = true;
    }
    
    public void noHayPersona() {
        this.personaDetectada = false;
    }
    
    public void iniciarSensor() {
        this.activo = true;
    }
    
    public void detenerSensor() {
        this.activo = false;
    }
}
