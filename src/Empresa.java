/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Empresa {
    public static String nombre;
    
    public static void main(String[] args) {
        nombre = "UNITEC";
        
        Empleado em = new Empleado(1,"Andres"); 
        Empleado em2 = new Empleado(2,"Cristhian");
        
        System.out.println("em1: "+em.numero+"-"+em.nombre
                +" em2: "+em2.numero+"-"+em2.nombre);
    }
}
