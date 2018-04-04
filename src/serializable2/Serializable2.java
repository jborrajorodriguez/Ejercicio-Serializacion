/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable2;

/**
 *
 * @author Clase
 */
public class Serializable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Metodos obxfich= null ;      
            obxfich = new Metodos();
           // obxfich.escribeFichero("persoas.dat");         
            obxfich.lerFicheiro("persoas.dat");
            //obxfich.engadeFicheiro("persoas.dat");
            //obxfich.lerFicheiro("persoas.dat");
    }
    
}
