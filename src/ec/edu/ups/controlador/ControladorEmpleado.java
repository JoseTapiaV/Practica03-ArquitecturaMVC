/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clase.Empleado;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase Controlador para el CRUD
 * @author Jose Tapia
 */
public class ControladorEmpleado {
     private Set<Empleado> lista;
     private int contador;
    
    public ControladorEmpleado(){
        lista=new HashSet<>();
        contador=0;
    }
    
    public void create(Empleado objeto){
        contador++;
        objeto.setCodigo(this.contador);
        lista.add(objeto);
    }
    
    public Empleado read(int codigo){
        for(Empleado empleado:lista){           
            if (contador==empleado.getCodigo())
                return empleado;
        }
        return null;
    }
    
    public void update(Empleado objeto){
        if(lista.contains(objeto))
        {
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for(Empleado objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Empleado empleado : lista) {
            System.out.println(empleado.getNombre());
        }
    }
}