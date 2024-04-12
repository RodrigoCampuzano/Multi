import java.util.ArrayList;
import java.util.Scanner;

public class Inmueble {
    private int m2;
    private String ubicacion;
    private int precio;
    private int id;
    private String tipo;
    private int eleccion;
    public static Scanner scanner = new Scanner(System.in);

    public int getM2() {
        return m2;
    }
    public void setM2(int m2) {
        this.m2 = m2;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void ingresarCredito(ArrayList<Object> listaCredito){

        System.out.println("Ingrese la ubicacion ");
        ubicacion=scanner.next();
        setUbicacion(ubicacion);
        listaCredito.add("Ubicación:"+getUbicacion());

        do {
        System.out.println("Ingrese los m2");
            m2=scanner.nextInt();
        } while (m2<1);
        setM2(m2);
        listaCredito.add("M2:"+getM2());

        System.out.println("Ingrese el tipo de inmueble 1.-Casa | 2.-Terreno");
        int eleccion = scanner.nextInt();
        while (eleccion != 1 && eleccion != 2) {
            System.out.println("Por favor, seleccione 1 para Casa o 2 para Terreno.");
            eleccion = scanner.nextInt();
        }
        tipo = seleccionarTipo(eleccion);
        listaCredito.add("Tipo de Inmueble: " + tipo);

        do {
        System.out.println("Ingrese el precio");
            precio=scanner.nextInt();
        } while (precio<1);
        setPrecio(precio);
        listaCredito.add("Precio:"+getPrecio());
    }

    public void ingresarContado(ArrayList<Object> listaContado){

        System.out.println("Ingrese la ubicacion ");
        ubicacion=scanner.next();
        setUbicacion(ubicacion);
        listaContado.add("Ubicación:"+getUbicacion());

        do {
        System.out.println("Ingrese los m2");
            m2=scanner.nextInt();
        } while (m2<1);
        setM2(m2);
        listaContado.add("M2:"+getM2());

        System.out.println("Ingrese el tipo de inmueble 1.-Casa | 2.-Terreno");
        int eleccion = scanner.nextInt();
        while (eleccion != 1 && eleccion != 2) {
            System.out.println("Por favor, seleccione 1 para Casa o 2 para Terreno.");
            eleccion = scanner.nextInt();
        }
        tipo = seleccionarTipo(eleccion);
        listaContado.add("Tipo de Inmueble: " + tipo);

        do {
        System.out.println("Ingrese el precio");
            precio=scanner.nextInt();
        } while (precio<1);
        setPrecio(precio);
        listaContado.add("Precio:"+getPrecio());
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
    
}
