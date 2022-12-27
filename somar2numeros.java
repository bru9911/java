//
// Este é um exemplo de como somar dois numeros
// 
public class Numero {
  public static void main(String args[]) { /* Método principal */
    double x,y; // estes sao numeros reais de dupla precisao
    // System.out.print("x = 2.0"); /* inicializando o "x" */
    x = 2;
    y = 3.0; /* iniciando o y, e fazendo y = y+x; */ y = y + x;
    // escrevendo a soma
    System.out.println("x+y = " + (x+y));
 }
} /* fim de Numero */
é equivalente ao código:

public class Numero {
  public static void main(String args[]) { 
    double x,y; 
 
    x = 2;
    y = 3.0;  y = y + x;

   System.out.println("x+y = " + (x+y));
 }
}
