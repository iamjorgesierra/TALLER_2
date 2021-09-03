
package taller2punto7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Taller2punto7 {

   
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*********Programa para calcular el % de utilidad de un producto*********");
        float pc,pv,pru;
        System.out.println("por favor digite el precio de compra del poducto:  ");
        pc=Float.parseFloat(leer.readLine());
        System.out.println("por favor digite el precio de venta del poducto:  ");
        pv=Float.parseFloat(leer.readLine());
        
        pru=(pv-pc)/pv;
        
        System.out.println("El porcentaje de utilidad es: "+String.format("%.0f",pru*100)+"%");
        System.out.println("By Jorge Sierra");
    }
    
}
