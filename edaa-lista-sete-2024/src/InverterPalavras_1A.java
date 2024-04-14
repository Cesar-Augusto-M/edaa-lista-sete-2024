import java.util.Stack;

public class InverterPalavras_1A {
    public static void main(String[] args) {
        String texto = "ESTE EXERCÍCIO É MUITO FÁCIL.";
        System.out.println(inverterPalavras(texto));
    }

    public static String inverterPalavras(String texto) {
        Stack<Character> pilha = new Stack<>();
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ' && texto.charAt(i) != '.') {
                pilha.push(texto.charAt(i));
            } else {
                while (!pilha.isEmpty()) {
                    resultado += pilha.pop();
                }
                resultado += texto.charAt(i);
            }
        }
        return resultado;
    }
}
