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
public abstract class BarcoPasajero extends Barco {
    private int camarotes;
    private int pasajeros;

    public BarcoPasajero(int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor, eslora, manga, nudos, peso);
        this.camarotes = camarotes;
        this.pasajeros = pasajeros;
    }
    
    public void arranca(){
        
    }
    
    public void atraca(){
        
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonamos el barco corriendo");
    }

    @Override
    public void comportamiento() {
        System.out.println("Nos escondemos");
    }
    
    
    
    
    
    
}
