import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("VC DIGITOU: " + x);

        sc.close();

 */

        // Aula
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Que horas são? ");
        int hora = sc.nextInt();

        if (hora <= 12){
            System.out.println("Bom dia!");
        } else {
            if (hora >=13 && hora <= 18){
                System.out.println("Boa tarde!");
            } else if (hora <= 24){
                System.out.println("Boa noite!");
            } else {
                System.out.println("Informe uma hora de 0 á 24");
                //teste dps do git
            }
        }
        sc.close();
        */

        // Aula for com break-point

/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            int x = i;
            int y = 0 + x;

            System.out.println("x = " + y);
        }

        sc.close();
*/

        // Aula Do-While
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);


        char repetir;
        do {

            System.out.print("Digite a temperatura em Celsius: ");
            double tempCelsius = sc.nextDouble();

            double resultado = (9.0 * tempCelsius) / 5 + 32;

            System.out.printf("A temperatura convertida para Fahrenheit: %.1f%n", resultado);

            repetir = 'Y';
            System.out.print("Deseja repetir a operação? (N/Y)");
            repetir = sc.next().charAt(0);

        } while (repetir != 'N' && repetir != 'n');

        sc.close();
    }
}