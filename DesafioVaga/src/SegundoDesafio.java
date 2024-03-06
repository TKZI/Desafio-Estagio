import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SegundoDesafio {

    public static void main(String[] args) {

        List<Integer> sequencia = new ArrayList<>();
        Integer input;
        Scanner entrada = new Scanner(System.in);
        input = entrada.nextInt();
        sequencia.add(0);
        sequencia.add(1);

        for (int i = 0; i <= input; i++) {
            // faz a inclusão do numero atual + o numero anterior
            sequencia.add(sequencia.get(i + 1) + sequencia.get(i));
        }
        if (!sequencia.contains(input)) {
            System.out.println(String.format("O número %d não pertence a sequencia", input));
        } else {
            System.out.println(String.format("O número %d pertence a sequencia", input));
        }

        entrada.close();

    }

}
