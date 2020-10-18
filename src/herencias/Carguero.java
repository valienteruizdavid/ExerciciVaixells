
package herencias;

public class Carguero extends BarcoMercancias {
    
    
    private String tipoAlimento;

    public Carguero(String tipoAlimento, String tipoDeMercancia, int numContenedores, int limiteCargaPeso, boolean esInflamable, String paisDestinatario, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tipoDeMercancia, numContenedores, limiteCargaPeso, esInflamable, paisDestinatario, motor, eslora, manga, nudos, peso);
        this.tipoAlimento = tipoAlimento;
        this.nombre = "ElTransportador";
    }
    
    

    @Override
    void arranca() {
        System.out.println("Arrancando carguero...");
    }

    @Override
    void atraca() {
        System.out.println("Atracando carguero...");
    }

    


    
    
    
    
}
