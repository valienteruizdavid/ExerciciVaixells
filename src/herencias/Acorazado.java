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
public class Acorazado extends BarcoGuerra {
    private int cargasProfundidad;

    public Acorazado(int cargasProfundidad, int cañones, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(cañones, motor, eslora, manga, nudos, peso);
        this.cargasProfundidad = cargasProfundidad;
        this.nombre = "Acorazado.w109";
    }
    
    @Override
    public void arranca() {
        System.out.println("Arrancando Acorazado...");
    }

    @Override
    public void atraca() {
        System.out.println("Atracando Acorazado...");
    }
    
}
