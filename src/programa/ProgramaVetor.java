package programa;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class ProgramaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de produto: ");
		int quantProd = sc.nextInt();
		
		Produto[] vetor = new Produto[quantProd];
				
		for(int i=0; i<quantProd; i++) {
			sc.nextLine(); //Para corrigir quebra de linha...
			System.out.print("Informe o produto: ");
			String nome = sc.nextLine();
			System.out.print("Informe o valor: ");
			double valor = sc.nextDouble();
			
			vetor[i] = new Produto(nome, valor); //Utilizando da classe: "Produto" para adicionar produto e valor no vetor... 
				
		}
		double soma = 0.00;
		for(int i=0; i<quantProd; i++) {
			soma += vetor[i].getValor(); //Para pegar somente o valor utiliza-se do método: "getValor()"
		}
		double media = soma/quantProd;
		System.out.printf("Média de preço: %.2f%n", media);
		
		sc.close();

	}

}
