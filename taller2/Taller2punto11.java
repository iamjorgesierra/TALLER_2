
package taller2punto11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Taller2punto11 {

    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*********Programa para descomprimir un numero*********");
        int un,dc,cn,num;
        System.out.println("por favor digite un numero:  ");
        num=Integer.parseInt(leer.readLine());
        if(num<=1000){
        un=num%10;
        num=num/10;
        dc=num%10;
        cn=num/10;
            System.out.println("La unidad es: "+un);
            System.out.println("La decena es: "+dc*10);
            System.out.println("La centena es: "+cn*100);
        }
        else{
            System.out.println("***EL NUMERO DIJITADO ESTA FUERA DE RANGO***");
        }
        }
    }  

