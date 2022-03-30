import java.util.Scanner;

public class Uni3Exercicio2 {
 
    public static void main(String[] args) {


        //sout = System.out.println();

            for(int i = 0; i<=200; i++)
            {
                System.out.println();
            }

            float valorSapato;
            float valorDesconto;
            float valorFinal;


            Scanner leitor = new Scanner(System.in);

            System.out.println("Escreva o valor do Sapato: ");
            valorSapato = leitor.nextFloat();

            valorDesconto = ((valorSapato * 12) / 100);
            valorFinal = (valorSapato - valorDesconto);

            System.out.println("O valor do desconto é: "+ valorDesconto + "\nO valor final é: " + valorFinal );

            leitor.close();

             
    }

}
