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
public class Ferry extends BarcoPasajero {
    private int vehiculos;

    public Ferry(int vehiculos, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(camarotes, pasajeros, motor, eslora, manga, nudos, peso);
        this.vehiculos = vehiculos;
        this.nombre = "FerryPaseito";
    }
    
    @Override
    public void arranca() {
        System.out.println("Arrancand ferry..");
    }

    @Override
    public void atraca() {
        System.out.println("Atracando ferry..");
    }

    
    
}
