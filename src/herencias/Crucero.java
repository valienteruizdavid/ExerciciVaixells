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
public class Crucero extends BarcoPasajero{
    private int piscina;

    public Crucero(int piscina, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(camarotes, pasajeros, motor, eslora, manga, nudos, peso);
        this.piscina = piscina;
        this.nombre = "MSC";
    }
    
    @Override
    public void arranca() {
        System.out.println("Arrancando crucero..");
    }

    @Override
    public void atraca() {
        System.out.println("Atracando crucero..");
    }

    
    
    
}
