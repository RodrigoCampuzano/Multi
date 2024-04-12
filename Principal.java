import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static Scanner scanner = new Scanner(System.in);
    public static Contado contado = new Contado();
    public static Credito credito = new Credito();

    public static void main(String[] args){
        String respuesta;
        do {
            verMenu();
            System.out.println("¿Desea volver al menu? (si/no)");
            respuesta=scanner.next();
        } while (respuesta.equals("si"));
        
    }

    public static void verMenu(){
        System.out.println("¿Que desea hacer? \n 1.-Ingresar Inmueble \n 2.-Mostrar Ingresados");
        int opcion;
        do {
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    elegirImueble();
                    break;
                case 2:
                    visualizarInormacion();
                    break;
                default:
                System.out.println("Por favor, seleccione una opción válida (1 | 2).");
                    break;
            }    
        } while (opcion != 1 && opcion != 2);
        
        
    }

    public static void elegirImueble(){
        System.out.println("1.-Credito \n2.-Contado");
        int btn;
        do {
            btn = scanner.nextInt();
        switch (btn) {
            case 1:
                do {
                    System.out.println("1.-Ingresar Tramite  |  2.-Actualizar Tramite  |  3.-Eliminar Tamite");
                    btn = scanner.nextInt();
                switch (btn) {
                    case 1:
                        credito.ingresarInmueble();
                        break;
                    case 2:
                        credito.seleccionarInmueble();
                        break;
                    case 3:
                        credito.eliminarInmueble();
                        verMenu();
                        break;
                    default:
                    System.out.println("Por favor, seleccione una opción válida (1 | 2 | 3).");
                        break;
                }
                } while (btn != 1 && btn != 2 && btn !=3); 
                break;
            case 2:
                contado.ingresarInmueble();
                break;
            default:
            System.out.println("Por favor, seleccione una opción válida (1 | 2).");
                break;
            }
        } while (btn != 1 && btn != 2); 
    }

    public static void visualizarInormacion(){
        ArrayList<Object> listanuevaCredito = credito.obtenerCredito();
        ArrayList<Object> listanuevaContado = contado.obtenerContado();
        System.out.println("-----------------------------");
        for (Object credito : listanuevaCredito) {
            System.out.println(credito);
        }System.out.println("-----------------------------");
        for (Object contado : listanuevaContado) {
            System.out.println(contado);
        }System.out.println("-----------------------------");
    }
}
