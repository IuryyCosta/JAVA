public class Main {
    public static void main(String[] args) {
        // Criando um carro do tipo Sedan
        Carro meuSedan = new Sedan("Civic", 4);
        
        Carro meuSuv = new Suv("HR-V", 5);
        // Exibindo informações do SUV
        
        meuSuv.exibirInfo();

        // Exibindo informações do carro
        meuSedan.exibirInfo();
    }
}
