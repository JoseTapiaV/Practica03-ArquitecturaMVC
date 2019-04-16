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
public class directivo extends empresaZapato implements Acciones{
    private int codigo;
    private String cedula;
    private double sueldo;
    private String direccion;

    public directivo() {
    }

    public directivo(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public directivo(String cedula, double sueldo, String direccion, String nombre, int codigo, double ingreso, String nacional) {
        super(nombre, codigo, ingreso, nacional);
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String direct() {
        return "El directivo " + super.getNombre() + " está creando.";
    }

    public String direct1() {
        return "El directivo " + super.getNombre() + " está produciendo.";
    }

    public String direct2() {
        return "El directivo " + super.getNombre() + " está leyendo";
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
        return "directivo{" + "codigo=" + codigo + ", cedula=" + cedula + ", sueldo=" + sueldo + ", direccion=" + direccion + '}';
    }
}
