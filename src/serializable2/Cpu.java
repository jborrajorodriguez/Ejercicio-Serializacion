package serializable2;

import java.io.Serializable;

/**
 *
 * @author Clase
 */
public class Cpu implements Serializable{
    
    private int memoria,velocidad;

    public Cpu() {
    }

    public Cpu(int memoria, int velocidad) {
        this.memoria = memoria;
        this.velocidad = velocidad;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Cpu{" + "memoria=" + memoria + ", velocidad=" + velocidad + '}';
    }
    
    
}
