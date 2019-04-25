/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 * Clase abuelo
 * @version 1.2
 * @since 2019
 * @author Jose Tapia
 */
public class EmpresaZapato implements Comparable<EmpresaZapato> {
    private String nombre;
    private int codigo;
    private double ingreso;
    private String nacional;

    public EmpresaZapato() {
    }

    public EmpresaZapato(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public EmpresaZapato(String nombre, int codigo, double ingreso, String nacional) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ingreso = ingreso;
        this.nacional = nacional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }
    
    @Override
    public String toString() {
        return "EmpresaZapato{" + "nombre=" + nombre + ", codigo=" + codigo + ", ingreso=" + ingreso + ", nacional=" + nacional + '}';
    }    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaZapato other = (EmpresaZapato) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(EmpresaZapato o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}