package serializable2;

import java.io.Serializable;

/**
 *
 * @author Clase
 */
public class Pantalla implements Serializable{
    
    private String marca;
    private float pulgadas;

    public Pantalla() {
    }

    public Pantalla(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "marca=" + marca + ", pulgadas=" + pulgadas + '}';
    }
    
    
    
}
