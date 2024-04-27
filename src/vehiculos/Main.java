package vehiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculoMasBarato;

        List<Vehiculo> listaVehiculos = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        String respuesta = "si";
        String marca = "";
        String modelo = "";
        double precio = 0;

        while(respuesta.equalsIgnoreCase("si")) {
            System.out.println("¿Quieres introducir un vehículo? (si/no)");
            respuesta = s.next();

            if(respuesta.equalsIgnoreCase("si")) {
                System.out.println("Marca del coche: ");
                marca = s.next();
                System.out.println("Modelo del coche: ");
                modelo = s.next();
                System.out.println("Precio del coche: ");
                precio = s.nextDouble();

                listaVehiculos.add(new Vehiculo(marca, modelo, precio));
            }
        }

        vehiculoMasBarato = Vehiculo.vehiculoMasBarato(listaVehiculos);

        if(listaVehiculos.size() > 0) {
            System.out.println("El vehículo más barato es: " + vehiculoMasBarato.getMarca() + " " + vehiculoMasBarato.getModelo() + " y su precio es: " + vehiculoMasBarato.getPrecio() );
        } else {
            System.out.println("No hay existencias de vehículos");
        }


    }
}
