package e04;

import java.util.Random;

/**
 *
 * @author Miguel González Mora
 */
public final class Password {

    private int longitud;
    private String contrasena;

    //Constructores
    public Password() {
        longitud = 0;
        contrasena = "";

    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = this.generarPassword();
    }

    public Password(String contrasena) {
        this.longitud = contrasena.length();
        this.contrasena = contrasena;
    }

    //Getters/Setters
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    //Metodos
    public String generarPassword() {

        final char[] caracteres = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'e', 'h', 'i', 'j', 'l', 'k', 'm',
            'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            '@', '#', '!', '$', '€', '&'
        };

        String temporal = "";

        Random aleatorio = new Random();

        for (int i = 0; i < this.longitud; i++) {
            temporal += caracteres[aleatorio.nextInt(caracteres.length)];
        }

        return temporal;
    }

    public boolean esFuerte(String contrasena) {
        int mayus = 0;
        int minus = 0;
        int numeros = 0;
        for (int i = 0; i < contrasena.length(); i++) {

            String caracter = Character.toString(contrasena.charAt(i));

            if (caracter == caracter.toUpperCase()) {
                mayus++;
            }

            if (caracter == caracter.toLowerCase()) {
                minus++;
            }

            if (Character.isDigit(caracter.charAt(0))) {
                numeros++;
            }

        }

        return mayus >= 2 && minus >= 1 && numeros >= 2;

    }

    @Override

    public String toString() {
        String segura = "";
        if (esFuerte(this.contrasena)) {
            segura += "si";
        } else {
            segura += "no";
        }

        return "Longitud: " + this.longitud + " Password: " + this.contrasena + " ¿Es segura?: " + segura;
    }
}
