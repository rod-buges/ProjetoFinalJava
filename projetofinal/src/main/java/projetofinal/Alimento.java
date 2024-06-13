package projetofinal;

public class Alimento extends ProdutoBase {
    private String dataValidade;

    public Alimento (String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public Alimento (){

    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String exibirDetalhes() {
        return "Nome: " + getNome() + ", Preço: " + getPreco() + ", Quantidade: " + getQuantidade() + ", Data de Validade: " + getDataValidade();
    }

}
