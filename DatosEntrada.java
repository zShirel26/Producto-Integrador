import java.io.*;
class DatosEntrada {
    private static final BufferedReader leeDato = new BufferedReader(new InputStreamReader(System.in));
    
    public static String cadena() {
        try {
            return leeDato.readLine();
        } catch (IOException e) {
            return " ";
        }
    }

    public static int entero() {
        try {
            return Integer.parseInt(cadena());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static double real() {
        try {
            return Double.parseDouble(cadena());
        } catch (NumberFormatException e) {
            return -1.0;
        }
    }
}
