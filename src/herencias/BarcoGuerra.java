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
public abstract class BarcoGuerra extends Barco{
    
    private int cañones;
    
    public BarcoGuerra(int cañones, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor, eslora, manga, nudos, peso);
        this.cañones = cañones;
    }
    
    public void arranca(){
        //...
        System.out.println("Arrancando barco de guerra");
    }
    
    public void atraca(){
        //...
        System.out.println("Atracando barco de guerra");
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandona el barco ordenadamente");
    }

    @Override
    public void comportamiento() {
        System.out.println("Te reventamos a tiros");
    }
    
    
    
   
}
