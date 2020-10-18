
package herencias;


public class Bulkcarrier extends BarcoMercancias {
   
    private String tipoMineral;

    public Bulkcarrier(String tipoMineral, String tipoDeMercancia, int numContenedores, int limiteCargaPeso, 
            boolean esInflamable, String paisDestinatario, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tipoDeMercancia, numContenedores, limiteCargaPeso, esInflamable, paisDestinatario, motor, eslora, manga, nudos, peso);
        this.tipoMineral = tipoMineral;
        this.nombre = "MineralTransport";
    }

    @Override
    void arranca() {
        System.out.println("Arrancando bulkcarrier...");
    }

    @Override
    void atraca() {
        System.out.println("Atracando bulkcarrier...");
    }
    
    
    
    
}
