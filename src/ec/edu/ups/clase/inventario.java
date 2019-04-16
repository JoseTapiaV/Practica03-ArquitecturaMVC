/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import ec.edu.ups.interfaces.Acciones;

/**
 * Clase hija de sucursal
 * @version 1.2
 * @since 2019
 * @author Jose Tapia
 */
final public class inventario extends sucursal implements Acciones{
    private String tipo;
    private int numeroComputador;
    private int numeroEmpleado;
    private int numeroCliente;

    public inventario() {
    }

    public inventario(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public inventario(String tipo, int numeroComputador, int numeroEmpleado, int numeroCliente, String direccion, int cantidad, int telefono, String ciudad, String nombre, int codigo, double ingreso, String nacional) {
        super(direccion, cantidad, telefono, ciudad, nombre, codigo, ingreso, nacional);
        this.tipo = tipo;
        this.numeroComputador = numeroComputador;
        this.numeroEmpleado = numeroEmpleado;
        this.numeroCliente = numeroCliente;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroComputador() {
        return numeroComputador;
    }

    public void setNumeroComputador(int numeroComputador) {
        this.numeroComputador = numeroComputador;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String inv() {
        return "El inventario " + super.getNombre() + " está vacío.";
    }

    public String inv1() {
        return "El inventario " + super.getNombre() + " está lleno.";
    }

    public String inv2() {
        return "El inventario " + super.getNombre() + " está casi lleno";
    }
    
    @Override
    public String generar() {
        return "La empresa "+super.getNombre()+"está generando.";
    }

    @Override
    public String vender() {
        return "La empresa "+super.getNombre()+"está vendiendo.";
    }

    @Override
    public String toString() {
        return "inventario{" + "tipo=" + tipo + ", numeroComputador=" + numeroComputador + ", numeroEmpleado=" + numeroEmpleado + ", numeroCliente=" + numeroCliente + '}';
    }
}
