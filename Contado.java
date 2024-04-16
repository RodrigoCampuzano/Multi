import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Contado extends Tramites{
    private static ArrayList<Object> listaContado;
    private static ArrayList<Object> listadatos;
    public static Scanner scanner = new Scanner(System.in);
    Cliente cliente = new Cliente();
    Inmueble inmueble = new Inmueble();
    Calendar fecha=Calendar.getInstance();
    Principal validar = new Principal();

    @Override
    public void ingresarInmueble(ArrayList<Object> listaFinal) {
        int resp;

        listaContado = new ArrayList<>();
        listadatos = new ArrayList<>();

        inmueble.ingresarContado(listaContado);
        cliente.ingresarContado(listaContado);

        System.out.println("¿Cuenta con las Escrituras? 1: Sí");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setEscrituras(convertirRespuesta(resp));
        listaContado.add("Escrituras: " + getEscrituras());

        System.out.println("¿Cuenta con el Recibo de Agua? 1: Sí ");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setReciboagua(convertirRespuesta(resp));
        listaContado.add("Recibo de Agua: " + getReciboagua());

        System.out.println("¿Cuenta con el Recibo de Luz? 1: Sí");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setReciboluz(convertirRespuesta(resp));
        listaContado.add("Recibo de Luz: " + getReciboluz());

        System.out.println("¿Cuenta con el Pago predial? 1: Sí");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setPagopredial(convertirRespuesta(resp));
        listaContado.add("Pago predial: " + getPagopredial());

        System.out.println("¿Cuenta con la Cédula catastral? 1: Sí ");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setCedulacastral(convertirRespuesta(resp));
        listaContado.add("Cédula catastral: " + getCedulacastral());

        System.out.println("¿Cuenta con el Alineamiento? 1: Sí");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setAlineamiento(convertirRespuesta(resp));
        listaContado.add("Alineamiento: " + getAlineamiento());

            if (getEscrituras().equals("Sí") && getAlineamiento().equals("Sí") && getCedulacastral().equals("Sí") && getReciboluz().equals("Sí") && getReciboagua().equals("Sí") && getPagopredial().equals("Sí")) {
                setEstatus("Completo");
                listaContado.add("Estatus: " + getEstatus());
                listaContado.add("Se completo el: "+fecha.getTime().toString());
            }

            listadatos.add(listaContado);
            listaFinal.add(listadatos);
    }
     
    public static String convertirRespuesta(int resp) {
        return resp == 1 ? "Sí" : "No";
    }
}
