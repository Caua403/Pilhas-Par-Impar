package EstruturaDadosTeste;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class pilhaIP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> pilhaPar = new Stack<>();
		Stack<Integer> pilhaImpar = new Stack<>();
		
		ParImpar(sc,pilhaPar, pilhaImpar);
	}
	
	public static void ParImpar(Scanner sc, Stack<Integer> pilhaPar, Stack<Integer> pilhaImpar) {
		System.out.println("Digite 10 números: ");
		for(int i = 0; i< 10; i++) {
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("número 0 acionado. removendo 1 elemento de cada pilha.");
				try {
					pilhaPar.pop();
					pilhaImpar.pop();
					System.out.println("Pilha dos pares:" + pilhaPar);
					System.out.println("Pilha dos ímpares: " + pilhaImpar);
				} catch(EmptyStackException e) {
					System.out.println("Erro! Uma ou ambas pilhas se Encontram vazias.");
				}
				
			} else if(num % 2 == 0) {
				System.out.println("Número par reconhecido. Adicionando a pilha dos pares.");
				pilhaPar.push(num);
				System.out.println("Pilha dos pares: " + pilhaPar);
			} else if(num % 2 != 0) {
				System.out.println("Número ímpar reconhecido. Adicionando a pilha dos ímpares.");
				pilhaImpar.push(num);
				System.out.println("Pilha dos ímpares: " + pilhaImpar);
			} 
		}
		System.out.println("Limpando as pilhas.");
		pilhaPar.clear();
		pilhaImpar.clear();
		System.out.println(pilhaPar);
		System.out.println(pilhaImpar);
		

	}
}
