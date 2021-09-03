
package taller2punto5;

import java.util.Scanner;


public class Taller2punto5 {

    
    public static void main(String[] args) {
        System.out.println("****Programa para convertir caracter a un valor numerico****");
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor dijite un caracter: ");
        char ct=leer.next().charAt(0);
        int vn=(int)ct;
        System.out.println("El valor numerico es:"+vn);
        System.out.println("By Jorge Sierra");
    }
    
}
