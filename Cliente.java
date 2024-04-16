import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String ine;
    private String actanacimineto;
    private String rfc;
    private String curp;
    private String nombre;
    Principal validar = new Principal();

    public String getIne() {
        return ine;
    }
    public void setIne(String ine) {
        this.ine = ine;
    }
    public String getActanacimineto() {
        return actanacimineto;
    }
    public void setActanacimineto(String actanacimineto) {
        this.actanacimineto = actanacimineto;
    }
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void ingresarCredito(ArrayList<Object> listaCredito){
        int resp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del cliente");
        nombre=scanner.next();
        setNombre(nombre);
        listaCredito.add("Nombre del Cliente:"+getNombre());
        
        System.out.println("¿Cuenta con el INE? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el INE o 2 si no.");
            resp = validar.decidir();
        }
        setIne(convertirRespuesta(resp));
        listaCredito.add("INE: " + getIne());

        System.out.println("¿Cuenta con el Acta de Nacimiento? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Acta de Nacimiento o 2 si no.");
            resp = validar.decidir();
        }
        setActanacimineto(convertirRespuesta(resp));
        listaCredito.add("Acta de Nacimiento: " + getActanacimineto());

        System.out.println("¿Cuenta con el RFC? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el RFC o 2 si no.");
            resp = validar.decidir();
        }
        setRfc(convertirRespuesta(resp));
        listaCredito.add("RFC: " + getActanacimineto());

        System.out.println("¿Cuenta con la CURP? (1: Sí / 2: No)");
        resp = validar.decidir();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con la CURP o 2 si no.");
            resp = validar.decidir();
        }
        setCurp(convertirRespuesta(resp));
        listaCredito.add("CURP: " + getCurp());

    }

    public void ingresarContado(ArrayList<Object> listaContado){
        int resp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del cliente");
        nombre=scanner.next();
        setNombre(nombre);
        listaContado.add("Nombre del Cliente:"+getNombre());
        
        System.out.println("¿Cuenta con el INE? 1: Sí");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setIne(convertirRespuesta(resp));
        listaContado.add("INE: " + getIne());

        System.out.println("¿Cuenta con el Acta de Nacimiento? 1: Sí");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setActanacimineto(convertirRespuesta(resp));
        listaContado.add("Acta de Nacimiento: " + getActanacimineto());

        System.out.println("¿Cuenta con el RFC? 1: Sí");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setRfc(convertirRespuesta(resp));
        listaContado.add("RFC: " + getActanacimineto());

        System.out.println("¿Cuenta con la CURP? 1: Sí");
        resp = validar.decidir();
        while (resp != 1) {
            System.out.println("Por favor, ingrese 1");
            resp = validar.decidir();
        }
        setCurp(convertirRespuesta(resp));
        listaContado.add("CURP: " + getCurp());
    }

    public static String convertirRespuesta(int resp) {
        return resp == 1 ? "Sí" : "No";
    }
}
