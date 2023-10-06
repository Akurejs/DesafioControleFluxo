import java.util.Scanner;

class BadInputException extends Exception {
    public BadInputException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (BadInputException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws BadInputException {
        if (parametroUm >= parametroDois) {
            throw new BadInputException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidadeIteracoes = parametroDois - parametroUm + 1;

        for (int i = 1; i <= quantidadeIteracoes; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i - 1));
        }
    }
}
