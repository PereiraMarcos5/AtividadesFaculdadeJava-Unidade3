import java.util.Scanner;

public class Unidade3Exercicio4 {
    
    public static void main(String[] args) {
        

        /*
        Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
        */ 


        Scanner leitor = new Scanner(System.in);

        float media1Aluno;
        float media2Aluno;
        float media3Aluno;
        float mediaFinal;

        System.out.println("As notas devem ser 5, 3 ou 2");
        System.out.println("Escreva a primeira nota: ");
        media1Aluno = leitor.nextFloat();

        System.out.println("\nEscreva a segunda nota: ");
        media2Aluno = leitor.nextFloat();

        System.out.println("\nEscreva a terceira nota: ");
        media3Aluno = leitor.nextFloat();

        mediaFinal = ((media1Aluno + media2Aluno + media3Aluno)/3);

        System.out.println("\n\nA média do aluno foi: "+mediaFinal);


        leitor.close();



        


    }

}
