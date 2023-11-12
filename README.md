# Estudo de Vetores em Java

Este repositório contém programas Java que exemplifica o uso de vetores para calcular a média de alturas levantadas e média de notas alunos. O código foi desenvolvido como parte de um estudo acadêmico.

## O que são Arrays?

Arrays são estruturas de dados que armazenam elementos do mesmo tipo de forma contígua na memória. Em outras palavras, um array é uma coleção de elementos, onde cada elemento pode ser acessado diretamente por meio de um índice ou uma chave.

Principais características dos arrays:

1. **Tipo Homogêneo:** Todos os elementos em um array devem ser do mesmo tipo de dado, como inteiros, números de ponto flutuante, caracteres, etc.

2. **Tamanho Fixo:** Geralmente, o tamanho de um array é fixo durante a sua criação. Isso significa que você precisa especificar o número total de elementos que o array pode armazenar.

3. **Acesso por Índice:** Os elementos em um array são acessados por meio de um índice numérico. O índice começa em 0 para o primeiro elemento e vai até o tamanho do array menos 1.

Aqui está um exemplo em Java de como declarar, inicializar e acessar elementos em um array de inteiros:

```java
// Declarar um array de inteiros com tamanho 5
int[] meuArray = new int[5];

// Inicializar os elementos do array
meuArray[0] = 10;
meuArray[1] = 20;
meuArray[2] = 30;
meuArray[3] = 40;
meuArray[4] = 50;

// Acessar e imprimir elementos do array
System.out.println("Elemento no índice 2: " + meuArray[2]);  // Saída: 30
```

Arrays são fundamentais em programação e são utilizados para armazenar e manipular conjuntos de dados de maneira eficiente. Eles estão presentes em diversas linguagens de programação, embora a sintaxe para trabalhar com eles possa variar.

## Descrição do Programa

O programa solicita ao usuário o número de alturas levantadas, cria um vetor para armazenar essas alturas e, em seguida, calcula e exibe a média das alturas.

### Instruções de Uso

1. Execute o programa Java.
2. Insira o número de alturas a serem levantadas.
3. Informe cada altura quando solicitado.

O programa calculará automaticamente a média das alturas inseridas e a exibirá.

## Contribuições

Contribuições e melhorias são bem-vindas. Se você identificar oportunidades para otimizar ou expandir o código, sinta-se à vontade para enviar uma solicitação de pull.

## Notas Adicionais

Este programa faz parte de um estudo acadêmico sobre o uso de vetores em Java do curso Java Completo 2023 do instrutor Nelio Alves, adquirido na plataforma Udemy.

## Aluno

Claudio G. Vargas 

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

---

**Nota:** 

Trata-se de conteúdo para fins acadêmicos.

### Novo Código Java Adicionado

```java
package programa;

import java.util.Locale;
import java.util.Scanner;

public class NovoPrograma {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int quantidade = sc.nextInt();
        int[] novoArray = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Informe o %dº elemento: ", i + 1);
            novoArray[i] = sc.nextInt();
        }

        // Exemplo de cálculo da soma dos elementos
        int soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += novoArray[i];
        }

        System.out.println("Soma dos elementos: " + soma);
        sc.close();
    }
}
```

Este novo código Java adicionado ao pacote "programa" é um exemplo simples que solicita ao usuário a quantidade de elementos, cria um array para armazenar esses elementos e calcula a soma deles. Esse exemplo visa ilustrar conceitos adicionais sobre o uso de arrays em Java.
