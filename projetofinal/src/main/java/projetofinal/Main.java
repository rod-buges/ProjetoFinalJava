package projetofinal;

public class Main {
    public static void main(String[] args) {
        CarrinhodeCompras carrinho1 = new CarrinhodeCompras();
        CarrinhodeCompras carrinho2 = new CarrinhodeCompras();

        Eletronico e1 = new Eletronico("Mouse Gamer", 89.90, 12, 2);
        Eletronico e2 = new Eletronico("Teclado Gamer", 189.90, 12, 1);
        Roupa r1 = new Roupa("Calça Skinny", 129.90, 3, "42", "Preto");
        Roupa r2 = new Roupa("Boné", 89.90, 2, "M", "Branco");
        Roupa r3 = new Roupa("Camiseta Lisa", 99.90, 3, "P", "Preto");
        Roupa r4 = new Roupa("Bermuda Linho", 89.90, 1, "42", "Branco");
        Roupa r5 = new Roupa("Blusa moletom", 119.90, 1, "42", "Cinza");
        Alimento a1 = new Alimento("Maça 1Kg",13.98,1,"12/11/2024");
        Alimento a2 = new Alimento("Banana 1Kg",12.98,1,"17/11/2024");
        Alimento a3 = new Alimento("Arroz 1Kg",29.90,1,"03/12/2024");
        Alimento a4 = new Alimento("Feijão 1Kg",22.50,1,"01/03/2025");
        Alimento a5 = new Alimento("Chocolate",5.99,1,"21/01/2025");
        Alimento a6 = new Alimento("Carne Bovina 1Kg",27.89,1,"12/11/2026");
        Alimento a7 = new Alimento("Grão de Milho 1Kg",19.89,1,"08/5/2025");

        carrinho1.adicionarProduto(e1);
        carrinho1.adicionarProduto(r1);
        carrinho1.adicionarProduto(r4);
        carrinho1.adicionarProduto(r5);
        carrinho1.adicionarProduto(a3);
        carrinho1.adicionarProduto(a2);
        carrinho1.adicionarProduto(a7);

        carrinho2.adicionarProduto(e2);
        carrinho2.adicionarProduto(r3);
        carrinho2.adicionarProduto(r2);
        carrinho2.adicionarProduto(a4);
        carrinho2.adicionarProduto(a1);
        carrinho2.adicionarProduto(a6);
        carrinho2.adicionarProduto(a5);

        System.out.println("Carrinho 1:");
        carrinho1.listarProdutos();
        System.out.println("Total: " + carrinho1.calcularTotal());
        System.out.println("-----------------------------------");
        System.out.println("Carrinho 2:");
        carrinho2.listarProdutos();
        System.out.println("Total: " + carrinho2.calcularTotal());

        carrinho1.gerarArquivo("Carrinho1.txt");
        carrinho2.gerarArquivo("Carrinho2.txt");
    }
}