import java.util.Scanner;

public class Unidade3Exercicio7 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numFunc = leitor.nextInt();
        int numHoras = leitor.nextInt();
        double qtdHora = leitor.nextDouble();

        double totSal = (numHoras * qtdHora);

        System.out.println("NUMBER = "+numFunc);
        System.out.println(String.format("SALARY = U$ %.2f", totSal));

    }

}
