/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import ec.edu.ups.interfaces.Acciones;
import java.util.Date;

/**
 * Clase hija de sucursal
 * @version 1.2
 * @since 2019
 * @author Jose Tapia
 */
final public class socio extends sucursal{
    private String rol;
    private Date integracion;
    private String manera;
    private int cod;

    public socio() {
    }

    public socio(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public socio(String rol, Date integracion, String manera, int cod, String direccion, int cantidad, int telefono, String ciudad, String nombre, int codigo, double ingreso, String nacional) {
        super(direccion, cantidad, telefono, ciudad, nombre, codigo, ingreso, nacional);
        this.rol = rol;
        this.integracion = integracion;
        this.manera = manera;
        this.cod = cod;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getIntegracion() {
        return integracion;
    }

    public void setIntegracion(Date integracion) {
        this.integracion = integracion;
    }

    public String getManera() {
        return manera;
    }

    public void setManera(String manera) {
        this.manera = manera;
    }

    public double getTiempo() {
        return cod;
    }

    public void setTiempo(int cod) {
        this.cod = cod;
    }
    
    public String socio() {
        return "El socio " + super.getNombre() + " está ocupado.";
    }

    public String socio1() {
        return "El socio " + super.getNombre() + " está exponiendo.";
    }

    public String socio2() {
        return "El socio " + super.getNombre() + " está creando";
    }
        
    @Override
    public String toString() {
        return "socio{" + "rol=" + rol + ", integracion=" + integracion + ", manera=" + manera + ", codigo=" + cod + '}';
    }
}
