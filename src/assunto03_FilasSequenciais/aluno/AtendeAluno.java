package assunto03_FilasSequenciais.aluno;


import assunto03_FilasSequenciais.filas.FilaInt;

import java.util.Scanner;

public class AtendeAluno {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opcao;
        FilaInt fila= new FilaInt();
        fila.init();

        do {
            System.out.println("1- Insere aluno na fila");
            System.out.println("2- Atende 1 aluno");
            System.out.println("3- Encerra atendimento");
            opcao= sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Informe RM do alunno: ");
                    int rm = sc.nextInt();
                    fila.enqueue(rm);
                    break;

                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não há alunos na fila");
                    }
                    else {
                        System.out.println("O aluno:" + fila.dequeue() + "será atendido agora");
                    }
                    System.out.println("Informe o RM para buscar: ");
                    break;

                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Fila ainda tem alunos");
                        opcao = 0;
                    }
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção Inválida");

            }
        }while(opcao != 3);

    }
}
