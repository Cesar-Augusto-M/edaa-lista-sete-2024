import java.util.Scanner;
import java.util.Stack;

public class ConversaoNumerica_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número decimal para ser convertido:");
        int numeroDecimal = sc.nextInt();

        System.out.println("Base para conversão:");
        System.out.println("a) Decimal para Binário");
        System.out.println("b) Decimal para Octal");
        System.out.println("c) Decimal para Hexadecimal");
        String opcao = sc.next();

        sc.close();

        switch (opcao) {
            case "a":
                System.out.println("Binário: " + decimalParaBase(numeroDecimal, 2));
                break;
            case "b":
                System.out.println("Octal: " + decimalParaBase(numeroDecimal, 8));
                break;
            case "c":
                System.out.println("Hexadecimal: " + decimalParaBase(numeroDecimal, 16));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public static String decimalParaBase(int numeroDecimal, int base) {
        Stack<Integer> pilha = new Stack<>();

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % base;
            pilha.push(resto);
            numeroDecimal /= base;
        }

        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.append(digitoChar(pilha.pop()));
        }

        return resultado.toString();
    }

    public static char digitoChar(int digito) {
        if (digito < 10) {
            return (char) (digito + '0');
        } else {
            return (char) (digito - 10 + 'A');
        }
    }
}
