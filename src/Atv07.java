import java.util.Scanner;

public class Atv07 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é positivo ou negativo:");
        int numero = Integer.parseInt(leitor.next());

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0 ) {
            System.out.println("Negativo");
        } else {
            System.out.println("Neutro");
        }
    }
}
