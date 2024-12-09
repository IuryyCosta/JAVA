package PadroesDeProjeto;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntar ao usuário qual marca deseja
        System.out.println("Escolha a marca (Toyota ou Ford): ");
        String brand = scanner.nextLine();

        // Perguntar ao usuário qual tipo de carro deseja
        System.out.println("Escolha o tipo de carro (SUV ou Sedan): ");
        String type = scanner.nextLine();

        // Escolher a fábrica com base na marca
        CarFactory factory;
        if (brand.equalsIgnoreCase("Toyota")) {
            factory = new ToyotaFactory();
        } else if (brand.equalsIgnoreCase("Ford")) {
            factory = new FordFactory();
        } else {
            System.out.println("Marca desconhecida!");
            scanner.close();
            return;
        }

        // Criar o carro com base no tipo
        Car car;
        if (type.equalsIgnoreCase("SUV")) {
            car = factory.createSUV();
        } else if (type.equalsIgnoreCase("Sedan")) {
            car = factory.createSedan();
        } else {
            System.out.println("Tipo de carro desconhecido!");
            scanner.close();
            return;
        }

        // Simular dirigir o carro
        car.drive();
        scanner.close();
    }
}
