package Isp;

public class Avioneta implements Aereo, Terrestre {
    @Override
    public void volar() {
        System.out.println("La avioneta está volando.");
    }

    @Override
    public void andarEnTierra() {
        System.out.println("La avioneta rueda por la pista.");
    }
}