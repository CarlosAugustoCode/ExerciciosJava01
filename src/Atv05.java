import java.util.ArrayList;

public class Atv05 {
    public static void main(String[] args) {
        ArrayList<String> listaCarros = new ArrayList<>();
        listaCarros.add("Fiesta");
        listaCarros.add("Onix");
        listaCarros.add("Fusca");
        listaCarros.add("Saveiro");

        for (String carro : listaCarros) {
            System.out.println("O carro atual: " + carro);
        }
    }
}
