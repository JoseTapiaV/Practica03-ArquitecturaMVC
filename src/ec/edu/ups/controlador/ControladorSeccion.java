/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clase.Seccion;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Controlador para el CRUD
 * @author Jose Tapia
 */
public class ControladorSeccion {
    private List<Seccion> lista;
    
    public ControladorSeccion(){
        lista=new ArrayList<>();
    }
    
    public void create(Seccion objeto){
        lista.add(objeto);
    }
    
    public Seccion read(int codigo){
        for(Seccion ControladorSeccion:lista){           
            if (ControladorSeccion.getCodigo()==codigo)
                return ControladorSeccion;
        }
        return null;
    }
    
    public void update(Seccion objeto){
        for(int i=0; i<lista.size(); i++){
            Seccion elemento=lista.get(i);
            if(elemento.equals(objeto)){
                lista.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(int codigo){
        for(int i=0; i<lista.size(); i++){
            Seccion elemento=lista.get(i);
            if(elemento.equals(elemento)){
                lista.remove(elemento);
                break;
            }
        }
    }
}
