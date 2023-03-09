import java.util.Scanner;

public class TestyJednostkowe {

    static float bokA;
    static float bokB;
    static float pole;
    static float obwod;

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);


        System.out.print("Podaj bok A prostokąta: ");
        bokA = scanner.nextFloat();

        System.out.print("Podaj bok B prostokąta: ");
        bokB = scanner.nextFloat();

        prostokat prostokat = new prostokat(bokA, bokB);
        pole = prostokat.ObliczPole();
        obwod = prostokat.ObliczObwod();

        System.out.print("Pole prostokąta o bokach" + bokA + " i " + bokB + " wynosi: " + pole);
        System.out.print("Obwód prostokąta o bokach" + bokA + " i " + bokB + " wynosi: " + obwod);

    }
}