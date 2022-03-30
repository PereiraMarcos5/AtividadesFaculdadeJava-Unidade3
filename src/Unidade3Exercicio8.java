import java.util.Scanner;

public class Unidade3Exercicio8 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        String nome = leitor.nextLine();
        double salarioFixo = leitor.nextDouble();
        double vendas = leitor.nextDouble();
        double comissao = (vendas * 0.15); 
        double valorReceber = (salarioFixo + comissao);

        System.out.println(String.format("TOTAL = R$ %.2f", valorReceber));

        

    }
}
