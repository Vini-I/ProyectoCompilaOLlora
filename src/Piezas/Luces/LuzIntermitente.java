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
    private Luz estadoLuz;
    

    public int getIntervaloMilisegundos() {
        return intervaloMilisegundos;
    }

    public LuzIntermitente() {
        this.intervaloMilisegundos = 1000;
        this.estadoLuz = new Luz();
    }
    
    public void alternarEstado(){
         if (estadoLuz.isEncendido()){
            estadoLuz.apagar();
        }else{
            estadoLuz.encender();
        }
    }
}
