/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Motor;

/**
 *
 * @author Brwni
 */
public class Encendido {
    private boolean motorEncendido;

    public Encendido() {
        this.motorEncendido = false;
    }

    public void encenderMotor() {
            motorEncendido = true;
    }

    public void apagarMotor() {
            motorEncendido = false;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }


}
