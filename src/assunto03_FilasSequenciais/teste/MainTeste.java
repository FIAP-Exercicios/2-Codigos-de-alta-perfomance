package assunto03_FilasSequenciais.teste;

import assunto03_FilasSequenciais.filas.FilaInt;

public class MainTeste {
    public static void main(String[] args) {
        FilaInt fila= new FilaInt();
        fila.init();
        fila.enqueue(23);
        fila.enqueue(66);
        fila.enqueue(17);
        fila.enqueue(44);
        if (fila.isEmpty()){
            System.out.println("Fila vazia");
        }
        else{
            System.out.println("Valor retirado da fila: "+ fila.dequeue());
        }
    }
}
