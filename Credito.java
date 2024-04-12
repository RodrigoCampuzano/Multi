import java.util.ArrayList;
import java.util.Scanner;

public class Credito extends Tramites {
    private static ArrayList<Object> listaCredito = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    private int plazos;
    Cliente cliente = new Cliente();
    Inmueble inmueble = new Inmueble();
    
    public int getPlazos() {
        return plazos;
    }
    public void setPlazos(int plazos) {
        this.plazos = plazos;
    }

    @Override
    public void ingresarInmueble(){
        int resp; int plazo;

        inmueble.ingresarCredito(listaCredito);
        cliente.ingresarCredito(listaCredito);

        System.out.println("¿Cuenta con las Escrituras? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con las Escrituras o 2 si no.");
            resp = scanner.nextInt();
        }
        setEscrituras(convertirRespuesta(resp));
        listaCredito.add("Escrituras: " + getEscrituras());

        System.out.println("¿Cuenta con el Recibo de Agua? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Recibo de Agua o 2 si no.");
            resp = scanner.nextInt();
        }
        setReciboagua(convertirRespuesta(resp));
        listaCredito.add("Recibo de Agua: " + getReciboagua());

        System.out.println("¿Cuenta con el Recibo de Luz? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Recibo de Luz o 2 si no.");
            resp = scanner.nextInt();
        }
        setReciboluz(convertirRespuesta(resp));
        listaCredito.add("Recibo de Luz: " + getReciboluz());

        System.out.println("¿Cuenta con el Pago predial? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Pago predial o 2 si no.");
            resp = scanner.nextInt();
        }
        setPagopredial(convertirRespuesta(resp));
        listaCredito.add("Pago predial: " + getPagopredial());

        System.out.println("¿Cuenta con la Cédula catastral? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con la Cédula catastral o 2 si no.");
            resp = scanner.nextInt();
        }
        setCedulacastral(convertirRespuesta(resp));
        listaCredito.add("Cédula catastral: " + getCedulacastral());

        System.out.println("¿Cuenta con el Alineamiento? (1: Sí / 2: No)");
        resp = scanner.nextInt();
        while (resp != 1 && resp != 2) {
            System.out.println("Por favor, ingrese 1 si cuenta con el Alineamiento o 2 si no.");
            resp = scanner.nextInt();
        }
        setAlineamiento(convertirRespuesta(resp));
        listaCredito.add("Alineamiento: " + getAlineamiento());

        System.out.println("¿A cuántos plazos(meses) está el crédito?  60 | 120 | 180 | 240 | 360");
            do {
                resp = scanner.nextInt();
                if (!converitrPlazoValido(resp)) {
                    System.out.println("Por favor, seleccione uno de los plazos válidos.");
                }
            } while (!converitrPlazoValido(resp));
            setPlazos(resp);
            listaCredito.add("Plazos: " + getPlazos());   
    }

    public void seleccionarInmueble(){
        int a=0, c=0, b=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0, n=0, p=0, o=0, opcion=0;
        System.out.println("Inmueble 1 o 2");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                a=0; b=1; c=2; d=3; e=4; f=5; g=6; h=7; i=8; j=9; 
                k=10; l=11; m=12; n=13; p=14; o=15;
                break;
            case 2:
                a=16; b=17; c=18; d=19; e=20; f=21; g=22; h=23; i=24;
                j=25; k=26; l=27; m=28; n=29; p=30; o=31;
                break;

            default:
                break;
        }
        actualizarTramite(a, b, c, d, e, f, g, h, i, j, k, l, m, n, p, o);
    }

    public void actualizarTramite(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int p, int o){
        int resp; String opcion; int eleccion;
        System.out.println("¿Que desea modificar? \nUbicacion  |  M2  | Tipo de inmueble  | Precio \n  Nombre   | INE  | Acta              | RFC \n Curp      | Escritura  | reciboluz  | reciboagua  | pagopredial  \n cedulacastral  | alineamiento | Plazos");
        opcion = scanner.next();
        switch (opcion) {
            case "Ubicacion":
            System.out.println("Nueva ubicacion");
            opcion = scanner.next();
            inmueble.setUbicacion(opcion);
            listaCredito.set(a, "Ubicacion :"+inmueble.getUbicacion());
                break;
            
            case "M2":
            System.out.println("Nueva cantidad de M2");
            do {
                System.out.println("Ingrese los m2");
                    eleccion=scanner.nextInt();
                } while (eleccion<1);
            inmueble.setM2(eleccion);
            listaCredito.set(b, "M2:"+inmueble.getM2());
                break;
            
            case "Tipo de inmueble":
            System.out.println("Nuevo Tipo de Inmueble \n 1.-Casa | 2.-Terreno");
            eleccion = scanner.nextInt();
            while (eleccion != 1 && eleccion != 2) {
                System.out.println("Por favor, seleccione 1 para Casa o 2 para Terreno.");
                eleccion = scanner.nextInt();
            }
            inmueble.setTipo(seleccionarTipo(eleccion));
            listaCredito.set(c, "Tipo de inmueble: "+inmueble.getTipo());
                break;
            
            case "Precio":
            System.out.println("Nuevo Precio");
            do {
                    eleccion=scanner.nextInt();
                } while (eleccion<1);
            inmueble.setPrecio(eleccion);
            listaCredito.set(d, "Precio: "+inmueble.getPrecio());
                break;
        
            case "Nombre":
            System.out.println("Nuevo Nombre");
            opcion = scanner.next();
            cliente.setNombre(opcion);
            listaCredito.set(e, "Nombre del Cliente: "+cliente.getNombre());
                break;
            
            case "INE":
            System.out.println("¿Cuenta con el INE? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con el INE o 2 si no.");
                resp = scanner.nextInt();
            }
            cliente.setIne(convertirRespuesta(resp));
            listaCredito.set(f, "INE: " + cliente.getIne());
                break;
        
            case "Acta":
            System.out.println("¿Cuenta con el Acta de Nacimiento? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con el Acta de Nacimiento o 2 si no.");
                resp = scanner.nextInt();
            }
            cliente.setActanacimineto(convertirRespuesta(resp));
            listaCredito.set(g, "Acta de Nacimiento: " + cliente.getActanacimineto());
                break;
    
            case "RFC":
            System.out.println("¿Cuenta con el RFC? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con el RFC o 2 si no.");
                resp = scanner.nextInt();
            }
            cliente.setRfc(convertirRespuesta(resp));
            listaCredito.set(h, "RFC: " + cliente.getRfc());
                break;
            
            case "Curp":
            System.out.println("¿Cuenta con la CURP? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con la CURP o 2 si no.");
                resp = scanner.nextInt();
            }
            cliente.setCurp(convertirRespuesta(resp));
            listaCredito.set(i, "CURP: " + cliente.getCurp());
                break;
            
            case "Escritura":
            System.out.println("¿Cuenta con las Escrituras? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con las Escrituras o 2 si no.");
                resp = scanner.nextInt();
            }
            setEscrituras(convertirRespuesta(resp));
            listaCredito.set(j, "Escrituras: " + getEscrituras());
                break;
    
            case "reciboagua":
            System.out.println("¿Cuenta con el Recibo de Agua? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con el Recibo de Agua o 2 si no.");
                resp = scanner.nextInt();
            }
            setReciboagua(convertirRespuesta(resp));
            listaCredito.set(k, "Recibo de Agua: " + getReciboagua());
                break;
            
            case "reciboluz":
            System.out.println("¿Cuenta con el Recibo de Luz? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con el Recibo de Luz o 2 si no.");
                resp = scanner.nextInt();
            }
            setReciboluz(convertirRespuesta(resp));
            listaCredito.set(l, "Recibo de Luz: " + getReciboluz());
                break;

            case "pagopredial":
            System.out.println("¿Cuenta con el Pago predial? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con el Pago predial o 2 si no.");
                resp = scanner.nextInt();
            }
            setPagopredial(convertirRespuesta(resp));
            listaCredito.set(m, "Pago predial: " + getPagopredial());
                break;

            case "cedulacastral":
            System.out.println("¿Cuenta con la Cédula catastral? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con la Cédula catastral o 2 si no.");
                resp = scanner.nextInt();
            }
            setCedulacastral(convertirRespuesta(resp));
            listaCredito.set(n, "Cédula catastral: " + getCedulacastral());
                break;

            case "alineamiento":
            System.out.println("¿Cuenta con el Alineamiento? (1: Sí / 2: No)");
            resp = scanner.nextInt();
            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, ingrese 1 si cuenta con el Alineamiento o 2 si no.");
                resp = scanner.nextInt();
            }
            setAlineamiento(convertirRespuesta(resp));
            listaCredito.set(p, "Alineamiento: " + getAlineamiento());
                break;

            case "Plazos":
            System.out.println("¿A cuántos plazos(meses) está el crédito?  60 | 120 | 180 | 240 | 360");
            do {
                resp = scanner.nextInt();
                if (!converitrPlazoValido(resp)) {
                    System.out.println("Por favor, seleccione uno de los plazos válidos.");
                }
            } while (!converitrPlazoValido(resp));
            setPlazos(resp);
            listaCredito.set(o, "Plazos: " + getPlazos());
                break;
            
            default:
                break;
        }
    }

    public static String seleccionarTipo(int eleccion) {
        switch (eleccion) {
            case 1:
                return "Casa";
            case 2:
                return "Terreno";
            default:
                return "Tipo no válido";
        }
    }

    public ArrayList<Object> obtenerCredito(){
        return listaCredito;
    }
    
    public void eliminarInmueble(){
        System.out.println("Inmueble 1 o 2");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                listaCredito.subList(0, 16).clear();
                break;
            case 2:
                listaCredito.subList(17, 32).clear();;
                break;
            default:
                System.out.println("err");
                break;
        }
    }

    public static String convertirRespuesta(int resp) {
        return resp == 1 ? "Sí" : "No";
    }

    public static boolean converitrPlazoValido(int plazo) {
        return plazo == 60 || plazo == 120 || plazo == 180 || plazo == 240 || plazo == 360;
    }
}
