/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clase.socio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class ControladorSocio {
    private List<socio> lista;
    private int contador=0;

    public ControladorSocio(){
        lista=new ArrayList<>();
    }
    
    public void create(socio objeto){
        lista.set(contador, objeto);
        contador=contador+1;
        //lista.add(objeto);
    }
    
    public socio read(int cod){
        for(socio ControladorSocio : lista){
            if (ControladorSocio.getCodigo()==cod)
                return ControladorSocio;
        }
        return null;
    }
    
    public void update(socio objeto){
        for(int i=0; i<lista.size(); i++){
            socio elemento=lista.get(i);
            if(elemento.getCodigo()==objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(int codigo){
        for(int i=0; i<lista.size(); i++){
            socio elemento=lista.get(i);
            if(elemento.getCodigo()==codigo){
                lista.remove(i);
                break;
            }
        }
    }
}
