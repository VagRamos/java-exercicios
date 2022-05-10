import java.util.Scanner;

/* Extremamente básico: Leia dois valores inteiros e armazene-os nas variáveis A e B.
 * Efetue a soma de A e B atribuindo seu resultado na variável X.*/

public class ExtremamenteBasico {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int x = 0;
		
		System.out.print("Digite um valor para A: ");
		a = input.nextInt();
		
		System.out.print("Digite um valor para B: ");
		b = input.nextInt();
		
		x = a + b;
		
		System.out.printf("A soma de %d + %d é: %d\r", a, b, x);
		input.close();

	}

}
