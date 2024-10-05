package autenticacao.academia;

import java.util.ArrayList;

public class Academia {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList();

    public Academia(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
@Override
    public String toString() {
        return "Academia [Nome: " + nome + "]";
    }
}


