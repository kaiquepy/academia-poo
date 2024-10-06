package classes.academia;

import java.util.List;

public class SistemaAcademia {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Aula> aulas;
    private List<Despesa> despesas;
    private List<Receita> receitas;

    public SistemaAcademia(List<Aluno> alunos, List<Professor> professores, List<Aula> aulas, List<Despesa> despesas, List<Receita> receitas) {
        this.alunos = alunos;
        this.professores = professores;
        this.aulas = aulas;
        this.despesas = despesas;
        this.receitas = receitas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }
@Override
public String toString() {
        return "SistemaAcademia [Alunos: " + alunos + 
               ", Professores: " + professores + ", Aulas: " + aulas + 
                ", Despesas: " + despesas + ", Receitas: " + receitas + "]";
}
}

