/*
	Nome: Gabriel Sotero Mendonça
	Objetivo: Faça um programa que receba como entrada um valor inicial e um final de temperatura 
	em graus Celsius e imprima, variando do valor inicial até o final, a temperatura em Celsius seguido
	do seu equivalente em Fahrenheit.
	Fórmula de conversão de Celsius para Fahrenheit é dada por: F=1,8C + 32.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dFormat = new DecimalFormat("0.0");
		System.out.println("Digite o valor inicial da temperatura em Celsius");
		int tempInicial = scanner.nextInt();
		System.out.println("Digite o valor final da temperatura em Celsius");
		int tempFinal = scanner.nextInt();
		System.out.println("Temperatura em Fahrenheit");
		for (int i = tempInicial; i <= tempFinal; i++) {
			double tempFahrenheit = 1.8*i + 32;
			System.out.println(i + " Celsius = " + dFormat.format(tempFahrenheit) + " Fahrenheit");

		}
		
	}
}
