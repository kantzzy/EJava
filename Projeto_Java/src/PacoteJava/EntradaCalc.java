
package PacoteJava;
import javax.swing.*;
public class EntradaCalc {

    public static void main(String[] args) {
    
        
         String aux, s = null; String sair = ""; String k = null;
         int esc = 0; 
         double resp = 0; double c = 0; double d = 0;
               
             aux =  JOptionPane.showInputDialog(null, "O que deseja realizar?\n"
                + "1 - Somar\n" 
                + "2 - Subtrair\n" 
                + "3 - Dividir\n" 
                + "4 - Multiplicar");
            
           esc  = Integer.parseInt(aux);
    
           switch (esc)
           {
               case 1: s = "soma"; break;
               case 2: s = "subtração"; break;
               case 3: s = "divisão"; break;
               case 4: s = "multiplicação"; break;
               default: s = "Inexistente !";
           }
           
          
         String a = JOptionPane.showInputDialog(null,"Escolha: " + s + "\nDigite o primeiro número");
         double num1 = Double.parseDouble(a);
         
         String b = JOptionPane.showInputDialog(null,"Digite o segundo número");
         double num2 = Double.parseDouble(b);
        
     
     if (esc == 1){
     resp = Operacoes.Somar(num1, num2);
     k = " + ";
      d = SaidaCalc.Mostrar(c);
   }
     
    if (esc == 2){
     resp = Operacoes.Subtrair(num1, num2);
     k = " - ";
   }
     
    if (esc == 3){
     resp = Operacoes.Dividir(num1, num2);
     k = " / ";
   }
     
    if (esc == 4){
     resp = Operacoes.Multiplicar(num1, num2);
     k = " * ";
    }
    
    d = SaidaCalc.Mostrar(c);
    if(d == 1){
    
    }   
    JOptionPane.showMessageDialog(null,"Valores digitados: " +num1 + " e " + num2 + "\n"
            +"Operador selecionado: " + s + "\n"
            +"A " + s + " de "+ num1 + k + num2 + " = " + resp);
   }
     
           
  }
    

