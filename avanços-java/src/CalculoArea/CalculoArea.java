package CalculoArea;

public class CalculoArea {
    public static void AreaQuadrado(double lado){
        double area = lado * lado;
        System.out.println("A area do quadrado de lado " + lado + " eh " + area);
    }

    public static void AreaRetangulo(double base, double altura){
        double area = base * altura;
        System.out.println("A area do retângulo de base " + base + " e altura de " + altura + " é = " + area );
    }

    public static void AreaTrapezio (double baseMaior, double baseMenor, double altura){
        double area = ((baseMaior + baseMenor) * altura)/2;
        System.out.println("A area do trapézio é " + area);
    }
}
