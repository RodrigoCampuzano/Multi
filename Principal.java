import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static Scanner scanner = new Scanner(System.in);
    public static Contado contado = new Contado();
    public static Credito credito = new Credito();
    private static ArrayList<Object> listaFinal = new ArrayList<>();
    private static ArrayList<Object> listaCompletos = new ArrayList<>();
    private static ArrayList<Object> listaIncompletos = new ArrayList<>();
    

    public static void main(String[] args){
        int respuesta=0;
        do {
            verMenu();
            respuesta=1;
        } while (respuesta==1);
        
    }

    public static void verMenu() {
        int opcion, count = 0;
        
        System.out.println("¿Qué desea hacer?\n1.- Ingresar Inmueble\n2.- Mostrar Ingresados\n3.-Salir");
        do {
            count++;
            if (count != 1) {
                System.out.println("¿Qué desea hacer?\n1.- Ingresar Inmueble\n2.- Mostrar Ingresados");
            }
            opcion = decidir();
            switch (opcion) {
                case 1:
                    System.out.println("1.-Credito \n2.-Contado");
                    int btn;
                    do {
                        btn = decidir();
                        switch (btn) {
                            case 1:
                                credito.ingresarInmueble(listaFinal);
                                break;
                            case 2:
                                contado.ingresarInmueble(listaFinal);
                                break;
                            default:
                                System.out.println("Por favor, seleccione una opción válida (1 | 2).");
                                break;
                        }
                    } while (btn != 1 && btn != 2); 
                    break;
                case 2:
                    System.out.println("1.- Mostrar todos los datos ingresados\n2.- Mostrar Completos\n3.- Mostrar Incompletos");
                    opcion = decidir();
                    visualizarInformacion();
                    switch (opcion) {
                        case 1:
                            imprimirCompletos(listaCompletos);
                            imprimirIncompletos(listaIncompletos);
                            break;
                        case 2:
                            imprimirCompletos(listaCompletos);
                            break;
                        case 3:
                            imprimirIncompletos(listaIncompletos);
                            break;
                        default:
                            System.out.println("Por favor, seleccione una opción válida (1-3).");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Que tenga un buen día");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida (1 | 2 | 3).");
                    break;
            }
            listaCompletos.clear();
            listaIncompletos.clear();
        } while (opcion != 1 && opcion != 2 && opcion != 3);
    }

    public static void visualizarInformacion() {
        if (!listaFinal.isEmpty()) {
            for (Object listaInternaObj : listaFinal) {
                if (listaInternaObj instanceof ArrayList) {
                    ArrayList<Object> listaInterna = (ArrayList<Object>) listaInternaObj;
                    for (Object listainterna2Obj : listaInterna) {
                        if (listainterna2Obj instanceof ArrayList) {
                            ArrayList<Object> listainterna2 = (ArrayList<Object>) listainterna2Obj;
                            for (Object element : listainterna2) {
                                if (element instanceof String) {
                                    String status = (String) element;
                                    if (status.equals("Estatus: Completo")) {
                                        listaCompletos.addAll(listainterna2);
                                    } else if (status.equals("Estatus: No completo")) {
                                        listaIncompletos.addAll(listainterna2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void imprimirCompletos(ArrayList<Object> listaCompletos) {
        System.out.println("Elementos completos: \n");
        for (Object object : listaCompletos) {
            System.out.println(object);
        }
        System.out.println("----------------------------------");
        listaCompletos.clear();
    }
    
    public static void imprimirIncompletos(ArrayList<Object> listaIncompletos) {
        System.out.println("Elementos incompletos: \n");
        for (Object object : listaIncompletos) {
            System.out.println(object);
        }
        System.out.println("----------------------------------");
        listaIncompletos.clear();
    }
    
    public static int decidir(){
        int indice = 0;
        boolean excepcion = true;
        do{
            try{
                indice = validarEleccion();
                excepcion = false;
            }catch(InputMismatchException e){
                System.out.println("\n¡Escribió una letra!\n");
                System.out.println("vuelva a introducir la opcion");
            }
            
        }while(excepcion);
        
        return indice;
       
    } 

    public static int validarEleccion() throws InputMismatchException{
        Scanner entrada = new Scanner(System.in);
        int eleccion = entrada.nextInt();
        return eleccion;
    }
}
