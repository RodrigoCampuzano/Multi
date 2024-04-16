import java.util.ArrayList;

public abstract class Tramites {
    private String escrituras;
    private String reciboluz;
    private String reciboagua;
    private String pagopredial;
    private String cedulacastral;
    private String alineamiento;
    private String estatus;



    public String getEstatus() {
        return estatus;
    }
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    public String getEscrituras() {
        return escrituras;
    }
    public void setEscrituras(String escrituras) {
        this.escrituras = escrituras;
    }
    public String getReciboluz() {
        return reciboluz;
    }
    public void setReciboluz(String reciboluz) {
        this.reciboluz = reciboluz;
    }
    public String getReciboagua() {
        return reciboagua;
    }
    public void setReciboagua(String reciboagua) {
        this.reciboagua = reciboagua;
    }
    public String getPagopredial() {
        return pagopredial;
    }
    public void setPagopredial(String pagopredial) {
        this.pagopredial = pagopredial;
    }
    public String getCedulacastral() {
        return cedulacastral;
    }
    public void setCedulacastral(String cedulacastral) {
        this.cedulacastral = cedulacastral;
    }
    public String getAlineamiento() {
        return alineamiento;
    }
    public void setAlineamiento(String alineamiento) {
        this.alineamiento = alineamiento;
    }

    public abstract void ingresarInmueble(ArrayList<Object> listaFinal);


}
