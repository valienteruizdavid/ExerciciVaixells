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
public class Destructor extends BarcoGuerra {
    private int torpedo;

    public Destructor(int torpedo, int cañones, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(cañones, motor, eslora, manga, nudos, peso);
        this.torpedo = torpedo;
        this.nombre = "Destructor.h445";
    }

    @Override
    public void arranca() {
        System.out.println("Arrancando destructor..");
    }

    @Override
    public void atraca() {
        System.out.println("Atracando destructor..");
    }
    
    
    
    
}
