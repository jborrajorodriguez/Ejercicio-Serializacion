package serializable2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Juan Borrajo Rodriguez
 */
public class NewObjectOutputStream extends ObjectOutputStream{

      // constructores :
    public NewObjectOutputStream()throws IOException{
        
    }
    public NewObjectOutputStream(OutputStream ou)throws IOException{
        super(ou);
    }
    /* redefinición do método que escribe a cabeceira para que non faga nada */
    
    @Override
    protected void writeStreamHeader() throws IOException
    {
    }

    
}
