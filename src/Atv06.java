import java.util.Scanner;

public class Atv06 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float primeiraNota = Float.parseFloat(leitor.next());

        System.out.println("Digite a segunda nota: ");
        float segundaNota = Float.parseFloat(leitor.next());

        float media = (primeiraNota + segundaNota) / 2;

        if (media >= 6) {
            System.out.println("Meus parabéns!");
        } else {
            System.out.println("Você não passou. Estude um pouco mais!");
        }
    }
}
