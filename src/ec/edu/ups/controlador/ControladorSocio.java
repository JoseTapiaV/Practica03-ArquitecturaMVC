/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clase.Socio;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Controlador para el CRUD
 * @author Jose Tapia
 */
public class ControladorSocio {
    private List<Socio> lista;
    private int contador=0;

    public ControladorSocio(){
        lista=new ArrayList<>();
    }
    
    public void create(Socio objeto){
        lista.set(contador, objeto);
        contador=contador+1;
    }
    
    public Socio read(int codigo){
        for(Socio ControladorSocio : lista){
            if (ControladorSocio.getCodigo()==codigo)
                return ControladorSocio;
        }
        return null;
    }
    
    public void update(Socio objeto){
        for(int i=0; i<lista.size(); i++){
            Socio elemento=lista.get(i);
            if(elemento.getCodigo()==objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(int codigo){
        for(int i=0; i<lista.size(); i++){
            Socio elemento=lista.get(i);
            if(elemento.getCodigo()==codigo){
                lista.remove(i);
                break;
            }
        }
    }
}