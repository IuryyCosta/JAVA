package PadroesDeProjeto;

public class ToyotaFactory implements  CarFactory{

    public Suv createSuv(){
        return new ToyotaSuv();
    }

    @Override
    public Sedan createSedan() {
        return null;
    }
}
