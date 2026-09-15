package Srp;

public class VehiculoRepositorio {
    public void guardar(VehiculoCorregido v){
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO vehiculos vALUES ('" +v.getMarca() +"', " + v.getVelocidadMax() +")");
    }
}
