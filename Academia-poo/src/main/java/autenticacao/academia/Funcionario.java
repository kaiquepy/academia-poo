package autenticacao.academia;
        
public class Funcionario extends Pessoa {
    private String usuario;
    private String senha;
    

    public Funcionario(String nome, String cpf, String usuario, String senha) {
        super(nome, cpf);
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
@Override
    public String toString() {
        return "Funcionário [Nome: " + getNome() + ", CPF: " + getCpf() + ", Usuário: " + usuario + "]";
    }
}

