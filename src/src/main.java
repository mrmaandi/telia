import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Sisesta tund:");
            int hour = reader.nextInt();

            while ((hour < 0) || (hour > 12)) {
                System.out.println("Palun sisesta korrektne tund.\n");
                hour = reader.nextInt();
            }

            System.out.println("Sisesta minutid:");
            int minute = reader.nextInt();

            while ((minute < 0) || (hour > 12)) {
                System.out.println("Palun sisesta korrektne minutite arv.\n");
                minute = reader.nextInt();
            }

            reader.close();
            System.out.println(hour + ", " + minute);
            CalculateDegrees calculator = new CalculateDegrees(hour, minute);
            System.out.println(calculator.toString());
        } catch (InputMismatchException e) {
            System.out.println("Vale sisend.");
        }
    }
}
