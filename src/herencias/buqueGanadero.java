/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;


public class buqueGanadero extends BarcoMercancias {
    
    private String tipoGanado;

    public buqueGanadero(String tipoGanado, String tipoDeMercancia, int numContenedores, 
            int limiteCargaPeso, boolean esInflamable, String paisDestinatario, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tipoDeMercancia, numContenedores, limiteCargaPeso, esInflamable, paisDestinatario, motor, eslora, manga, nudos, peso);
        this.tipoGanado = tipoGanado;
        this.nombre = "el gallinero";
    }

    @Override
    void arranca() {
        System.out.println("Arrancando buque ganadero...");
    }

    @Override
    void atraca() {
        System.out.println("Atracando buque ganadero...");
    }
    
    
    
}
