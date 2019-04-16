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
final public class empleado extends directivo{
    private String seccion;
    private int cantidad;
    private double horaEntrada;
    private double horaSalida;

    public empleado() {
    }

    public empleado(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public empleado(String seccion, int cantidad, double horaEntrada, double horaSalida, String cedula, double sueldo, String direccion, String nombre, int codigo, double ingreso, String nacional) {
        super(cedula, sueldo, direccion, nombre, codigo, ingreso, nacional);
        this.seccion = seccion;
        this.cantidad = cantidad;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(double horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public double getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(double horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    public String emp() {
        return "El empleado " + super.getNombre() + " está vendiendo.";
    }

    public String emp1() {
        return "El empleado " + super.getNombre() + " está exponiendo.";
    }

    public String emp2() {
        return "El empleado " + super.getNombre() + " está hablando";
    }

    @Override
    public String toString() {
        return "empleado{" + "seccion=" + seccion + ", cantidad=" + cantidad + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }   
}
