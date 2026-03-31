package assunto02_Pilhas_Squenciais;

import assunto02_Pilhas_Squenciais.pilhas.PilhasInt;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        PilhasInt pilha = new PilhasInt();
        pilha.init();
        int valorDecimal,resto;
        System.out.println("Valor em decimal--> ");
        valorDecimal = le.nextInt();

        while(valorDecimal > 0){

            resto = valorDecimal % 2;
            pilha.push(resto);
            valorDecimal/=2;
        }

        System.out.println("----------------------------------------"+"\n");
        System.out.println("Valor em Binario--> ");

        while(!pilha.isEmpty()){
            System.out.print(pilha.pop());
        }
    }
}
