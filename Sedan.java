

public class Sedan extends Carro {
    
    private int numPortas;

    public Sedan(String modelo, int numPortas) {
        super(modelo);
        this.numPortas = numPortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número de portas: " + numPortas);
    }

}
