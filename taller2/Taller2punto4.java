
package taller2punto4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Taller2punto4 {

    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*********Programa para calcular el Longitud y area de una circunferencia*********");
        float r,lt,a;
        
        System.out.println("por favor digite el radio de la circunferencia:  ");
        r=Float.parseFloat(leer.readLine());
        lt=2*r;
        a=r*r;
        System.out.println("La longitud es: "+String.format("%.2f",Math.PI*lt));
        System.out.println("La Area es: "+String.format("%.2f",Math.PI*a));
        System.out.println("By Jorge Sierra");
        
    }
    
}
