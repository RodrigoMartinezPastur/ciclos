/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        
        //    tarea c  
        
        int primerNumero = 2;
        int numeroFinal = 20;
        
        
        while (primerNumero <= numeroFinal) {
            
            
            
            if (primerNumero % 2==0){
                System.out.println(primerNumero + " numeros Pares"  );
                
            }else{
                System.out.println( primerNumero + " numero  inpar");
            }
            
            primerNumero = primerNumero +1;
            
            
            //              tarea a y b
            
            //  System.out.println(primerNumero);
            
            // primerNumero = primerNumero +1;
            
            //  primerNumero = primerNumero +2;  
            
            
        }
        
        for (int numeroPrimero = 20; numeroPrimero > 0; numeroPrimero--) {
            if (numeroPrimero %2==0){
                System.out.println(numeroPrimero + " Son numeros pares");
            }else {
                System.out.println(numeroPrimero + " Son Numeros impares");
            }
            
        }
        
        float salario = 500000;
        int vehiculos = 3;
        int inmuebles = 3;
        int embarcaionOAeronave = 1;
        
        if ((salario <= 489083)&& (vehiculos <= 3)&&(inmuebles <= 3)&&(embarcaionOAeronave <= 1)){
            System.out.println("cate a");
            
        }else if ((salario <= 110000000)&&(vehiculos <= 3)&&(inmuebles <= 3)&&(embarcaionOAeronave <= 1)){
              System.out.println("cate b");
        } else 
        {   System.out.println("cate c"); }
       
        // sera que a esto se referia con un txt?
        
    }
}
