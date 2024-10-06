package classes.academia;

public class Receita {
    private String tipo;
    private double valor;
    private String data;

    public Receita(String tipo, double valor, String data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
@Override
public String toString() {
        return "Despesa [Tipo: " + tipo + 
               ", Valor: " + valor + ", data: " + data + "]";
    }
}
