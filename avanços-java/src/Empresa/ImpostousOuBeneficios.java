package Empresa;

public class ImpostousOuBeneficios {
    private double impostos;
    private double beneficios;

    public ImpostousOuBeneficios(double impostos, double beneficios) {
        this.impostos = impostos;
        this.beneficios = beneficios;
    }

    public double getImpostos() {
        return impostos;
    }

    public double getBeneficios() {
        return beneficios;
    }
}
