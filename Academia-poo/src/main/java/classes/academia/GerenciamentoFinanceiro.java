package classes.academia;

import java.util.List;

public class GerenciamentoFinanceiro {
    private List<Receita> receitas;

    public GerenciamentoFinanceiro(List<Receita> receitas, List<Despesa> despesas) {
        this.receitas = receitas;
        this.despesas = despesas;
    }
    private List<Despesa> despesas;

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }
@Override
public String toString() {
        return "GerenciamentoFinanceiro [Receitas: " + receitas + 
               ", Despesas: " + despesas + "]";
    }
}
