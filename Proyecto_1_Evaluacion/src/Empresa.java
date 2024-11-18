import java.util.HashMap;

public class Empresa {
    private String nombre;
    private double facturacionEmpresa;
    private HashMap<String, Concesionario> grupo;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.facturacionEmpresa = 0;
        this.grupo = new HashMap<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getFacturacionEmpresa() { return facturacionEmpresa; }
    public void setFacturacionEmpresa(double facturacionEmpresa) {
        this.facturacionEmpresa = facturacionEmpresa;
    }

    public HashMap<String, Concesionario> getGrupo() { return grupo; }
    public void setGrupo(HashMap<String, Concesionario> grupo) {
        this.grupo = grupo;
    }

    public void crearSede(){

    }

    public void facturacionTotal(){

    }
}
