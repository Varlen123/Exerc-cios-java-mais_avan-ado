package Empresa;

public class MainEmpresa {
    public static void main(String[] args) {
double salario = 5000.0;

Funcionarios gerente = new Funcionarios();
gerente.nome = "Varlen";
gerente.setIdade(35);
gerente.cargoFuncionario = "Gerente";
gerente.setTempoDeEmpresa(10);
gerente.setSalario(salario);

ImpostousOuBeneficios impostos = new ImpostousOuBeneficios(0.15, 0.05);

double impostosGerente = impostos.getImpostos() * gerente.getSalario();
double beneficiosGerente = impostos.getBeneficios() * gerente.getSalario();

System.out.println("Salário do Gerente: " + gerente.getSalario());
System.out.println("Impostos do Gerente: " + impostosGerente);
System.out.println("Benefícios do Gerente: " + beneficiosGerente);
System.out.println("Salário Liquido do Gerente: " + (gerente.getSalario() - impostosGerente + beneficiosGerente));
    }
}