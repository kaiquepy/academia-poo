package classes.academia;

public class Aula {
    private String id;
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
}

