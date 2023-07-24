public class BreakTeste
{
    public static void main( String args[] )
    {
    int contador; //Variável de controle usada como referência
   
    for ( contador = 1; contador <= 10; contador++ )//Laço, será repetido 10 vezes
        {
        if ( contador == 5 ) //Se o contador chegar até 5
            break;        //Termina o loop quando a condição do if se tornar verdadeira
       
        System.out.printf( "%d ", contador);
        }//Termino da instrução for
   
    System.out.printf( "\nInterrompe o contador quando o contador = %d\n",contador );
    }//Fim do main
}//Fim da classe BreakTest
