
package herencias;

public class buquePetrolero extends BarcoMercancias {

    public buquePetrolero(String tipoDeMercancia, int numContenedores, int limiteCargaPeso, boolean esInflamable, String paisDestinatario, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(tipoDeMercancia, numContenedores, limiteCargaPeso, esInflamable, paisDestinatario, motor, eslora, manga, nudos, peso);
        this.nombre = "PetroWorld";
    }

    @Override
    void arranca() {
        System.out.println("Arrancando petrolero...");
    }

    @Override
    void atraca() {
        System.out.println("Atracanso petrolero...");
    }
    
    
    
}
