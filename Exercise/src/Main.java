import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Exercise n. 1-----------");
        int result = multiplication(5, 3);
        System.out.println(result);

        String complete = concatenate("La mia età è ", 35);
        System.out.println(complete);
        String[] random = {"ciao", "hello", "hi", "deci"};
        String[] newArray = arrayComplete(random, "frac");
        System.out.println(Arrays.toString(newArray));

        System.out.println("------------Exercise n. 2----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima frase");
        String str1 = scanner.nextLine();
        System.out.println("Inserisci la seconda frase");
        String str2 = scanner.nextLine();
        System.out.println("Inserisci la terza frase");
        String str3 = scanner.nextLine();
        orderReverse(str1, str2, str3);

        System.out.println("-------------Exercise n.3---------------");
        System.out.print("Inserisci la lunghezza del rettangolo: ");
        double length = scanner.nextDouble();
        System.out.print("Inserisci la larghezza del rettangolo: ");
        double width = scanner.nextDouble();
        double perimeter = perimeterRectangle(length, width);
        System.out.println("Il perimetro del rettangolo è " + perimeter);

        System.out.println("Inserisci un numero intero, se il risultato è 0 il numero è pari, se esce 1 è dispari");
        int numero = scanner.nextInt();
        System.out.println(evenOrOdd(numero));

        System.out.print("Inserisci 3 lati di un triangolo per calcolare l'area");
        double lato1 = scanner.nextDouble();
        double lato2 = scanner.nextDouble();
        double lato3 = scanner.nextDouble();
        double perimeterTrian = perimeterTriangle(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è " + perimeterTrian);

        scanner.close();
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatenate(String phrase, int num3) {
        return phrase + num3;
    }

    public static String[] arrayComplete(String[] arrayIncomplete, String world) {
        String[] completeArray = new String[5];
        for (int i = 0; i < 4; i++) {
            completeArray[i] = arrayIncomplete[i];
        }
        completeArray[4] = world;
        return completeArray;
    }

    public static void orderReverse(String str1, String str2, String str3) {
        System.out.println(str1 + str2 + str3);
        System.out.println(str3 + str2 + str1);
    }

    public static double perimeterRectangle(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    public static int evenOrOdd(int number) {
        return number % 2;
    }

    public static double perimeterTriangle(double side1, double side2, double side3) {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }
}