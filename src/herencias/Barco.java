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
public abstract class Barco implements EnCasoDeIncendioInterface, EnCasoDeAbordajeInterface {
    
    protected String nombre = "Sin nombre";
    private Motor motor;
    private double eslora; //largo
    private double manga; //ancho
    private int peso; //peso en toneladas
    private int nudos;

    public Barco(Motor motor, double eslora, double manga, int nudos, int peso) {
        this.motor = motor;
        this.eslora = eslora;
        this.manga = manga;
        this.nudos = nudos;
        this.peso = peso;
    }

    public Motor getMotor() {
        return motor;
    }

    public double getEslora() {
        return eslora;
    }

    public double getManga() {
        return manga;
    }

    public int getPeso() {
        return peso;
    }

    public int getNudos() {
        return nudos;
    }

    @Override
    public String toString() {
        return "Barco{" + "motor=" + motor + ", eslora=" + eslora + ", manga=" + manga + ", peso=" + peso + ", nudos=" + nudos + '}';
    }
    
    abstract void arranca();
    abstract void atraca();
    
    
    
}
