/*

Duas palavras podem ser consideradas anagramas de si mesmas 
se as letras de uma palavra podem ser realocadas para formar a outra palavra.
Dada uma string qualquer, desenvolva um algoritmo que encontre 
o número de pares de substrings que são anagramas.
 
Ex 01: ovo
Saída: 2
 
Ex 01: ifailuhkqq
Saída: 3
 
 */

package challengeCapgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva uma Palavra: ");
        String testePalavra = leia.nextLine();
        leia.close();
        
        List<String> subStrings = new ArrayList<>();
        
        for(int i = 1;i < testePalavra.length(); i++){
            for(int j = 0;j < testePalavra.length() - i + 1; j++){
                String palavra = testePalavra.substring(j, j + i);
                subStrings.add(palavra);
            }
        }
        
        List<String> novaLista = new ArrayList<>();       
        for(String palavrasLista : subStrings){
            char[] stringChar = palavrasLista.toCharArray();
            
            Arrays.sort(stringChar);
            novaLista.add(new String(stringChar));
        }
        int quantidade = 0;
        for(int i = 0; i < novaLista.size();i++){
            for(int j = i + 1;j < novaLista.size();j++){
                if(novaLista.get(i).equals(novaLista.get(j))){
                    quantidade++;
                }
            }
        }
        System.out.println("Quantidade de anagramas: ");
        System.out.println(quantidade);
    }
}