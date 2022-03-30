import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uni3Exercicio3 {
    
    /*Um motorista deseja abastecer seu tanque de combustível. 
    Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.*/
    
    public static void main(String[] args) {

        NumberFormat nf = new DecimalFormat("#,#0.00", new DecimalFormatSymbols(new Locale("pt","BR")));
        
        for(int i = 0; i<=100; i++)
        {
            System.out.println();
        }

        Scanner leitor = new Scanner(System.in);

        float preçoGasolina;
        float valorPagamento;
        float litrosGasolina;

        System.out.println("\nEscreva o preço do Litro da Gasolina:\n");
        preçoGasolina = leitor.nextFloat();

        System.out.println("\nEscreva o valor do Pagamento:\n");
        valorPagamento = leitor.nextFloat();

        litrosGasolina = (valorPagamento / preçoGasolina);

        System.out.println("\n\nO preço da Gasolina está: "+preçoGasolina+"\n\nO valor pago foi:"+valorPagamento+"\n\nE foram abstecidos "+nf.format(litrosGasolina)+" litros de Gasolina");

        leitor.close();
        


        

    }

}
