
package pacotejava;

import javax.swing.*;
public class Exercicio0707 {
    public static void main(String[] args) {
        double imc = 0;
        
        String a = JOptionPane.showInputDialog(null,"Digite seu peso");
         double peso = Double.parseDouble(a);
         
          if(peso < 0.5)  {
       JOptionPane.showMessageDialog(null,"Dado inválido");
       System.exit(0);
       }
         
        String b = JOptionPane.showInputDialog(null,"Digite sua altura");
         double altura = Double.parseDouble(b);
        
          if(altura < 0.1){
       JOptionPane.showMessageDialog(null,"Dado inválido");
         
       }
    
       else{
       altura = altura * altura;
       imc = peso / altura;
       }
       
       
       if(imc < 18.5){
           JOptionPane.showMessageDialog(null,"EXCESSO DE MAGREZA\nSeu IMC é: " + imc);
       }
       else if(imc >= 18.5 && imc <= 25 )
               JOptionPane.showMessageDialog(null,"PESO NORMAL\nSeu IMC é: " + imc);
       
       else if(imc >= 25 && imc <= 30 )
               JOptionPane.showMessageDialog(null,"EXCESSO DE PESO\nSeu IMC é: " + imc);
       
       else if(imc >= 30 && imc <= 35 )
               JOptionPane.showMessageDialog(null,"OBESIDADE(GRAU I)\nSeu IMC é: " + imc);
       
       else if(imc >= 35 && imc <= 40 )
               JOptionPane.showMessageDialog(null,"OBESIDADE(GRAU II)\nSeu IMC é: " + imc);
       
       else if(imc > 40 )
               JOptionPane.showMessageDialog(null,"OBESIDADE(GRAU III)\nSeu IMC é: " + imc);
       
       
    }    
}