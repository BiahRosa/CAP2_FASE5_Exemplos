import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Calcular a média de um aluno
        System.out.println("Digite a nota 1: ");
        float nota1 = leitor.nextFloat();
        System.out.println("Digite a nota 2: ");
        float nota2 = leitor.nextFloat();

        float media = (nota1 + nota2)/2;

        System.out.println("A média é " + media);

        leitor.close();
    }
}