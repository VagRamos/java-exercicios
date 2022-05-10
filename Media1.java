import java.util.Scanner;

/* Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas 
 * de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e 
 * a nota B tem peso 7.5 (A soma dos pesos portanto é 11). 
 * Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal. */

public class Media1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double notaA = 0.0;
		Double notaB = 0.0;
		Double mediaPonderada = 0.0;
		Double pesoNotaA = 3.5;
		Double pesoNotaB = 7.5;

		System.out.print("Digite a nota 1 do aluno: ");
		notaA = input.nextDouble();
		
		System.out.print("Digite a nota 2 do aluno: ");
		notaB = input.nextDouble();
		
		mediaPonderada = (notaA * pesoNotaA + notaB * pesoNotaB) / (pesoNotaA + pesoNotaB);		
		System.out.printf("A média ponderada das notas é: %.2f", mediaPonderada);
		
		input.close();
	}
}
