/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Motor;

/**
 *
 * @author Brwni
 */
public class CajaCambios {
    private final double[] relaciones = {4.3, 0, 3.2, 2.1, 1.5, 1.0, 0.8};
    private final double relacionFinal = 3.9;
    private final double circunferenciaRueda = 1.6;
    
    private int marchaActual = 1;

    public void subirMarcha() {
        if (marchaActual < relaciones.length - 1) {
            marchaActual++;
        }
    }

    public void bajarMarcha() {
        if (marchaActual >= 1) {
            marchaActual--;
        }
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public String getMarchaTexto() {
        return switch (marchaActual) {
            case 0 -> "R";
            case 1 -> "N";
            default -> String.valueOf(marchaActual - 1);
        };
    }

    public double calcularVelocidad(int rpm) {
        if (marchaActual == 1) return 0.0;

        double relacionTotal = relaciones[marchaActual] * relacionFinal;

        return (rpm / relacionTotal) * circunferenciaRueda * 60.0 / 1000.0;
    }
}
