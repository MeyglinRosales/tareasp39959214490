/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author daguilae
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables tipo float 
        float opc=0,dato1=0,dato2=0,result=0;
        
        // Muestra en la consola las opciones a ejecutar
        System.out.println("1.-sumar    2.-restar   3.-multiplicar  4.-dividir  otro numero.-salir");
        
        // Muestra en la consola 
        System.out.println("seleccione una opcion: ");
        
        //Clase que provee una ventana con dialogo de opciones
        opc=Integer.parseInt(JOptionPane.showInputDialog("ingrese opcion: "));
        
        //Condicion, si al ingresar un numero mayor de 0 y menor que 5
        //que son las opciones de operaciones anteriormente, nos muestra una ventana para ingresar datos
        if(opc>0&&opc<5){
            //Depende de la opcion, ingresamos el primer valor para hacer operacion
            dato1=Integer.parseInt(JOptionPane.showInputDialog("ingrese primer numero: "));
            //Depende de la opcion, ingresamos el segundo valor para hacer operacion
            dato2=Integer.parseInt(JOptionPane.showInputDialog("ingrese segundo numero numero: "));
            
        if(opc!=0){
            //Condiciones, depende de la opcion de operacion, hace el calculo, suma  
            if(opc==1)
                result=dato1+dato2;
            //Condiciones, depende de la opcion de operacion, hace el calculo, resta
            if(opc==2)
                result=dato1-dato2;
            //Condiciones, depende de la opcion de operacion, hace el calculo, multiplicacion
            if(opc==3)
                result=dato1*dato2;
            //Condiciones, depende de la opcion de operacion, hace el calculo, division
            if(opc==4)
                result=dato1/dato2;
            //Imprime el resultado 
            System.out.print("el resultado es: ");
            System.out.println(result);
        }
        //Muestra en una ventada de dialogo, el resultado de la operacion que elegimos 
        JOptionPane.showMessageDialog(null, "el resultado es: "+result);
        }
            System.out.println("saliendo...");
            
       // muestra una ventana de dialogo, con un mensaje de salida al escoger una opcion fuera de lo establecido
            JOptionPane.showMessageDialog(null,"adios");        
    }
    
}
