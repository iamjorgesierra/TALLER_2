
package taller2punto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Taller2punto3 {

    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Programa para calcular");
        float num1,num2,num3,sm,mt,dv,prm;
        System.out.println("por favor ingrese un numero decimal:  ");
        num1=Float.parseFloat(leer.readLine());
        System.out.println("por favor ingrese un numero decimal:  ");
        num2=Float.parseFloat(leer.readLine());
        System.out.println("por favor ingrese un numero decimal:  ");
        num3=Float.parseFloat(leer.readLine()); 
             System.out.printf("La suma es: %.2f\n ",suma(num1,num2,num3));
        System.out.printf("El producto es: %.2f\n ",producto(num1,num2,num3));
        System.out.printf("El cociente es: %.2f\n ",cociente(num1,num2,num3));
        System.out.printf("El promedio es: %.2f\n ",Promedio(num1,num2,num3));
       System.out.printf("El modulo es: %.2f\n ",modulo(num1,num2,num3));
        
    }
    public static double suma(float a, float b, float c){
           
        return  a + b + c ;
    }
    
    public static double producto(float a, float b, float c){
           
        return  a * b * c ;
    }
    public static double cociente(float a, float b, float c){
           
        return  a / b / c ;
    }
    public static double Promedio(float a, float b, float c){
           
        return  (a+b+c)/3 ;
    }
        public static double modulo(float a, float b, float c){
           
        return  a%b%c ;
    }
    }
    

