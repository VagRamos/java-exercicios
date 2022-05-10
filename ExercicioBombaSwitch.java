import java.util.Scanner;

/*Fa�a um programa que apresente o menu de op��es a seguir, permita ao usu�rio
 *escolher a op��o desejada, receba os dados necess�rios para executar a opera��o
 *e mostre o resultado.
 *Verifique a possibilidade de op��o inv�lida e n�o se preocupe com restri��es, 
 *como sal�rio negativo.
 *
 *Na op��o 1: receber o sal�rio de um funcion�rio, calcular e mostrar o valor do 
 *imposto usando as regras a seguir: 
 *Sal�rios percentual do imposto:
 *-Menor que R$500,00 = 5%
 *-De R$500,00 a R$850,00= 10%
 *-Acima de R$850,00 = 15%
 *
 *Na op��o 2: receber o sal�rio de um funcion�rio, calcular e mostrar o valor do 
 *novo sal�rio, usando as regras a seguir:
 *Sal�rio aumento:
 *-Maiores que R$1.500,00 - R$25,00
 *-De R$750,00(inclusive) a R$1.500,00(inclusive) - R$50,00
 *-De R$450,00(inclusive) a R$750,00 - R$75,00
 *-Menores que R$450,00 - R$100,00
 *
 *Na op��o 3: receber o sal�rio de um funcion�rio e mostrar sua classifica��o usando 
 *a tabela a seguir:
 *-At� R$700,00(inclusive) Mal remunerado
 *-Maiores que R$700,00 Bem remunerado*/

public class ExercicioBombaSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double salario = 0.0;
		
		System.out.println("**** PROGRAMA CAIXA N�O TEM ****\n");
		System.out.println("ESCOLHA UMA OP��O");
		System.out.println("Op��o 1 - c�lculo de imposto do sal�rio");
		System.out.println("Op��o 2 - c�lculo de novo sal�rio");
		System.out.println("Op��o 3 - classifica��o do sal�rio");
		Integer opcaoSelecionada = input.nextInt();
		
		while (opcaoSelecionada != 1 ^ opcaoSelecionada != 2 ^ opcaoSelecionada != 3) {
			System.out.println("Por favor, escolha uma das 3 op��es");			
			System.out.println("Op��o 1 - c�lculo de imposto do sal�rio");
			System.out.println("Op��o 2 - c�lculo de novo sal�rio");
			System.out.println("Op��o 3 - classifica��o do sal�rio");
			opcaoSelecionada = input.nextInt();			
		}
		
		switch (opcaoSelecionada) {
		case 1:
			System.out.println("Op��o 1 selecionada - Informe seu sal�rio: ");
			salario = input.nextDouble();
			Double salarioMenosImposto = 0.0;
			
			if (salario < 500) {
				salarioMenosImposto = salario - (salario * 0.05);
				System.out.printf("S�lario de R$%.2f tem dedu��o de 5%%= R$%.2f\n", salario, salarioMenosImposto);
			}else if (salario < 850){
				salarioMenosImposto = salario - (salario * 0.10);
				System.out.printf("S�lario de R$%.2f tem dedu��o de 10%% = R$%.2f\n", salario, salarioMenosImposto);
			}else {
				salarioMenosImposto = salario - (salario * 0.15);
				System.out.printf("S�lario de R$%.2f tem dedu��o de 15%% = R$%.2f\n", salario, salarioMenosImposto);
			}
			break;			
		case 2:
			System.out.println("Op��o 2 selecionada - Informe seu sal�rio: ");
			salario = input.nextDouble();
			Double salarioComAumento = 0.0;
			
			if (salario > 1500) {
				salarioComAumento = salario + 25;
				System.out.printf("S�lario de R$%.2f tem aumento de R$25,00 = R$%.2f\n", salario, salarioComAumento);		
			}else if (salario <= 1500 & salario >= 750){
				salarioComAumento = salario + 50;
				System.out.printf("S�lario de R$%.2f tem aumento de R$50,00 = R$%.2f\n", salario, salarioComAumento);
			}else if (salario < 750 & salario >= 450){
				salarioComAumento = salario + 75;
				System.out.printf("S�lario de R$%.2f tem aumento de R$75,00 = R$%.2f\n", salario, salarioComAumento);
			}else {
				salarioComAumento = salario + 100;
				System.out.printf("S�lario de R$%.2f tem aumento de R$100,00 = R$%.2f\n", salario, salarioComAumento);
			}
			break;
		default:
		case 3:
			System.out.println("Op��o 3 selecionada - Informe seu sal�rio: ");
			salario = input.nextDouble();
			
			if (salario <= 700) {
				System.out.printf("Hum, sal�rio de R$%.2f t� mal remunerado!\n", salario);
			}else {
				System.out.printf("Wow, sal�rio de R$%.2f t� bem remunerado hein!\n", salario);
			}
			break;
		}
				
		System.out.println("\nFIM!");
		input.close();
	}
	
}
