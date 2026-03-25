package assunto02_Pilhas_Squenciais.pilhas;

public class PilhasInt {
    final int N = 6;
    int[] dados = new int[N];
    int topo;

    public void init(){
        topo = 0;

    }
    public boolean isEmpty(){
        return (topo==0);
    }
    public boolean isFull(){
        return (topo== N);
    }
    public void push(int elem){
        if (isFull()){
            System.out.println("Stack overflow");
        }
        else {
            dados[topo] = elem;
            topo++;
        }
    }
    public int top(){
        return dados[topo-1];
    }
    public int pop(){
            topo--;
            return (dados[topo]);

    }


}
