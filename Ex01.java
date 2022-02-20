/*

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:
Entrada:
n = 6

Saída:
     *
    **
   ***
  ****
 *****
******

 */

package challengeCapgemini;

import java.util.Scanner;

public class Ex01 {
	public static void printStars(int n) {

	int i, j;

		for (i = 0; i < n; i++) {  
			for (j = 2 * (n - i); j >= 0; j--) {
				System.out.print(" ");
		}

		for (j = 0; j <= i; j++) {
			System.out.print("* ");
		}
			System.out.println();
		}
	}

	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");

	int n = scan.nextInt();

	scan.close();

	printStars(n);
	}
}