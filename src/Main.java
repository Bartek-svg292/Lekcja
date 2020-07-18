import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj srednice okregu");
        float sr = scanner.nextInt();
        float r = sr/2;

        System.out.println("Obwod wynosi : " + 2*PI*r);


    }


}
