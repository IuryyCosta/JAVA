
public class Suv extends Carro {

    // Atributo específico da classe SUV
	private int numPortas;

    public Suv(String modelo, int numPortas) {
        super(modelo);
        this.numPortas = numPortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número de portas: " + numPortas);
    }
}
