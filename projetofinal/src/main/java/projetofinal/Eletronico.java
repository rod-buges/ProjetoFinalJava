package projetofinal;

public class Eletronico extends ProdutoBase {
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int garantiaMeses, int quantidade) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public Eletronico() {

    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String exibirDetalhes() {
        return "Nome do Produto: " + getNome() + ", Preço R$: " + getPreco() + ", Garantia: " + garantiaMeses + " meses, Quantidade: " + getQuantidade();
    }


    @Override
    public String getTipo() {
        return "Eletrônico";
    }
}
