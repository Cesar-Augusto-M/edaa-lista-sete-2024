import java.util.Stack;

public class Palindromo_1B {
    public static void main(String[] args) {
        String palavra = "arara";
        boolean resultado = ehPalindromo(palavra);
        System.out.println("A palavra '" + palavra + "' é um palíndromo? " + resultado);
        
        palavra = "java";
        resultado = ehPalindromo(palavra);
        System.out.println("A palavra '" + palavra + "' é um palíndromo? " + resultado);

    }

    public static boolean ehPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        String palavraInvertida = "";
        while (!pilha.isEmpty()) {
            palavraInvertida += pilha.pop();
        }

        return palavra.equalsIgnoreCase(palavraInvertida);
    }
}
