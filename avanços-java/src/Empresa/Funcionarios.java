package Empresa;

public class Funcionarios {
    public String nome;
    private int idade;
    public String cargoFuncionario;
    private int tempoDeEmpresa;
    private double salario;
        public void setIdade(int idade) {
        this.idade = idade;
    }
        public int getIdade() {
        return idade;
    }
        public double getSalario() {
        return salario;
    }
        public void setSalario(double salario) {
        this.salario = salario;
    }
        public int getTempoDeEmpresa() {
        return tempoDeEmpresa;
    }
        public void setTempoDeEmpresa(int tempoDeEmpresa) {
        this.tempoDeEmpresa = tempoDeEmpresa;
    }
}