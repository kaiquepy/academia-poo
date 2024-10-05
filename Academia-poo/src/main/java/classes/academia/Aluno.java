package classes.academia;

public class Aluno {
    private String plano;
    private double saldoDevedor;
    
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

