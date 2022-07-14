package somaidades;

import java.util.Scanner;
public class SomaIdades {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Ler = new Scanner(System.in);
        int idade  =0;
        int total = 0;
        int i = 0;
        System.out.println("Programa que soma as idades");
        while(i < 5){
            i = i +1;
            System.out.print("Informe a idade da "+i+" pessoa: ");
            idade = Integer.parseInt(Ler.nextLine());
            total = total + idade;
        }
        System.out.println("Total da soma: "+total);
    }
}
