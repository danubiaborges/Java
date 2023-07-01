package retornos;

public class main {

    public static void main(String[] args) {

        System.out.println("Exercício Retornos");

        double areaQuadrado = quadrilatero.area(3);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = quadrilatero.area(5, 5);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = quadrilatero.area(7, 8, 9);
        System.out.println("Área do Trapézio: " + areaTrapezio);
    }
}
