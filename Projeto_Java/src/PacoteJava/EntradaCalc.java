
package PacoteJava;
import javax.swing.*;
public class EntradaCalc {

    public static void main(String[] args) {
        Operacoes nova = new Operacoes();
        
         String aux, s = null;
            int esc;
               
             aux =  JOptionPane.showInputDialog(null, "O que deseja realizar?\n"
                + "1 - Somar\n" 
                + "2 - Subtrair\n" 
                + "3 - Dividir\n" 
                + "4 - Multiplicar");
   
           esc  = Integer.parseInt(aux);
    
           switch (esc)
           {
               case 1: s = "Soma"; break;
               case 2: s = "Subtração"; break;
               case 3: s = "Divisão"; break;
               case 4: s = "Multiplicação"; break;
               default: s = "Inexistente !";
           }
        
         String a = JOptionPane.showInputDialog(null,"Escolha: " + s + "\nDigite o primeiro número");
         double num1 = Double.parseDouble(a);
         
         String b = JOptionPane.showInputDialog(null,"Digite o segundo número");
         double num2 = Double.parseDouble(b);

        
         
         
    }
    
}
