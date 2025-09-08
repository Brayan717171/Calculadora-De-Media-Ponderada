import java.util.Scanner;
 public class CalcularMediaPonderada {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // Solicitar o nome do aluno
         System.out.print("Digite o nome do aluno: ");
         String nome= scanner.nextLine();

         System.out.print("Digite a Nota 1: ");
         Double nota1= scanner.nextDouble();
         System.out.print("Digite a Nota 2: ");
         Double nota2= scanner.nextDouble();
         System.out.print("Digite a Nota 3: ");
         Double nota3= scanner.nextDouble();

         System.out.print("Digite o peso 1: ");
         Double peso1= scanner.nextDouble();
         System.out.print("Digite o peso 2: ");
         Double peso2= scanner.nextDouble();
         System.out.print("Digite o peso 3: ");
         Double peso3= scanner.nextDouble();

         double somaPesos = peso1 + peso2 + peso3;
         double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;

         System.out.printf("A média ponderada do aluno %s é: %.2f\n", nome, mediaPonderada);

     }
}