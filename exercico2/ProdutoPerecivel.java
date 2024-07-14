package exercico2;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, String dataValidade){
        super(nome, preco);
        this.dataValidade=dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco, String dataValidade2) {
        //TODO Auto-generated constructor stub
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Tipo: Produto perecível");
        System.out.println("Data de validade"+ dataValidade);
    }
}
