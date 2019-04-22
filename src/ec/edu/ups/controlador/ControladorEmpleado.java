/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clase.empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ControladorEmpleado {
     private List<empleado> lista;
    
    public ControladorEmpleado(){
        lista=new ArrayList<>();
    }
    
    public void create(empleado objeto){
        lista.add(objeto);
    }
    
    public empleado read(int codigo){
        for(empleado ControladorEmpleado:lista){           
            if (ControladorEmpleado.getCodigo()==codigo)
                return ControladorEmpleado;
        }
        return null;
    }
    
    public void update(empleado objeto){
        for(int i=0; i<lista.size(); i++){
            empleado elemento=lista.get(i);
            if(elemento.equals(objeto)){
                lista.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(int codigo){
        for(int i=0; i<lista.size(); i++){
            empleado elemento=lista.get(i);
            if(elemento.equals(elemento)){
                lista.remove(elemento);
                break;
            }
        }
    }
    
    public void ordenar(empleado objeto){
        
    }
    
}
