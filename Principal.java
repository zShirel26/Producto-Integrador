public class Principal {

    public static void main(String[] args) {

        Operacion miOperacion = new Operacion();

        System.out.println("======== Menú de Operaciones ========");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Raíz cuadrada");
        System.out.println("6. Valor elevado a la potencia 5");
        System.out.println("=====================================");
        System.out.print("Elige una opción (1-6): ");
        

        int opcion = DatosEntrada.entero();

        if (opcion < 1 || opcion > 6) {
            System.out.println("Error. Ingrese un número del menú.");
            return;
        }

        boolean pedirValor2 = (opcion >= 1 && opcion <= 4);
        miOperacion.leeDatos(pedirValor2);

        switch (opcion) {
            case 1:
                miOperacion.suma();
                miOperacion.imprimirResultado();
                break;
            case 2:
                miOperacion.resta();
                miOperacion.imprimirResultado();
                break;
            case 3:
                miOperacion.multiplicacion();
                miOperacion.imprimirResultado();
                break;
            case 4:
                miOperacion.division();
                miOperacion.imprimirResultado();
                break;
            case 5:
                miOperacion.raizCuadrada();
                miOperacion.imprimirResultado();
                break;
            case 6:
                miOperacion.potencia5();
                miOperacion.imprimirResultado();
                break;
        }
    }
}
