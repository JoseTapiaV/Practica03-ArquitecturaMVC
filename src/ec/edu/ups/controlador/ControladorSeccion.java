/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clase.seccion;
import ec.edu.ups.clase.socio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class ControladorSeccion {
    private List<seccion> lista;
    
    public ControladorSeccion(){
        lista=new ArrayList<>();
    }
    
    public void create(seccion objeto){
        lista.add(objeto);
    }
    
    public seccion read(int codigo){
        for(seccion ControladorSeccion:lista){           
            if (ControladorSeccion.getCodigo()==codigo)
                return ControladorSeccion;
        }
        return null;
    }
    
    public void update(seccion objeto){
        for(int i=0; i<lista.size(); i++){
            seccion elemento=lista.get(i);
            if(elemento.equals(objeto)){
                lista.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(int codigo){
        for(int i=0; i<lista.size(); i++){
            seccion elemento=lista.get(i);
            if(elemento.equals(elemento)){
                lista.remove(elemento);
                break;
            }
        }
    }
}
