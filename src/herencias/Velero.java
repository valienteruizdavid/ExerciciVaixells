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
public class Velero extends BarcoPasajero {
    private int velas;

    public Velero(int velas, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(camarotes, pasajeros, motor, eslora, manga, nudos, peso);
        this.velas = velas;
        this.nombre = "SuperVent";
    }

    @Override
    public void arranca() {
        System.out.println("Arrancando velero...");
    }

    @Override
    public void atraca() {
        System.out.println("Atracando velero...");
    }

    
    
}
