/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;


public class index {
    //Crea una nueva subclase de mercancias
    //Crea una nueva subclase de o mas de BarcoDeMercancias llamada carguero.
    //instanceof confirma si una clase hereda de otra
    //System.out.println(b1 instanceof Barco); 
    public static void main(String[] args) {
       Barco b1 = new Yate(true, 4, 6, new Motor(5000,10000),20.0, 12.5, 23, 7);
       Barco b2 = new PortaAviones(20,11,new Motor(3500,16000),200,75,46,35);
       Barco b3 = new Carguero("Verduras","Alimentos",200,9,false,"Alemania",new Motor(3900,16000),45.0,32.0,21,18);
       Barco b4 = new Bulkcarrier("Pirita","Minerales",70,3,false,"Brazil",new Motor(3000,14000),29.0,24.5,20,16);
       Barco b5 = new buquePetrolero("Petroleo",40,6,true,"Dubai",new Motor(3500,20000),30.2,25.2,19,17);
       Barco b6 = new buqueGanadero("Gallinas","Ganado",140,9,false,"España",new Motor(3800,17000),50.5,43.3,22,12);
       Barco b7 = new Ferry(26,33,70,new Motor(6000,20000),40.0,31.0,20,15);
       Barco b8 = new Velero(3,4,8,new Motor(1200,4500),20.5,12.0,10,6);
       Barco b9 = new Crucero(3,250,500,new Motor(10000,30000),340,200,50,100);
       Barco b10 = new Acorazado(20,10,new Motor(3000,12000),30.5,18.0,20,15);
       Barco b11 = new Destructor(30,30,new Motor(4000,18000),40.0,20.1,22,14);
       
        System.out.println("==========================");
        System.out.println("BARCOS DE GUERRA: ");
        System.out.println("Porta aviones: ");
        b2.arranca();
        b2.atraca();
        System.out.println("");
        System.out.println("Destructor: ");
        b11.arranca();
        b11.atraca();
        System.out.println("");
        System.out.println("Acorazado: ");
        b10.arranca();
        b10.atraca();
        System.out.println("");
        System.out.println("==========================");
        System.out.println("BARCOS DE MERCANCIAS: ");
        System.out.println("Carguero: ");
        b3.arranca();
        b3.atraca();
        System.out.println("");
        System.out.println("Buque petrolero: ");
        b5.arranca();
        b5.atraca();
        System.out.println("");
        System.out.println("Bulkcarrier: ");
        b4.arranca();
        b4.atraca();
        System.out.println("");
        System.out.println("Buque ganadero: ");
        b6.arranca();
        b6.atraca();
        System.out.println("");
        System.out.println("==========================");
        System.out.println("BARCOS DE PASAJEROS: ");
        System.out.println("Yate: ");
        b1.arranca();
        b1.atraca();
        System.out.println("");
        System.out.println("Ferry: ");
        b7.arranca();
        b7.atraca();
        System.out.println("");
        System.out.println("Velero: ");
        b8.arranca();
        b8.atraca();
        System.out.println("");
        System.out.println("Crucero:  ");
        b9.arranca();
        b9.atraca();
        System.out.println("");
        System.out.println("==========================");
        System.out.println("CASOS DE EMERGENCIA ");
        System.out.println("Barcos de guerra: ");
        b2.abandonenElBarco();
        b2.comportamiento();
        System.out.println("");
        System.out.println("Barcos de mercancía: ");
        b4.abandonenElBarco();
        b4.comportamiento();
        System.out.println("");
        System.out.println("Barcos de pasajeros: ");
        b1.abandonenElBarco();
        b1.comportamiento();
        
    }
    
}
