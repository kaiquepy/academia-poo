package classes.academia;

import java.util.*;

public class EstoqueLoja {
    private List<Produto> produtos;
    private Map<Produto, Integer> quantidade;

    public EstoqueLoja() {
        this.produtos = new ArrayList<>();
        this.quantidade = new HashMap<>();
    }
    // adicionar produtos
    public void adicionarProduto(Produto produto, int quantidade) {
        this.produtos.add(produto);
        this.quantidade.put(produto, quantidade);
    }
    // remover produtos
    public void removerProduto(String idProduto) {
        Produto produtoRemover = null;
        for (Produto produto : produtos) {
            if (produto.getId().equals(idProduto)) {
                produtoRemover = produto;
                break;
            }
        }
        if (produtoRemover != null) {
            this.produtos.remove(produtoRemover);
            this.quantidade.remove(produtoRemover);
        }
    }

    // listar os produtos do estoque
    public List<Produto> listarProdutos() {
        return produtos;
    }

    // verificar a disponibilidade de um produto
    public int verificarDisponibilidade(String idProduto) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(idProduto)) {
                return this.quantidade.get(produto);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Estoque [Produtos: " + produtos + ", Quantidade: " + quantidade + "]";
    }
}

