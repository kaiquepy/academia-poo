package autenticacao.academia;

public class Aluno extends Pessoa {
    private String plano;
    private double saldoDevedor;

    public Aluno(String nome, String cpf, String plano) {
        super(nome, cpf);
        this.plano = plano;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }
@Override
public String toString() {
        return "Aluno [Nome: " + getNome() + ", CPF: " + getCpf() + ", Plano: " + plano + 
               ", Saldo Devedor: " + saldoDevedor + "]";
}
}

