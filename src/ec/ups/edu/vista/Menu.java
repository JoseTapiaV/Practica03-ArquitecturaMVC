/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;
import ec.edu.ups.clase.empleado;
import ec.edu.ups.clase.inventario;
import ec.edu.ups.clase.seccion;
import ec.edu.ups.clase.socio;
import ec.edu.ups.controlador.ControladorSocio;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Menu {
    public static void main(String []args)
    {
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
                                socio so=new socio(rol, fecha.getTime(), manera, cod, direccion, cantidad, telefono, ciudad, nombre, codigo, ingreso, nacional);
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
                                socio sou=new socio(rol1, fecha.getTime(), manera1, cod2, direccion1, cantidad1, telefono1, ciudad1, nombre1, codigo1, ingreso1, nacional1);
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
                        empleado emp=new empleado();
                        System.out.println("1. Creat");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.print("Elija una opción: ");
                        opc1=x.nextInt();
                        switch(opc1)
                        {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }while(opc1<5 && opc1>0);
                    System.out.println("");
                    break;
                case 3:
                    do{
                        inventario in=new inventario();
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.print("Elija una opción: ");
                        opc1=x.nextInt();
                        switch(opc1)
                        {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }while(opc1<5 && opc1>0);
                    System.out.println("");
                    break;
                case 4: 
                    do{
                        seccion sec=new seccion();
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.print("Elija una opción: ");
                        opc1=x.nextInt();
                        switch(opc1)
                        {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }while(opc1<5 && opc1>0);
                    System.out.println("");
                    break;
            }
        }while(opc<5 && opc>0);
    }
}
