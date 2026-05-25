
public class Vehiculo {
    private String marca;
    private String placa;
    private String modelo;
    private int anio;
    private String color;
    private double precio;


    public Vehiculo() {

    }

    public Vehiculo(String marca, String placa, String modelo, int anio, String color, double precio){
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.precio = precio;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getanio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void MostarInfo(){
        System.out.println("------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
    }
}
