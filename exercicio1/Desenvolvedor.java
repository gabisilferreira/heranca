package exercicio1;

public class Desenvolvedor extends Funcionario {
    String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem= linguagem;
    }

   public void exibirDetalhes(){
    super.exibirDetalhes();
    System.out.println("Linguagem:"+ linguagem);
   }
}
