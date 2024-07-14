package exercicio1;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario (String nome, double salario){
        this.nome=nome;
        this.salario=salario;

    }



    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDetalhes(){
        System.out.println("Nome"+ nome);
        System.out.println("Salário"+ salario);
    }

}
