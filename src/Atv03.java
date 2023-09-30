import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String numero;

        do {
            System.out.println("Digite um número: ");
            numero = leitor.next();
        } while (!numero.equals("0"));
    }
}
