import java.util.Scanner;

public class QuintoDesafio {
    public static void main(String[] args) {

        String input, inversao;
        char atual;
        StringBuilder concatenar = new StringBuilder();

        Scanner entrada = new Scanner(System.in);

        input = entrada.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            atual = input.charAt(i);
            concatenar.append(atual);

        }
        inversao = concatenar.toString();
        System.out.println(inversao);

        entrada.close();
    }

}
