package application;

import java.util.Objects;

public class Consulta {

    private String paciente;
    private String cpf;
    private String telefone;
    private String data;
    private boolean ehPaciente;
    private boolean consultaRealizada;
    private String observacoes;

    public Consulta(String paciente, String cpf, String telefone, String data, boolean ehPaciente) {
        this.paciente = paciente;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.ehPaciente = ehPaciente;
        this.consultaRealizada = false;
    }

    // Getters e setters aqui
    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isEhPaciente() {
        return ehPaciente;
    }

    public void setEraPaciente(boolean ehPaciente) {
        this.ehPaciente = ehPaciente;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s",
                paciente, cpf, telefone, data, ehPaciente ? "Sim" : "Não", consultaRealizada ? "Sim" : "Não");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Consulta consulta = (Consulta) o;
        return cpf.equals(consulta.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }
}
