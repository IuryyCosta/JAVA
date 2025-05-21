import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Sedan("Civic", 4));
        listaDeCarros.add(new Suv("HR-V", 5));
        listaDeCarros.add(new Sedan("Corolla", 4));
        listaDeCarros.add(new Suv("Tracker", 5));
   
        
         for (Carro carro : listaDeCarros) {
            carro.exibirInfo();
            System.out.println("--------------------");
        }
    }
}
