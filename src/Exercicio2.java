import java.util.Scanner;

public class Exercicio2 {
    static final int N = 30;

    public static void main(String[] args) {

        int rm[] = new int[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];
        int n= entradaDados(rm, nota1, nota2);
        for (int i=0; i< n; i++){
            System.out.println(rm[i]);
        }

        double media[] = new double[n];
        calcularMedia(media, nota1, nota2, n);
        for (int i = 0; i < n; i++) {
            System.out.println("RM: " + rm[i] + "\t media: " + media[i]);
        }

        int aprovados[] = new int[n];
        int aux= listaAprovados(rm, media, aprovados, n);
        if (aux != 0){

            System.out.println("\n **** Lista de Aprovados ****");
            for (int i = 0; i < aux; i++) {
                System.out.println(aprovados[i]);
            }
        }

    }

    public static int entradaDados(int []rm, double[] nota1, double[] nota2)
    {
        Scanner le = new Scanner(System.in);
        int n;
        System.out.print("Informe RM (negativo para encerrar): ");
        int rmLido = le.nextInt();
        for (n = 0; n < N && rmLido > 0; n++) {
            rm[n] = rmLido;
            System.out.print("Nota1: ");
            nota1[n] = le.nextDouble();
            System.out.print("Nota2: ");
            nota2[n] = le.nextDouble();
            System.out.print("Informe RM (negativo para encerrar): ");
            rmLido = le.nextInt();

        }
        return n;
    }

    public static void calcularMedia(double media[], double nota1[],double nota2[],int n) {

        for (int i = 0; i < n; i++) {
            media[i] = (nota1[i] + nota2[i]) / 2;
        }
    }

    public static int listaAprovados(int rm[], double media[], int[] aprovados, int n){
        int aux = 0;

        for (int i = 0; i < n; i++) {
            if (media[i] >= 6) {
                aprovados[aux] = rm[i];
                aux++;
            }
        }
        return aux;
    }
}


