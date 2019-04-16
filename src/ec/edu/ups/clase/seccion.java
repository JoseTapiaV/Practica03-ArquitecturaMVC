/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import ec.edu.ups.interfaces.Acciones;

/**
 * Clase hija de directivo
 * @version 1.2
 * @since 2019
 * @author Jose Tapia
 */
final public class seccion extends directivo{
    private String tipo;
    private String lugar;
    private int numeroArea;
    private int numeroCliente;

    public seccion() {
    }

    public seccion(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public seccion(String tipo, String lugar, int numeroArea, int numeroCliente, String cedula, double sueldo, String direccion, String nombre, int codigo, double ingreso, String nacional) {
        super(cedula, sueldo, direccion, nombre, codigo, ingreso, nacional);
        this.tipo = tipo;
        this.lugar = lugar;
        this.numeroArea = numeroArea;
        this.numeroCliente = numeroCliente;
    }

    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumeroArea() {
        return numeroArea;
    }

    public void setNumeroArea(int numeroArea) {
        this.numeroArea = numeroArea;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    
    public String sec() {
        return "La seccion " + super.getNombre() + " está repleta.";
    }

    public String sec1() {
        return "La seccion " + super.getNombre() + " está siendo utilizada.";
    }

    public String sec2() {
        return "La seccion " + super.getNombre() + " está vacía";
    }

    @Override
    public String toString() {
        return "seccion{" + "tipo=" + tipo + ", lugar=" + lugar + ", numeroArea=" + numeroArea + ", numeroCliente=" + numeroCliente + '}';
    }
}
