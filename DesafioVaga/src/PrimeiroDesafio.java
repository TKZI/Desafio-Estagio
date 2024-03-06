public class PrimeiroDesafio {

    public static void main(String[] args) {

        int indice, k, soma;

        indice = 13;
        soma = 0;

        for (k = 0; k < indice; k++) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println(soma);
    }

}
