import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConvierteMoneda convierteMoneda = new ConvierteMoneda();
        AlmacenaDivisa almacenaDivisa = new AlmacenaDivisa();
        while (true) {
            System.out.println("------CONVERSOR DE MONEDAS------");
            almacenaDivisa.muestraDivisa();
            System.out.println("Presione 0 para salir");
            System.out.println("------SELECCIONA LA PRIMERA DIVISA------");
            System.out.println("Ingrese una opcion: ");

            try {
                var primerDivisa = Integer.valueOf(entrada.nextLine());

                if (primerDivisa == 0){
                    System.out.println("Finalizó el programa.");
                    break;
                }

                System.out.println("Presione 0 para salir");
                System.out.println("------SELECCIONA LA SEGUNDA DIVISA------");
                System.out.println("Ingrese otra opcion: ");

                var segundaDivisa = Integer.valueOf(entrada.nextLine());

                if (segundaDivisa == 0){
                    System.out.println("Finalizó el programa.");
                    break;
                }

                if (!primerDivisa.equals(segundaDivisa) &&
                        primerDivisa > 0 && primerDivisa < 16 &&
                        segundaDivisa > 0 && segundaDivisa < 16) {
                    System.out.println("\n---------------------------------");
                    System.out.println("Ingrese la cantidad a convertir:");
                    var cantidad = Integer.valueOf(entrada.nextLine());

                    var valoresDeMoneda= convierteMoneda.convierteDivisa(almacenaDivisa.obtenerCodigoPorId(primerDivisa-1),
                            almacenaDivisa.obtenerCodigoPorId(segundaDivisa-1), cantidad);
                    var resultado = valoresDeMoneda.formatResultado(cantidad);
                    System.out.println("\n******************************************************************\n" +
                            resultado + "\n******************************************************************\n");
                    entrada.nextLine();
                }
                else {
                    System.out.println("\nSeleccione opciones válidas. Intente otra vez.\n");
                    entrada.nextLine();
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
                entrada.nextLine();
            }
        }
    }
}
