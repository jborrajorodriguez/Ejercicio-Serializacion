package serializable2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

        
        


/**
 *
 * @author Juan Borrajo Rodriguez
 */
public class Metodos {
    
    
    public void escribeFichero(String ficheiro) 
    {
      //  MeuObjectOutputStream esc = null;
        ObjectOutputStream fich = null;
        try
        {
           //  esc = new MeuObjectOutputStream(          
           //         new FileOutputStream(ficheiro));
            
            fich = new ObjectOutputStream(new FileOutputStream(ficheiro));
            for (int i = 0; i <1; i++) // como exemplo gardamos 3 obxectos
            {
                // ollo ! instanciamos os obxectos tipo persoa dentro do bucle
                
                Ordenador o = new Ordenador (new Cpu(enteiro("Cantidad de memoria"),enteiro("Velocidad")),new Teclado(cadea("Idioma del teclado")),new Pantalla(cadea("Marca de la pantalla"),decimal("Introduce pulgadas")),new Rato(cadea("Raton")));
               // esc.writeObject(p);
                fich.writeObject(o);
            }
           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally{
            if(fich != null)
                try {
                    fich.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
      public void engadeFicheiro(String ficheiro) 
    {
       NewObjectOutputStream esc = null;
        ObjectOutputStream fich = null;        
        try
        {
             esc = new NewObjectOutputStream(          
                    new FileOutputStream(ficheiro,true));            
           
            for (int i = 0; i <2; i++) // engadimos por exemplo 2 obxectos
            {
                // ollo ! instanciamos os obxectos tipo persoa dentro do bucle
                
                Ordenador o = new Ordenador (new Cpu(enteiro("Cantidad de memoria"),enteiro("Velocidad")),new Teclado(cadea("Idioma del teclado")),new Pantalla(cadea("Marca de la pantalla"),decimal("Introduce pulgadas")),new Rato(cadea("Raton")));
                esc.writeObject(o);
               
            }
           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally{
            if(esc != null)
                try {
                 esc.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   
    
    
 public String cadea(String s){
     return JOptionPane.showInputDialog(s);
 }
 public int enteiro(String s){
     return Integer.parseInt(JOptionPane.showInputDialog(s));
 }
 public float decimal(String s){
     return Float.parseFloat(JOptionPane.showInputDialog(s));
 }
 public void lerFicheiro(String ficheiro){
     ObjectInputStream ler = null;
     Ordenador aux = null;
        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));
       
             aux=(Ordenador)ler.readObject();
             while(aux!= null){
                 System.out.println(aux.toString());
                 aux=(Ordenador)ler.readObject();
             }
        }    
          catch (ClassNotFoundException ex) {
              System.out.println("erro 1" +ex.getMessage());      
                    
           } catch (IOException ex) {
            System.out.println("erro 2" +ex.getMessage());
        }
     finally{
            if(ler != null)
                try {
                    ler.close();
            } catch (IOException ex) {
                    System.out.println("erro de peche "+ex.getMessage());
            }
        }
 }
 
 
 
}
