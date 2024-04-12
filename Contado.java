import java.util.ArrayList;
import java.util.Scanner;

public class Contado extends Tramites{
    private static ArrayList<Object> listaContado = new ArrayList<>();

    @Override
    public void ingresarInmueble() {
        int resp;
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Inmueble inmueble = new Inmueble();

        inmueble.ingresarContado(listaContado);
        cliente.ingresarContado(listaContado);
        
        System.out.println("¿Cuenta con las Escrituras? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con las Escrituras o 2 si no.");
            resp = scanner.nextInt();
        }
        setEscrituras(convertirRespuesta(resp));
        listaContado.add("Escrituras: " + getEscrituras());

        System.out.println("¿Cuenta con el Recibo de Agua? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Recibo de Agua o 2 si no.");
            resp = scanner.nextInt();
        }
        setReciboagua(convertirRespuesta(resp));
        listaContado.add("Recibo de Agua: " + getReciboagua());

        System.out.println("¿Cuenta con el Recibo de Luz? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Recibo de Luz o 2 si no.");
            resp = scanner.nextInt();
        }
        setReciboluz(convertirRespuesta(resp));
        listaContado.add("Recibo de Luz: " + getReciboluz());

        System.out.println("¿Cuenta con el Pago predial? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Pago predial o 2 si no.");
            resp = scanner.nextInt();
        }
        setPagopredial(convertirRespuesta(resp));
        listaContado.add("Pago predial: " + getPagopredial());

        System.out.println("¿Cuenta con la Cédula catastral? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con la Cédula catastral o 2 si no.");
            resp = scanner.nextInt();
        }
        setCedulacastral(convertirRespuesta(resp));
        listaContado.add("Cédula catastral: " + getCedulacastral());

        System.out.println("¿Cuenta con el Alineamiento? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Alineamiento o 2 si no.");
            resp = scanner.nextInt();
        }
        setAlineamiento(convertirRespuesta(resp));
        listaContado.add("Alineamiento: " + getAlineamiento());
    }
     
    public ArrayList<Object> obtenerContado(){
        return listaContado;
    }

    public static String convertirRespuesta(int resp) {
        return resp == 1 ? "Sí" : "No";
    }
}
