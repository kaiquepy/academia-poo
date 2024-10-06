package classes.academia;

public class Funcionario {
    private String usuario;
    private String senha;

    public Funcionario(String usuario, String senha) {
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
        return "Funcionario [Usuario: " + usuario + 
               ", Senha: " + senha + "]";
}
}

