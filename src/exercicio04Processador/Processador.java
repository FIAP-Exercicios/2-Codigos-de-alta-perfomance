package exercicio04Processador;

import assunto03_FilasSequenciais.filas.FilaInt;

import java.util.Scanner;

public class Processador {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opcao;
        FilaInt fila= new FilaInt();
        fila.init();

        do {
            System.out.println("1- Submete processo para excecução");
            System.out.println("2- Executa processo");
            System.out.println("3- Shutdown");
            opcao= sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Informe RM do alunno: ");
                    int pid = sc.nextInt();
                    fila.enqueue(pid);
                    break;

                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não há processos na fila ");
                    }
                    else {
                        pid= fila.dequeue();
                        System.out.println("O PID: " + pid + " será executado agora");
                        System.out.println("Execução...");
                        System.out.print("Processo foi concluido (1- sim): ");
                        int resp = sc.nextInt();
                        if (resp == 1){
                            System.out.println("O processo: "+pid+" concluiu");
                        }
                        else {
                            fila.enqueue(pid);
                            System.out.println("O processo voltou para a fila");
                        }
                    }
                    break;

                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Fila ainda tem processor");
                        System.out.println("Deseje fechar todos? (1-sim): ");
                        int resp = sc.nextInt();
                        if (resp == 1){
                            while (!fila.isEmpty()){
                                System.out.println("O processo "+fila.dequeue()+" foi encerrado");
                            }
                            System.out.printf("Shutdown...");
                        }
                        else {
                            opcao = 0;
                        }

                    }
                    System.out.println("Volte sempre!");
                    break;

                default:
                    System.out.println("Opção Inválida");

            }
        }while(opcao != 3);

    }
}
