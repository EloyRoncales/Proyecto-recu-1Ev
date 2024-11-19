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

    public ArrayList<Coche> getListadoCoches() {
        return listadoCoches;
    }
    public void setListadoCoches(ArrayList<Coche> listadoCoches) {
        this.listadoCoches = listadoCoches;
    }

    public void adquirirCoche(Coche coche){
        if(listadoCoches.size() < tamanyo){
            listadoCoches.add(coche);
        }else{
            System.out.println("Concesionario lleno, no se puede introducir el coche.");
        }
    }

    public void venderCoche(String matricula){
        for(Coche coche : listadoCoches){
            if(coche.getMatricula().equalsIgnoreCase(matricula)){
                listadoCoches.remove(coche);
                facturacionLocal += coche.getPrecio();
                break;
            }
        }
    }
}
