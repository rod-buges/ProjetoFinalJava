package projetofinal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CarrinhodeCompras {
    private List<Produto> produtos;

    public CarrinhodeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Nome do Produto: " + produto.getNome()+ ", Preço R$: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
        }
    }

    public double calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Produto produto : produtos) {
            total = total.add(BigDecimal.valueOf(produto.getPreco()));
        }
        return total.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public void gerarArquivo(String nomeArquivo){
        try {
            FileWriter writer = new FileWriter(nomeArquivo);
            for (Produto produto : produtos) {
                writer.write("Detalhes do Produto: " + produto.exibirDetalhes() + "\n");
            }
            writer.write("Total: " + calcularTotal());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

