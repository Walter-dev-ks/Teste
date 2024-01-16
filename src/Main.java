import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("VC DIGITOU: " + x);

        sc.close();

 */

        // Aula

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

    }
}