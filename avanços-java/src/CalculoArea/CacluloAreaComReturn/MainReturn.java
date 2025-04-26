package CalculoArea.CacluloAreaComReturn;

public class MainReturn {
    public static void main(String[] args) {
        

        System.out.println("Exercício retornos");

        double areaQuadrado = CalculoArea.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = CalculoArea.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = CalculoArea.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}
