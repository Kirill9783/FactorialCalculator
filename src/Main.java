import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число от 1 до 12: ");
        int value = new Scanner(System.in).nextInt();
        int resultFactorial = 1;

        for (int i = 1; i <=value; i = i + 1) {
            resultFactorial = resultFactorial * i;
        }

        System.out.println("Факториал числа " + value + " равен: " + resultFactorial);

    }
}