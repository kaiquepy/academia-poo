package autenticacao.academia;

import java.util.List;

public class Professor extends Pessoa {
    private String especialidade;
    private List<String> horarioDisponivel;

    public Professor(String nome, String cpf, String especialidade) {
        super(nome, cpf);
        this.especialidade = especialidade;
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
        return "Professor [Nome: " + getNome() + ", CPF: " + getCpf() + ", Especialidade: " + especialidade + 
               ", Horários Disponíveis: " + horarioDisponivel + "]";
    }  
}

