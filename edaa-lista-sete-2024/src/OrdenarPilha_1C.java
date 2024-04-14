import java.util.Stack;
import java.util.PriorityQueue;

public class OrdenarPilha_1C {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(3);
        pilha.push(1);
        pilha.push(4);
        pilha.push(1);
        pilha.push(5);
        pilha.push(9);
        pilha = ordenarPilha(pilha);
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }

    public static Stack<Integer> ordenarPilha(Stack<Integer> pilha) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        while (!pilha.isEmpty()) {
            minHeap.add(pilha.pop());
        }

        while (!minHeap.isEmpty()) {
            pilha.push(minHeap.remove());
        }

        return pilha;
    }
}
