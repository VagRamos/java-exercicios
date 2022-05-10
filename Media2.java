import java.util.Scanner;

/* Leia 3 valores, no caso variáveis A, B e C, que são as três notas de um aluno. 
 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B 
 * tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, 
 * sempre com uma casa decimal. Entrada O arquivo de entrada contém 3 valores com 
 * uma casa decimal.*/

public class Media2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Double a = 5.5, b = 5.5, c = 5.5;
		Double mediaPonderada = 0.0;
		int pesoNotaA = 2;
		int pesoNotaB = 3;
		int pesoNotaC = 5;
		
		System.out.print("Digite a nota 1: ");
		a = input.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		b = input.nextDouble();
		
		System.out.print("Digite a nota 3: ");
		c = input.nextDouble();
		
		mediaPonderada = (a * pesoNotaA + b * pesoNotaB + c * pesoNotaC)/(pesoNotaA + pesoNotaB + pesoNotaC);
		
		System.out.printf("O aluno ficou com %.2f de média.", mediaPonderada);
		
		input.close();
	}

}
