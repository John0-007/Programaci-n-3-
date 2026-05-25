import java.util.ArrayList;
import java.util.Scanner;

public class SistemRegistro {
    private ArrayList<Vehiculo> vehiculos;
    private Scanner sc;

    public SistemRegistro() {
        vehiculos = new ArrayList<>();
        sc = new Scanner(System.in);

    }

    public void AgregarVehiculo(){
        System.out.println("\n--- Registrar Vehiculo ---");
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Placa: "); 
        String placa = sc.nextLine();
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        int anio = 0;
        while(true){
            System.out.println("Anio:");
            String EntradaAnio = sc.nextLine();
            try {
                anio = Integer.parseInt(EntradaAnio);
                if(anio < 1886 || anio > 2026){
                    System.out.println("Anio no valido");
                    continue;
                }
                break;
            } catch(NumberFormatException e){
                System.out.println("Debe de ingresa un numero");
            }
        }
        System.out.println("Color: ");
        String color = sc.nextLine();
        double precio = 0;
        while(true){
            System.out.println("Precio: ");
            String entradaPrecio = sc.nextLine();
            try {
                precio = Double.parseDouble(entradaPrecio);
                if (precio < 0){
                    System.out.println("Precio no valido, como que negativo? ");
                    continue;
                }
                break;

        } catch(NumberFormatException e){
            System.out.println("Debe de Poner un numero");

        }
    } 
        Vehiculo v = new Vehiculo(marca, placa, modelo, anio, color, precio);
        vehiculos.add(v);
        System.out.println("Vehiculo registrado como se debe ");
}

    public void MostrarVehiculos(){
        System.out.println("\n--- Lista de Vehiculos ---");
        if(vehiculos.isEmpty()){
            System.out.println("Todavia no hay vehiculos registrados ");
            return;
        }for(int i = 0; i < vehiculos.size(); i++){
            vehiculos.get(i).MostarInfo();
        }
    }
    public void BuscarPlaca(){
        System.out.println("\n--- Buscar Vehiculo por Placa ---");
        System.out.println("Digite la placa que quiere buscar: ");
        String placa = sc.nextLine();

        boolean encontrada = false;
        for(int i = 0; i < vehiculos.size(); i++){
            if(vehiculos.get(i).getPlaca().equalsIgnoreCase(placa)){
                vehiculos.get(i).MostarInfo();
                encontrada = true;
                break;
            }
        } if (!encontrada){
            System.out.println("No encontadra la placa.");
        }
    }

    public void MostrarMarca(){
        System.out.println("\n--- Buscar por marca ---");
        System.out.println("Ingrese la marca que desea: ");
        String marca = sc.nextLine();

        int contador = 0;
        for(int i =0; i < vehiculos.size(); i++){
            if(vehiculos.get(i).getMarca().equalsIgnoreCase(marca)){
                vehiculos.get(i).MostarInfo();
                contador++;
            }
        } if (contador == 0){
            System.out.println("No se encontro la marca");
        }
    }
    public void MostrarMenu(){
        int opcion = 0;
        do{
        System.out.println("\n--- Menu ---");
        System.out.println("1. Regitrar Vehiculo");
        System.out.println("2.Mostrar Vehiculos");
        System.out.println("3. Buscar por su placa ");
        System.out.println("4. Mostrar por su marca ");
        System.out.println("5. Salir");
        System.out.println("Elige una opcion: ");

        String op = sc.nextLine();

        try {
            opcion = Integer.parseInt(op);
        } catch(NumberFormatException e){
            System.out.println("Debe de poner un numero");
            continue;
        }
        switch (opcion){
            case 1:
                AgregarVehiculo();
                break;
            case 2:
                MostrarVehiculos();
                break;
            case 3:
                BuscarPlaca();
                break;
            case 4:
                MostrarMarca();
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion no valida, intente de nuevo");
        }
    } while(opcion != 5);

    }

 }

