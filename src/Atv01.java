public class Atv01 {
    public static void main(String[] args) {

        String[] ListaProfessores = {"Alana", "Alexia", "Jéssica", "Odirlei", "Possarle", "Samanta", "Thiago"};

        for (int contador = 0;  contador < ListaProfessores.length; contador++) {
            System.out.println("O índice atual é " + contador);

            if (contador == 0) {
                System.out.println("O número de índice do(a) professor(a) " + ListaProfessores[contador] + " é Zero.");
            } else if (contador % 2 == 0) {
                System.out.println("O número de índice do(a) professor(a) " + ListaProfessores[contador] + " é Par.");
            } else {
                System.out.println("O número de índice do(a) professor(a) " + ListaProfessores[contador] + " é Ímpar.");
            }
        }
    }
}