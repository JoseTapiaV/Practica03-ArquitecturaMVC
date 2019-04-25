/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clase.Inventario;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Clase Controlador para el CRUD
 * @author Jose Tapia
 */
public class ControladorInventario {
    private java.util.Map<Integer, Inventario> lista;
    private int contador=0;
    
    public ControladorInventario(){
        lista=new TreeMap<Integer, Inventario>();
    }
    
    public void create(Inventario objeto){
        lista.put(contador,objeto);
        contador++;
    }
    
    public Inventario read(int codigo){
        for (Entry<Integer, Inventario> objeto : lista.entrySet()) {
            if (objeto.getKey()==codigo)
                System.out.println(objeto);
        }
        return null;
    }
            
    public void update(Inventario objeto){
        lista.put(objeto.getCodigo(), objeto);
    }
    
    public void delete(int codigo){
        for (Entry<Integer, Inventario> objeto : lista.entrySet()) {
            if (objeto.getKey()==codigo){
               lista.remove(codigo);
               break;
            }
        }
    }
    
    public void imprimir(){
        System.out.println(lista.entrySet());
    }    
}
