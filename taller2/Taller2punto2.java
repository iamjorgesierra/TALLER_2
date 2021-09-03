
package taller2punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Taller2punto2 {

    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Programa para calcular");
        float num1,num2,sm,mt,rt;
        System.out.println("por favor ingrese un numero:  ");
        num1=Float.parseFloat(leer.readLine());
        System.out.println("por favor ingrese un numero:  ");
        num2=Float.parseFloat(leer.readLine());
          
        sm=num1+num2;
        mt=num1*num2;
        rt=num1-num2;
        System.out.println("La suma es: "+sm);
        System.out.println("El producto es: "+mt);
        System.out.println("La diferendia es: "+rt);
        System.out.println("By Jorge Sierra");
    }
    
}
