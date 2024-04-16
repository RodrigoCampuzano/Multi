import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Credito extends Tramites {
    private static ArrayList<Object> listaCredito;
    private static ArrayList<Object> listadatos;
    public static Scanner scanner = new Scanner(System.in);
    private int plazos;
    Cliente cliente = new Cliente();
    Inmueble inmueble = new Inmueble();
    Calendar fecha = Calendar.getInstance();
    Principal validar = new Principal();
    
    
    public int getPlazos() {
        return plazos;
    }
    public void setPlazos(int plazos) {
        this.plazos = plazos;
    }


    @Override
    public void ingresarInmueble(ArrayList<Object> listaFinal){
        int resp;

        listaCredito = new ArrayList<>();
        listadatos = new ArrayList<>();

        inmueble.ingresarCredito(listaCredito);
        cliente.ingresarCredito(listaCredito);

        System.out.println("¿Cuenta con las Escrituras? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con las Escrituras o 2 si no.");
            resp = validar.decidir();
        }
        setEscrituras(convertirRespuesta(resp));
        listaCredito.add("Escrituras: " + getEscrituras());

        System.out.println("¿Cuenta con el Recibo de Agua? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Recibo de Agua o 2 si no.");
            resp = validar.decidir();
        }
        setReciboagua(convertirRespuesta(resp));
        listaCredito.add("Recibo de Agua: " + getReciboagua());

        System.out.println("¿Cuenta con el Recibo de Luz? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Recibo de Luz o 2 si no.");
            resp = validar.decidir();
        }
        setReciboluz(convertirRespuesta(resp));
        listaCredito.add("Recibo de Luz: " + getReciboluz());

        System.out.println("¿Cuenta con el Pago predial? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Pago predial o 2 si no.");
            resp = validar.decidir();
        }
        setPagopredial(convertirRespuesta(resp));
        listaCredito.add("Pago predial: " + getPagopredial());

        System.out.println("¿Cuenta con la Cédula catastral? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con la Cédula catastral o 2 si no.");
            resp = validar.decidir();
        }
        setCedulacastral(convertirRespuesta(resp));
        listaCredito.add("Cédula catastral: " + getCedulacastral());

        System.out.println("¿Cuenta con el Alineamiento? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Alineamiento o 2 si no.");
            resp = validar.decidir();
        }
        setAlineamiento(convertirRespuesta(resp));
        listaCredito.add("Alineamiento: " + getAlineamiento());

        System.out.println("¿A cuántos plazos(meses) está el crédito?  60 | 120 | 180 | 240 | 360");
            do {
                resp = validar.decidir();
                if (!converitrPlazoValido(resp)) {
                    System.out.println("Por favor, seleccione uno de los plazos válidos.");
                }
            } while (!converitrPlazoValido(resp));
            setPlazos(resp);
            listaCredito.add("Plazos: " + getPlazos());   

            if (getEscrituras().equals("Sí") && getAlineamiento().equals("Sí") && getCedulacastral().equals("Sí") && getReciboluz().equals("Sí") && getReciboagua().equals("Sí") && getPagopredial().equals("Sí") && cliente.getActanacimineto().equals("Sí") && cliente.getCurp().equals("Sí") && cliente.getIne().equals("Sí") && cliente.getRfc().equals("Sí")) {
                setEstatus("Completo");
                listaCredito.add("Estatus: " + getEstatus());
                listaCredito.add("Se completo el: "+fecha.getTime().toString());
            }
            else{
                setEstatus("No completo");
                listaCredito.add("Estatus: "+getEstatus());
            }
            listadatos.add(listaCredito);
            listaFinal.add(listadatos);
        }

    public static String convertirRespuesta(int resp){
        return resp == 1 ? "Sí" : "No";
    }

    public static boolean converitrPlazoValido(int plazo){
        return plazo == 60 || plazo == 120 || plazo == 180 || plazo == 240 || plazo == 360;
    }
}
