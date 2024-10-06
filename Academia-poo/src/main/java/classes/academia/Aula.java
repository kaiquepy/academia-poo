package classes.academia;

public class Aula {
    private String id;

    public Aula(String id, String nome, Professor professor, String horario, String vagasDisponiveis) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
        this.vagasDisponiveis = vagasDisponiveis;
    }
    private String nome;
    private Professor professor;
    private String horario;
    private String vagasDisponiveis;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(String vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }
@Override
public String toString() {
        return "Aula [Id: " + id + ", nome: " + nome + ", professor: " + professor + ", horario: " + horario + 
                ", vagas disponiveis: " + vagasDisponiveis + "]";
    }
}

