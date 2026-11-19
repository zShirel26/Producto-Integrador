public class Operacion {

    private double valor1;
    private double valor2;
    private double resultado;
    private boolean error;

    public void leeDatos(boolean pedirValor2) {
        System.out.print("Escribe el primer valor real: ");
        valor1 = DatosEntrada.real();

        if (pedirValor2) {
            System.out.print("Escribe el segundo valor real: ");
            valor2 = DatosEntrada.real();
        }
    }

    public void suma() {
        error = false;
        resultado = valor1 + valor2;
    }

    public void resta() {
        error = false;
        resultado = valor1 - valor2;
    }

    public void multiplicacion() {
        error = false;
        resultado = valor1 * valor2;
    }

    public void division() {
        if (valor2 == 0) {
            error = true;
            System.out.println("Error.No puedes dividir entre 0.");
        } else {
            error = false;
            resultado = valor1 / valor2;
        }
    }

    public void raizCuadrada() {
        if (valor1 < 0) {
            error = true;
            System.out.println("Error. no existe raíz cuadrada que de un número negativo.");
        } else {
            error = false;
            resultado = Math.sqrt(valor1);
        }
    }

    public void potencia5() {
        error = false;
        resultado = Math.pow(valor1, 5);
    }

    public void imprimirResultado() {
        if (!error) {
            System.out.println("El resultado de la operación es: " + resultado);
        }
    }
}
