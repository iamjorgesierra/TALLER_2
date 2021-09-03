
package taller2punto8;
import javax.swing.JOptionPane;

public class Taller2punto8 {

    
    public static void main(String[] args) {
        int op=0;
    do{
    op=Integer.parseInt(JOptionPane.showInputDialog("***MENU DE JORGE SIERRA"+
            "***\n"+
            "[1] PRIMERA OPCION\n"+
            "[2] SEGUNDA OPCION\n"+
            "[3] TERCERA OPCION\n"+
            "[4] CUARTA OPCION\n"+
            "[5] SALIR\n"+
            "ELIJA UNA OPCION: "));
         switch(op)
            {
             case 1:
               JOptionPane.showMessageDialog(null,"**HOLA MUNDO**");
         }
         switch(op)
         {
         case 2:
             JOptionPane.showMessageDialog(null,"**HOLA MUNDO**");
         }
          switch(op)
         {
         case 3:
             JOptionPane.showMessageDialog(null,"**HOLA MUNDO**");
         }
           switch(op)
         {
         case 4:
             JOptionPane.showMessageDialog(null,"**HOLA MUNDO**");
         }
        }while(op!=5);
    }
    
}
