import java.util.ArrayList;

public class Concesionario {
    private int tamanyo;
    private double facturacionLocal;
    private ArrayList<Coche> listadoCoches;

    public Concesionario(int tamanyo){
        this.tamanyo = tamanyo;
        this.facturacionLocal = 0;
        this.listadoCoches = new ArrayList<>(tamanyo);
    }

    public int getTamanyo() {return tamanyo;}
    public void setTamanyo(int tamanyo) {this.tamanyo = tamanyo;}

    public double getFacturacionLocal() {return facturacionLocal;}
    public void setFacturacionLocal(double facturacionLocal) {this.facturacionLocal = facturacionLocal;}

    public void adquirirCoche(){

    }

    public void venderCoche(){

    }
}
