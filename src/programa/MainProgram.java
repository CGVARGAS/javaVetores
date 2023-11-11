package programa;

import java.util.Locale;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alturas: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Informe a altura: ");
			vetor[i] = sc.nextDouble();
		}
		double soma = 0.00;
		for(int i=0; i<n; i++) {
			soma += vetor[i];	
		}
		double media = soma/n;
		
		System.out.printf("Média das alturas: %.2f", media);
		sc.close();

	}

}
