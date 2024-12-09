package PadroesDeProjeto;

public class FordFactory implements  CarFactory{
    @Override
    public Suv createSuv(){
        return new ToyotaSuv();
    }

    @Override
    public Sedan createSedan() {
        return null;
    }
}
