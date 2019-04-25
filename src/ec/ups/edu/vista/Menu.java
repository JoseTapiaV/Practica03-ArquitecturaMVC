/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;
import ec.edu.ups.clase.Empleado;
import ec.edu.ups.clase.Inventario;
import ec.edu.ups.clase.Seccion;
import ec.edu.ups.clase.Socio;
import ec.edu.ups.clase.Sucursal;
import ec.edu.ups.controlador.ControladorEmpleado;
import ec.edu.ups.controlador.ControladorSocio;
import ec.edu.ups.controlador.ControladorInventario;
import ec.edu.ups.controlador.ControladorSeccion;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * Clase Menu en la cual se encuentra el programa principal
 * @author Jose Tapia
 */
public class Menu {
    public static void main(String []args)
    {
        
        //Compara una misma clase
        Seccion sec=new Seccion();
        sec.setNombre("sec");
        sec.setCodigo(12);
        Seccion sec1=new Seccion();
        sec1.setNombre("sec1");
        sec1.setCodigo(12);
        
        if(sec.equals(sec1))
            System.out.println("Son iguales");
        else 
            System.out.println("No son iguales");
        
        
        //Compara dos diferentes clases
        Sucursal s=new Sucursal();
        s.setCodigo(12);
        if(sec.equals(s))
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
        
        
        //Utilizacion del HashCode
        Set<Seccion> lista=new HashSet<>();
        lista.add(sec);
        lista.add(sec1);
        
        for(Seccion seccion:lista){
            System.out.println("Seccion: "+sec.getNombre());
        }
        
        if(lista.contains(sec1))
            System.out.println("Si existe");
        
        //Para comparar dos string, mayor a 0 si es mayor, menor a 0 si es menor e igual a0 son iguales
        System.out.println("Pepito".compareTo("Pepito"));
        
        //ordenar con set
        SortedSet<Seccion>listaOrdenada =new TreeSet<>();
        listaOrdenada.add(sec1);
        listaOrdenada.add(sec);
        System.out.println("Lista ordenada");
        for(Seccion seccion: listaOrdenada)
            System.out.println(seccion.getNombre());
        
        int opc, opc1;
        Scanner x=new Scanner(System.in);
        do
        {
            System.out.println("1. CRUD Socio");
            System.out.println("2. CRUD Empleado");
            System.out.println("3. CRUD Inventario");
            System.out.println("4. CRUD Seccion");
            System.out.print("Elija una opción: ");
            opc=x.nextInt();
            switch(opc)
            {
                case 1:
                    do{
                        GregorianCalendar fecha=new GregorianCalendar(2010, 5, 20);
                        ControladorSocio cont=new ControladorSocio();
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.print("Elija una opción: ");
                        opc1=x.nextInt();
                        switch(opc1)
                        {
                            case 1:
                                String rol, manera, direccion, ciudad, nombre, nacional;
                                int cod, cantidad, telefono, codigo;
                                double ingreso;
                                System.out.print("Ingrese el rol: ");
                                rol=x.next();
                                System.out.print("Ingrese la manera de ser socio: ");
                                manera=x.next();
                                System.out.print("Ingrese la direccion: ");
                                direccion=x.next();
                                System.out.print("Ingrese la ciudad: ");
                                ciudad=x.next();
                                System.out.print("Ingrese el nombre: ");
                                nombre=x.next();
                                System.out.print("Ingrese si la empresa es nacioal o internacional: ");
                                nacional=x.next();
                                System.out.print("Ingrese el codigo del socio: ");
                                cod=x.nextInt();
                                System.out.print("Ingrese la cantidad de socios: ");
                                cantidad=x.nextInt();
                                System.out.print("Ingrese el numero de telefono: ");
                                telefono=x.nextInt();
                                System.out.print("Ingrese el codigo de la empresa: ");
                                codigo=x.nextInt();
                                System.out.print("Ingrese el ingreso que tiene el empleado: ");
                                ingreso=x.nextDouble();
                                Socio so=new Socio(rol, fecha.getTime(), manera, cod, direccion, cantidad, telefono, ciudad, nombre, codigo, ingreso, nacional);
                                cont.create(so);
                                break;
                            case 2:
                                int cod1;
                                System.out.println("Ingrese el codigo del socio: ");
                                cod1=x.nextInt();
                                System.out.println("Datos del socio: ");
                                System.out.println(cont.read(cod1));
                                break;
                            case 3:
                                String rol1, manera1, direccion1, ciudad1, nombre1, nacional1;
                                int cod2, cantidad1, telefono1, codigo1;
                                double ingreso1;
                                System.out.print("Ingrese el rol: ");
                                rol1=x.next();
                                System.out.print("Ingrese la manera de ser socio: ");
                                manera1=x.next();
                                System.out.print("Ingrese la direccion: ");
                                direccion1=x.next();
                                System.out.print("Ingrese la ciudad: ");
                                ciudad1=x.next();
                                System.out.print("Ingrese el nombre: ");
                                nombre1=x.next();
                                System.out.print("Ingrese si la empresa es nacioal o internacional: ");
                                nacional1=x.next();
                                System.out.print("Ingrese el codigo del socio: ");
                                cod2=x.nextInt();
                                System.out.print("Ingrese la cantidad de socios: ");
                                cantidad1=x.nextInt();
                                System.out.print("Ingrese el numero de telefono: ");
                                telefono1=x.nextInt();
                                System.out.print("Ingrese el codigo de la empresa: ");
                                codigo1=x.nextInt();
                                System.out.print("Ingrese el ingreso que tiene el empleado: ");
                                ingreso1=x.nextDouble();
                                Socio sou=new Socio(rol1, fecha.getTime(), manera1, cod2, direccion1, cantidad1, telefono1, ciudad1, nombre1, codigo1, ingreso1, nacional1);
                                cont.update(sou);
                                break;
                            case 4:
                                System.out.print("Ingrese el codigo del socio: ");
                                int cod3=x.nextInt();
                                cont.delete(cod3);
                                break;
                        }
                    }while(opc1<5 && opc1>0);
                    System.out.println("");
                    break;
                case 2:
                    do{
                        ControladorEmpleado cont=new ControladorEmpleado();
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Imprimir");
                        System.out.print("Elija una opción: ");
                        opc1=x.nextInt();
                        switch(opc1)
                        {
                            case 1:
                                int cod;
                                String nombre;
                                System.out.print("Ingrese el nombre: ");
                                nombre=x.next();
                                System.out.print("Ingrese el codigo: ");
                                cod=x.nextInt();
                                Empleado emp=new Empleado(nombre,cod);
                                cont.create(emp);
                                break;
                            case 2:
                                int cod1;
                                System.out.print("Ingrese el codigo del empleado: ");
                                cod1=x.nextInt();
                                System.out.println("Datos del empleado.");
                                System.out.println(cont.read(cod1));
                                break;
                            case 3:
                                int cod2;
                                String nombre2;
                                System.out.print("Ingrese el nombre: ");
                                nombre2=x.next();
                                System.out.print("Ingrese el codigo: ");
                                cod2=x.nextInt();
                                Empleado empl=new Empleado(nombre2,cod2);
                                cont.update(empl);
                                break;
                            case 4:
                                int cod3;
                                System.out.print("Ingrese el codigo del empleado: ");
                                cod3=x.nextInt();
                                cont.delete(cod3);
                                break;
                            case 5:
                                cont.imprimir();
                                break;
                        }
                    }while(opc1<6 && opc1>0);
                    System.out.println("");
                    break;
                case 3:
                    do{
                        ControladorInventario cont=new ControladorInventario();
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Imprimir");
                        System.out.print("Elija una opción: ");
                        opc1=x.nextInt();
                        switch(opc1)
                        {
                            case 1:
                                String nombre;
                                int cod;
                                System.out.print("Ingrese el nombre del inventario: ");
                                nombre=x.next();
                                System.out.print("Ingrese el codigo: ");
                                cod=x.nextInt();
                                Inventario in=new Inventario(nombre, cod);
                                cont.create(in);
                                break;
                            case 2:
                                int cod2;
                                System.out.print("Ingrese el codigo del inventario: ");
                                cod2=x.nextInt();
                                System.out.println("Datos del inventario.");
                                System.out.println(cont.read(cod2));
                                break;
                            case 3:
                                String nombre3;
                                int cod3;
                                System.out.print("Ingrese el nombre del inventario: ");
                                nombre3=x.next();
                                System.out.print("Ingrese el codigo: ");
                                cod3=x.nextInt();
                                Inventario inv=new Inventario(nombre3, cod3);
                                cont.update(inv);
                                break;
                            case 4:
                                int cod4;
                                System.out.print("Ingrese el codigo del inventario: ");
                                cod4=x.nextInt();
                                cont.delete(cod4);
                                break;
                            case 5:
                                cont.imprimir();
                                break;
                        }
                    }while(opc1<6 && opc1>0);
                    System.out.println("");
                    break;
                case 4: 
                    do{
                        ControladorSeccion cont=new ControladorSeccion();
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.print("Elija una opción: ");
                        opc1=x.nextInt();
                        switch(opc1)
                        {
                            case 1:
                                String nombre;
                                int cod;
                                System.out.print("Ingrese el nombre de la seccion: ");
                                nombre=x.next();
                                System.out.print("Ingrese el codigo: ");
                                cod=x.nextInt();
                                Seccion secc=new Seccion(nombre, cod);
                                cont.create(secc);
                                break;
                            case 2:
                                int cod2;
                                System.out.print("Ingrese el codigo de la seccion: ");
                                cod2=x.nextInt();
                                System.out.println("Datos de la seccion.");
                                System.out.println(cont.read(cod2));
                                break;
                            case 3:
                                String nombre3;
                                int cod3;
                                System.out.print("Ingrese el nombre de la seccion: ");
                                nombre3=x.next();
                                System.out.print("Ingrese el codigo: ");
                                cod3=x.nextInt();
                                Seccion secci=new Seccion(nombre3, cod3);
                                cont.update(secci);
                                break;
                            case 4:
                                int cod4;
                                System.out.print("Ingrese el codigo del inventario: ");
                                cod4=x.nextInt();
                                cont.delete(cod4);
                                break;
                        }
                    }while(opc1<5 && opc1>0);
                    System.out.println("");
                    break;
            }
        }while(opc<5 && opc>0);
    }
}