package programa;

import java.util.Locale;
import java.util.Scanner;

public class VetorProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe a quantidade de notas: ");
		int quantNotas = sc.nextInt();
		double[] vetor = new double[quantNotas];
		
		sc.nextLine();
		System.out.print("Informe o nome do aluno: ");
		String nome = sc.nextLine();
		
		for(int i=0; i<quantNotas; i++) {
			System.out.printf("Informe a %dª nota: ", i+1);
			vetor[i] = sc.nextDouble();
		}
		double soma=0.00;
		for(int i=0; i<quantNotas; i++) {
			soma += vetor[i];
		}
		
		double media = soma/quantNotas;
		
		System.out.print("Aluno: " + nome);
		if(media>=5.00) {
			System.out.printf("\nNota: %.2f - aluno aprovado!\n" , media);
		}else {
			System.out.printf("\nNota: %.2f - aluno em recuperação!\n" , media);
		}
		sc.close();

	}

}
