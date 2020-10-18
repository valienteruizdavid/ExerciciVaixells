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
public class Yate extends BarcoPasajero {
    private boolean helipuerto;

    public Yate(boolean helipuerto, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        //Super llama al constructor de la superclase
        super(camarotes, pasajeros, motor, eslora, manga, nudos, peso);
        this.helipuerto = helipuerto;
        this.nombre = "LuxuryTravel";
    }

    @Override
    public void arranca() {
        System.out.println("Arrancando yate..");
    }

    @Override
    public void atraca() {
        System.out.println("Atracando yate..");
    }

    
    
    

    
    
}
