
package serializable2;

import java.io.Serializable;

/**
 *
 * @author Clase
 */
public class Rato implements Serializable {
    
    private String tipo;

    public Rato() {
    }

    public Rato(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Rato{" + "tipo=" + tipo + '}';
    }
    
    
    
}
