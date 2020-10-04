package e04;

import java.util.Scanner;

/**
 *
 * @author Miguel González Mora
 */
public class E04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud = 0;

        System.out.println("Introduzca longitud de contraseña (ponga 0 para crear longitud por defecto): ");
        longitud = sc.nextInt();    //pedir por teclado que longitud desea que tenga la contraseña

        if (longitud == 0) {
            longitud = 5;           //condición de longitud. Si introducimos un 0, por defecto se nos genera una contraseña con una longitud de 5
        }

        Password listaClaves[] = new Password[10];

        for (int i = 0; i < listaClaves.length; i++) {
            listaClaves[i] = new Password(longitud);
            System.out.println(listaClaves[i]);

        }

    }

}
