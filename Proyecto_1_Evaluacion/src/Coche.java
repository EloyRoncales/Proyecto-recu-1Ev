public class Coche {
    private String marca;
    private String modelo;
    private String matricula;
    private int anyo;
    private double precio;
    private int Kms;

    public Coche(String marca, String modelo, String matricula, int anyo, double precio, int Kms) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anyo = anyo;
        this.precio = precio;
        this.Kms = Kms;
    }

    // Getters and setters

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}

    public int getAnyo() {return anyo;}
    public void setAnyo(int anyo) {this.anyo = anyo;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public int getKms() {return Kms;}
    public void setKms(int kms) {Kms = kms;}

    public double Descuento(){
        return 0;
    }
}
