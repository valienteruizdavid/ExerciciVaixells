/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author dvali
 */
public class PortaAviones extends BarcoGuerra{

    private int numAviones;
    
    public PortaAviones(int numAviones, int cañones, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(cañones, motor, eslora, manga, nudos, peso);
        this.numAviones = numAviones;
        this.nombre = "Portaaviones.s3448";
    }
    
    
    public void arranca(){
        //...
        System.out.println("Arrancando porta aviones...");
    }
    
    public void atraca(){
        //...
        System.out.println("Atracando porta aviones...");
    }
    
    
}
