package exercicio1;

public class Gerente extends Funcionario{
    String departamento;

    public Gerente(String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento= departamento;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Departamento: "+ departamento);
    }
}
