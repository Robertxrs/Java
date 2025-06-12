package data;

public class Funcionario {

    private String name;
    private String cargo;
    private String matricula;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String name, String cargo, String matricula, Double salario) {
        this.name = name;
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
