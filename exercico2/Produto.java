package exercico2;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("Nome do produto:" + nome);
        System.out.println("Preço do produto: "+preco);
    }
}
