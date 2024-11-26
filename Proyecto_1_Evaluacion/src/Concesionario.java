public class Concesionario {
    private int tamanyo;
    private double facturacionLocal;
    private Coche[] listadoCoches;

    public Concesionario(int tamanyo) {
        this.tamanyo = tamanyo;
        this.facturacionLocal = 0;
        this.listadoCoches = new Coche[tamanyo];
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(int tamanyo) {
        this.tamanyo = tamanyo;
    }

    public double getFacturacionLocal() {
        return facturacionLocal;
    }

    public void setFacturacionLocal(double facturacionLocal) {
        this.facturacionLocal = facturacionLocal;
    }

    public Coche[] getListadoCoches() {
        return listadoCoches;
    }

    public void setListadoCoches(Coche[] listadoCoches) {
        this.listadoCoches = listadoCoches;
    }

    public void adquirirCoche(Coche coche) {
        for (int i = 0; i < listadoCoches.length; i++) {
            if (listadoCoches[i] == null) {
                listadoCoches[i] = coche;
                System.out.println("Coche añadido con éxito.");
            }
        }
        System.out.println("Concesionario lleno, no se puede introducir el coche.");
    }

    public void venderCoche(String matricula) {
        for (int i = 0; i < listadoCoches.length; i++) {
            if (listadoCoches[i] != null && listadoCoches[i].getMatricula().equalsIgnoreCase(matricula)) {
                facturacionLocal += listadoCoches[i].getPrecio();

                for (int j = i; j < listadoCoches.length - 1; j++) {
                    listadoCoches[j] = listadoCoches[j + 1];
                }

                listadoCoches[listadoCoches.length - 1] = null;
                System.out.println("Coche vendido: " + matricula);
            }
        }
        System.out.println("Coche con matrícula " + matricula + " no encontrado.");
    }
}
