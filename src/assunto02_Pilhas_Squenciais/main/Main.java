package assunto02_Pilhas_Squenciais.main;

import assunto02_Pilhas_Squenciais.pilhas.PilhasInt;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        PilhasInt pilha = new PilhasInt();
        pilha.init();
        pilha.push(11);
        pilha.push(22);
        pilha.push(33);
        pilha.push(44);
        pilha.push(55);
        pilha.push(66);

        if (pilha.isEmpty()){
            System.out.println("Stack isEmpty");
        }
        else {
            System.out.println("Valor do dado que está no topo da pilha:  "+ pilha.top());
        }

        System.out.println("Valor retira: "+pilha.pop());
        System.out.println("Valor retira: "+pilha.pop());

    }
}
