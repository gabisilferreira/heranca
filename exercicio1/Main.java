package exercicio1;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 8000.00, "TI");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 5000.00, "Java");

        System.out.println("Detalhes do Gerente:");
        gerente.exibirDetalhes();

        System.out.println("\nDetalhes do Desenvolvedor:");
        desenvolvedor.exibirDetalhes();
    }
}
