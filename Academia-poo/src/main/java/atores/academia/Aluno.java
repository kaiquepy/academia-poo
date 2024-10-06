package atores.academia;

public class Aluno {
    private String plano;
    private double saldoDevedor;

    public Aluno(String plano, double saldoDevedor) {
        this.plano = plano;
        this.saldoDevedor = saldoDevedor;
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
        return "Aluno [Plano: " + plano + 
               ", Saldo Devedor: " + saldoDevedor + "]";
}
}

