/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import ec.edu.ups.interfaces.Acciones;

/**
 * Clase padre
 * @version 1.2
 * @since 2019
 * @author Jose Tapia
 */
public class sucursal extends empresaZapato implements Acciones{
    private String direccion;
    private int cantidad; 
    private int telefono;
    private String ciudad;

    public sucursal() {
    }

    public sucursal(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public sucursal(String direccion, int cantidad, int telefono, String ciudad, String nombre, int codigo, double ingreso, String nacional) {
        super(nombre, codigo, ingreso, nacional);
        this.direccion = direccion;
        this.cantidad = cantidad;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String suc() {
        return "La sucursal " + super.getNombre() + " está lejana.";
    }

    public String suc1() {
        return "La sucursal " + super.getNombre() + " está cercana.";
    }

    public String suc2() {
        return "la sucursal " + super.getNombre() + " está a distancia media";
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
        return "sucursal{" + "direccion=" + direccion + ", cantidad=" + cantidad + ", telefono=" + telefono + ", ciudad=" + ciudad + '}';
    }
}
