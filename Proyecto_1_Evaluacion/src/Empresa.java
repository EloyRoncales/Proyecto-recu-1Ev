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

    public Concesionario getConcesionario(String ciudad){
        return grupo.get(ciudad);
    }

    public void crearSede(String ciudad, int tamanyo){
        if(grupo.containsKey(ciudad)){
            System.out.println("Ya existe esa sede.");
        }else{
            grupo.put(ciudad, new Concesionario(tamanyo));
        }
    }

    public void facturacionTotal(){
        for(Concesionario concesionario : grupo.values()){
            facturacionEmpresa += concesionario.getFacturacionLocal();
        }
    }
}
