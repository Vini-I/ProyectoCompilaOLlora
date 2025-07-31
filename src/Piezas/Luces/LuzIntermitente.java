/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas.Luces;

/**
 *
 * @author rodol
 */
public class LuzIntermitente {
    
    private int intervaloMilisegundos;
    private boolean activa;
    private Luz estadoLuz;
    

    public int getIntervaloMilisegundos() {
        return intervaloMilisegundos;
    }

    public LuzIntermitente() {
        this.intervaloMilisegundos = 1000;
        this.estadoLuz = new Luz();
        this.activa = false;
    }
    
    public void activar() {
        this.activa = true;
    }
    
    public void desactivar() {
        this.activa = false;
    }

    public boolean isActiva() {
        return activa;
    }
    
    public void alternarEstado(){
         if (estadoLuz.isEncendido()){
            estadoLuz.apagar();
        }else{
            estadoLuz.encender();
        }
    }
}
