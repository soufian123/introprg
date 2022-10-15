/* aquest programa es una calculadora senzilla
*/


        public class CalculadoraSenzilla {
        
            public static void main(String[] args) {
            
            
            System.out.println("Operand1?");
            double OperandUn = Double.parseDouble(Entrada.readLine());
            
            System.out.println("Operador?");
            char Operandor = Entrada.readLine().charAt(0);
            
            System.out.println("Operand2?");
            double OperandDos = Double.parseDouble(Entrada.readLine());
            double resultat;
            
            if (Operandor == '/' && OperandDos == '0' ){
            resultat = OperandUn / OperandDos;

            System.out.println(OperandUn+ " / " + OperandDos + " = " + resultat);
            
            } else { if (Operandor == '-'){
                       resultat = OperandUn - OperandDos;
                       System.out.println(OperandUn+ " - " + OperandDos + " = " + resultat);
                       
                     } else { if (Operandor == '*' ){
                              resultat = OperandUn * OperandDos;
                              System.out.println(OperandUn+ " * " + OperandDos + " = " + resultat);
            
                             } else { if (Operandor == '+' ){
                                      resultat = OperandUn + OperandDos;
                                      System.out.println(OperandUn+ " + " + OperandDos + " = " + resultat);
            
                                      } else { if (Operandor == '/'){
                                                resultat = OperandUn / OperandDos;
                                                System.out.println(OperandUn+ " / " + OperandDos + " = " + resultat);
            
                                                 } else {              
                                                        System.out.println("L'operador "+ Operandor +" no està disponible");
           }}}}}
           
           

    }
}
