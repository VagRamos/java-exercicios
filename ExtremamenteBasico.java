import java.util.Scanner;

/* Extremamente b�sico: Leia dois valores inteiros e armazene-os nas vari�veis A e B.
 * Efetue a soma de A e B atribuindo seu resultado na vari�vel X.*/

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
		
		System.out.printf("A soma de %d + %d �: %d\r", a, b, x);
		input.close();

	}

}
