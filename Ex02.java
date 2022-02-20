/*

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
A página de cadastro exigia o preenchimento dos campos de nome e senha, 
porém a senha precisa ser forte. 
O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, 
porém ela não tem certeza se é uma senha forte. Para ajudar Débora, 
construa um algoritmo que informe qual é o número mínimo de caracteres 
que devem ser adicionados para uma string qualquer ser considerada segura.

Exemplo:
Entrada:
Ya3

Saída:
3

Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, 
transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que 
a senha precisa ter um tamanho mínimo de 6 caracteres.

 */

package challengeCapgemini;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira sua senha:\s");

        System.out.println("Quantidade de caracteres pendentes para cumprir os requisitos da senha:"+
        caracteresFaltantes(scan.next()));
        scan.close();
    }

    public static int caracteresFaltantes(String senha) {
        final int requisitoQuantidade = 6;
        int caracteres = 0;

        if (!senha.matches(".*[A-Z].*")) {
            caracteres++;
        }

        if (!senha.matches(".*[a-z].*")) {
            caracteres++;
        }

        if (!senha.matches(".*[0-9].*")) {
            caracteres++;
        }

        if (!senha.matches(".*[!@#$%^&*()\\-+].*")) {
            caracteres++;
        }

        if (requisitoQuantidade - senha.length() > caracteres) {
            caracteres = requisitoQuantidade - senha.length();
        }

        return caracteres;
    }
}