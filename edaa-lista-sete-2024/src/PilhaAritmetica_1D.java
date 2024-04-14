import java.util.Stack;

public class PilhaAritmetica_1D {
 public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(5);
        pilha.push(10);
        pilha.push(3);
        pilha.push(8);
        
        menorMaiorMedia(pilha);
    }
    
    public static void menorMaiorMedia(Stack<Integer> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int quantidade = pilha.size();
        
        for (int num : pilha) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            soma += num;
        }
        
        double media = (double) soma / quantidade;
        
        System.out.println("Pilha original: " + pilha);
        System.out.println();
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Média: " + media);
    }
}