/*

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os. 
A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o deve conter nenhum espa�o.

Exemplo:
Entrada:
n = 6

Sa�da:
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
		System.out.print("Digite um n�mero: ");

	int n = scan.nextInt();

	scan.close();

	printStars(n);
	}
}