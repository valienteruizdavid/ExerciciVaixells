
package herencias;


public abstract class BarcoMercancias extends Barco {
    
    
    private String tipoDeMercancia;
    private int numContenedores;
    private int limiteCargaPeso;
    private boolean esInflamable;
    private String paisDestinatario;

    public BarcoMercancias(String tipoDeMercancia, int numContenedores, int limiteCargaPeso, boolean esInflamable, String paisDestinatario, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor, eslora, manga, nudos, peso);
        this.tipoDeMercancia = tipoDeMercancia;
        this.numContenedores = numContenedores;
        this.limiteCargaPeso = limiteCargaPeso;
        this.esInflamable = esInflamable;
        this.paisDestinatario = paisDestinatario;
    }

    
    
    
    @Override
    void atraca() {
        System.out.println("Atracando el barco de carga...");
    }

    @Override
    void arranca() {
        System.out.println("Arrancando el barco de carga...");
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonamos el barco sin la mercancía");
    }

    @Override
    public void comportamiento() {
        System.out.println("Nos escondemos y llamamos a emergencias");
    }

    

    
    
    
}
