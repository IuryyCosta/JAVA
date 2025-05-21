


public class Main {
     public static void main(String[] args) {
        Class<Produto> clazz = Produto.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.value());
        } else {
            System.out.println("A classe não tem anotação Tabela.");
        }
    }
}
