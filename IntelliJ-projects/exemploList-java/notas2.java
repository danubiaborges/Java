import java.util.*;

public class notas2 {
    public static void main(String[] args) {

        System.out.println("Crie uma lista chamada notas 2 " + "e coloque todos os elementos da list ArrayList nessa nova lista: ");

        List<Double> notas = new ArrayList<>();
        notas.add(8.0);
        notas.add(3.2);
        notas.add(2.8);
        notas.add(7.4);
        notas.add(9.8);
        System.out.println(notas);

        System.out.println("Mostre a primeira nota da nova lista sem removê-la: " + notas.indexOf(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-a: ");
        notas.remove(0);
        System.out.println(notas);

    }
}
