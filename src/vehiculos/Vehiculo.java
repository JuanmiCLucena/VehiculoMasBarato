package vehiculos;

import java.util.List;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public static Vehiculo vehiculoMasBarato(List<Vehiculo> listaVehiculos) {

        Vehiculo vehiculoMasBarato = new Vehiculo();
        double precioMasBarato = Integer.MAX_VALUE;

        for (int i = 0; i < listaVehiculos.size(); i++) { // Buscamos y Asignamos el Precio más barato de la Lista de Vehículos.
            if(listaVehiculos.get(i).getPrecio() < precioMasBarato) {
                precioMasBarato = listaVehiculos.get(i).getPrecio();
                vehiculoMasBarato = listaVehiculos.get(i);
            }
        }

        return vehiculoMasBarato; // Retornamos el vehículo.
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}