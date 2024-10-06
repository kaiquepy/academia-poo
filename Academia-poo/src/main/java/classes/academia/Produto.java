package classes.academia;

public class Produto {
    private String id;
    private String nome;
    private double preco;
    private String descricao;

    public Produto(String id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    @Override
    public String toString() {
        return "Produto [ID: " + id + ", Nome: " + nome + ", Preço: " + preco + 
                ", Descricao: " + descricao + "]";
    }
}

