import java.util.Scanner;

public class Unidade3Exercicio5 {


   /*Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação;
     no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
    Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, 
     faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.*/

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float numeroFrangos;
        float aneisAlimentos;
        float aneisId;
        float gastoTotal;
        
        System.out.println("Digite o numero de frangos: ");
        numeroFrangos = leitor.nextFloat();

        aneisAlimentos = ((numeroFrangos * 2)* 3.5f);
        aneisId = (numeroFrangos * 4f);

        gastoTotal = aneisAlimentos + numeroFrangos;

        System.out.println("\n\nSão no total: "+numeroFrangos+" frangos e no total foi gasto: "+gastoTotal);

        leitor.close();




    }
    
}
