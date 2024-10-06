package atores.academia;

import java.util.List;

public class Professor extends Pessoa {
    private String especialidade;
    private List<String> horarioDisponivel;

    public Professor(String nome, String cpf, String especialidade, List<String> horarioDisponivel) {
        super(nome, cpf);
        this.especialidade = especialidade;
        this.horarioDisponivel = horarioDisponivel;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<String> getHorarioDisponivel() {
        return horarioDisponivel;
    }

    public void setHorarioDisponivel(List<String> horarioDisponivel) {
        this.horarioDisponivel = horarioDisponivel;
    }
@Override
public String toString() {
        return "Professor [Especialidade: " + especialidade + 
               ", HorarioDisponivel: " + horarioDisponivel + "]";
}
}

