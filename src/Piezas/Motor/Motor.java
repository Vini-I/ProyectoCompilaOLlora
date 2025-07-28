/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Motor;

/**
 *
 * @author Brwni
 */
public class Motor {
    private final int cc;
    private boolean encendido;
    private int rpm;

    private final int RPM_MAX = 8000;
    private final int RPM_MIN = 800;

    public Motor(int cc) {
        this.cc = cc;
        this.encendido = false;
        this.rpm = 0;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            rpm = RPM_MIN;
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            rpm = 0;
        }
    }

    public void acelerar() {
        if (encendido && rpm < RPM_MAX) {
            rpm += 300;
            if (rpm > RPM_MAX) rpm = RPM_MAX;
        }
    }

    public void desacelerar() {
        if (encendido && rpm > RPM_MIN) {
            rpm -= 200;
            if (rpm < RPM_MIN) rpm = RPM_MIN;
        }
    }

    public int getRPM() {
        if (encendido) {
            return rpm;
        } else {
            return 0;
        }
    }

    public boolean isEncendido() {
        return encendido;
    }

    public int getCC() {
        return cc;
    }
}
