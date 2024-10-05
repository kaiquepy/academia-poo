package autenticacao.academia;

public class Administrador extends Funcionario {
    private Academia academia;

    public Administrador(String nome, String cpf, String usuario, String senha, Academia academia) {
        super(nome, cpf, usuario, senha);
        this.academia = academia;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
@Override
    public String toString() {
        return "Administrador [Nome: " + getNome() + ", CPF: " + getCpf() + 
               ", Usuário: " + getUsuario() + ", Academia: " + academia.getNome() + "]";
    }
}

