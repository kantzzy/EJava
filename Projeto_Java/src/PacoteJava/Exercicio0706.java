package pacotejava;




import javax.swing.*;





public class Exercicio0706 {
    static double aliquota = 0;
    static double valorliquido = 0;
    static double valordescontado = 0;
    public static void main(String[] args) {
       String A = JOptionPane.showInputDialog(null,"Digite o seu salário:");
       double salario = Double.parseDouble(A);
       if(466.00 > salario ) {
           JOptionPane.showMessageDialog(null,"Salário inválido");
           System.exit(0);
       }
       else if (965.67 >= salario) {
       aliquota = 8.0;
       valordescontado = (aliquota*salario)/100;
       valorliquido = salario - valordescontado;
       }
       else if(1609.45 >= salario ) {
           if (965.67 >= salario) {
           aliquota = 8.0;
           valordescontado = (aliquota*salario)/100;
           valorliquido = salario - valordescontado;
           }
           else {
           aliquota = 9.0;
           valordescontado = (aliquota*salario)/100;
           valorliquido = salario - valordescontado;
           }
       }
       else if (3218.90 >= salario) {
               if(1609.45 >= salario ) {
                   if (965.67 >= salario) {
                   aliquota = 8.0;
                   valordescontado = (aliquota*salario)/100;
                   valorliquido = salario - valordescontado;
                   }
                   else {
                   aliquota = 9.0;
                   valordescontado = (aliquota*salario)/100;
                   valorliquido = salario - valordescontado;
                   }
               }
               else {
               aliquota = 11.0;
               valordescontado= (aliquota*salario)/100;        
               }
            }
            else {
            JOptionPane.showMessageDialog(null,"Salário inválido.");
            System.exit(0);
            }
        JOptionPane.showMessageDialog(null, "Salario:"+salario+"\n"+
                                            "Aliquota aplicada:"+aliquota+"\n"+
                                            "Valor descontado:"+valordescontado+"\n"+
                                            "Valor líquido:"+valorliquido);
        System.exit(0);
       }
    }
