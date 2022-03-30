import java.util.Scanner;

public class Unidade3Exercicio1 {

    public static void main(String[] args) {

        for(int i = 0; i <= 200; i++)
        {
            System.out.println();
        }

        Scanner leitor = new Scanner(System.in);

        float comprimento;
        float largura;
        float area;

        System.out.println("Digite o comprimento do Terreno: ");
        comprimento = leitor.nextFloat();

        System.out.println("Digite a largura do Terreno: ");
        largura = leitor.nextFloat();

        area = (comprimento * largura);

        System.out.println("A área do terreno é: "+area);

        leitor.close();


    }
    
}
