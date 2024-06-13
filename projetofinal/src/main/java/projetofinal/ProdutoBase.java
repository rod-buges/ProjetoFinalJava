package projetofinal;

public abstract class ProdutoBase implements Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoBase(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public ProdutoBase() {

    }

    @Override
    public String getTipo() {
        return "Produto";
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public abstract String exibirDetalhes();
}