package Lsp;

public class App {
    public static void main(String[] args) {
        Vehiculo[] flota = {
            new Carro("Toyota", 180),
            new Bicicleta("BMX", 30)
        };

        for (Vehiculo v : flota) {
            v.acelerar();  // cada uno cumple el contrato a su manera, sin excepciones
        }
    }
}