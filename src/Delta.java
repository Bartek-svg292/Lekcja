import java.util.Scanner;

public class Delta {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj liczbe a : ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe b : ");
        int b = scanner.nextInt();
        System.out.println("Podaj liczbe c : ");
        int c = scanner.nextInt();

        int delta = (b*b) - 4*a*c;
        if (delta < 0){

            System.out.println("delta jest ujemna :");
            return;

        }

        double x1 = ((-b - Math.sqrt(delta)) / 2 * a);
        double x2 = ((-b + Math.sqrt(delta)) / 2 * a);

        System.out.println("X1 wynosi = " + x1);
        System.out.println("X2 wynosi = " + x2);







    }

}
