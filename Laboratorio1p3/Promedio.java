/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromedioNotas;

import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Clase scanner, capturamos datos de tipo int 
        Scanner teclado= new Scanner(System.in);
        // Declarando variable entera
        int [] prome;
        //Tamaño de la matriz
        prome= new int[20];

        int i;
        float total=0;
        //ciclo for, de 1 a 19, cuenta el 0  
        for(i=1;i<20;++i)
        {
            //Imprime el mensaje de ingresar la calificacion del alumno
            System.out.print("ingrese calificacion del alumno "+i+": ");
            //Lee dato tipo entero
            prome[i]=teclado.nextInt();
           //calcula el total de los promedios ingresados  
           total=total+prome[i];
        }
        //Imprime el total
        System.out.println("total es: "+total);
        //calculo del promedio general 
        total= total/20;
        //Imprime el promedio general 
        System.out.println("promedio general es: "+total);
        
        //for(i=19;i>=0;--i)//muestra el promedio que indicamos anteriormente, del ultimo al primero que ingresamos
            //System.out.println("alumno "+i+" su promedio es: "+prome[i]);  
    }        
        
}
