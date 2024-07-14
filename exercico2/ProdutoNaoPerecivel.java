package exercico2;

public class ProdutoNaoPerecivel extends Produto{
    public ProdutoNaoPerecivel(String nome, double preco){
        super(nome,preco);
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Produto não perecível");
    }
}
