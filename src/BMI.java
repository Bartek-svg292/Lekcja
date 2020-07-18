import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoja wage");
        float waga = scanner.nextFloat();
        System.out.println("Podaj swoj wzrost w cm");
        int wzrost = scanner.nextInt();

        float BMI = waga/(wzrost*wzrost);

        if (BMI <18.5 || BMI > 24.9){

            System.out.println("BMI optymalne");

        }else{

            System.out.println("BMI nieoptymalne");

        }





    }

}
