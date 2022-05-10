import java.util.Scanner;

/*Faça um programa que apresente o menu de opções a seguir, permita ao usuário
 *escolher a opção desejada, receba os dados necessários para executar a operação
 *e mostre o resultado.
 *Verifique a possibilidade de opção inválida e não se preocupe com restrições, 
 *como salário negativo.
 *
 *Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do 
 *imposto usando as regras a seguir: 
 *Salários percentual do imposto:
 *-Menor que R$500,00 = 5%
 *-De R$500,00 a R$850,00= 10%
 *-Acima de R$850,00 = 15%
 *
 *Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do 
 *novo salário, usando as regras a seguir:
 *Salário aumento:
 *-Maiores que R$1.500,00 - R$25,00
 *-De R$750,00(inclusive) a R$1.500,00(inclusive) - R$50,00
 *-De R$450,00(inclusive) a R$750,00 - R$75,00
 *-Menores que R$450,00 - R$100,00
 *
 *Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando 
 *a tabela a seguir:
 *-Até R$700,00(inclusive) Mal remunerado
 *-Maiores que R$700,00 Bem remunerado*/

public class ExercicioBombaSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double salario = 0.0;
		
		System.out.println("**** PROGRAMA CAIXA NÃO TEM ****\n");
		System.out.println("ESCOLHA UMA OPÇÃO");
		System.out.println("Opção 1 - cálculo de imposto do salário");
		System.out.println("Opção 2 - cálculo de novo salário");
		System.out.println("Opção 3 - classificação do salário");
		Integer opcaoSelecionada = input.nextInt();
		
		while (opcaoSelecionada != 1 ^ opcaoSelecionada != 2 ^ opcaoSelecionada != 3) {
			System.out.println("Por favor, escolha uma das 3 opções");			
			System.out.println("Opção 1 - cálculo de imposto do salário");
			System.out.println("Opção 2 - cálculo de novo salário");
			System.out.println("Opção 3 - classificação do salário");
			opcaoSelecionada = input.nextInt();			
		}
		
		switch (opcaoSelecionada) {
		case 1:
			System.out.println("Opção 1 selecionada - Informe seu salário: ");
			salario = input.nextDouble();
			Double salarioMenosImposto = 0.0;
			
			if (salario < 500) {
				salarioMenosImposto = salario - (salario * 0.05);
				System.out.printf("Sálario de R$%.2f tem dedução de 5%%= R$%.2f\n", salario, salarioMenosImposto);
			}else if (salario < 850){
				salarioMenosImposto = salario - (salario * 0.10);
				System.out.printf("Sálario de R$%.2f tem dedução de 10%% = R$%.2f\n", salario, salarioMenosImposto);
			}else {
				salarioMenosImposto = salario - (salario * 0.15);
				System.out.printf("Sálario de R$%.2f tem dedução de 15%% = R$%.2f\n", salario, salarioMenosImposto);
			}
			break;			
		case 2:
			System.out.println("Opção 2 selecionada - Informe seu salário: ");
			salario = input.nextDouble();
			Double salarioComAumento = 0.0;
			
			if (salario > 1500) {
				salarioComAumento = salario + 25;
				System.out.printf("Sálario de R$%.2f tem aumento de R$25,00 = R$%.2f\n", salario, salarioComAumento);		
			}else if (salario <= 1500 & salario >= 750){
				salarioComAumento = salario + 50;
				System.out.printf("Sálario de R$%.2f tem aumento de R$50,00 = R$%.2f\n", salario, salarioComAumento);
			}else if (salario < 750 & salario >= 450){
				salarioComAumento = salario + 75;
				System.out.printf("Sálario de R$%.2f tem aumento de R$75,00 = R$%.2f\n", salario, salarioComAumento);
			}else {
				salarioComAumento = salario + 100;
				System.out.printf("Sálario de R$%.2f tem aumento de R$100,00 = R$%.2f\n", salario, salarioComAumento);
			}
			break;
		default:
		case 3:
			System.out.println("Opção 3 selecionada - Informe seu salário: ");
			salario = input.nextDouble();
			
			if (salario <= 700) {
				System.out.printf("Hum, salário de R$%.2f tá mal remunerado!\n", salario);
			}else {
				System.out.printf("Wow, salário de R$%.2f tá bem remunerado hein!\n", salario);
			}
			break;
		}
				
		System.out.println("\nFIM!");
		input.close();
	}
	
}
