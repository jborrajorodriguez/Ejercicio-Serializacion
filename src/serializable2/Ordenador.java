/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable2;

import java.io.Serializable;

/**
 *
 * @author Clase
 */
public class Ordenador implements Serializable{
    private Cpu procesador;
    private Teclado teclado;
    private Pantalla pantalla;
    private Rato rato;

    public Ordenador() {
    }

    public Ordenador(Cpu procesador, Teclado teclado, Pantalla pantalla, Rato rato) {
        this.procesador = procesador;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.rato = rato;
    }

    public Cpu getProcesador() {
        return procesador;
    }

    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Rato getRato() {
        return rato;
    }

    public void setRato(Rato rato) {
        this.rato = rato;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "procesador=" + procesador + ", teclado=" + teclado + ", pantalla=" + pantalla + ", rato=" + rato + '}';
    }
    
    
    
}
