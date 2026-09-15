package Srp;
public class Vehiculo {
    private String marca;
    private int velocidadMax;
    


    public Vehiculo(String marca,int velocidadMax){
        this.marca=marca;
        this.velocidadMax=velocidadMax;
    }
    public void acelerar(){
        System.out.println(marca+ " esta acelerando.");
    }
    public void guardarEnBaseDeDatos(){
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO vehiculos vALUES ('" +marca +"', " + velocidadMax +")");
    }
    public void generarReporte(){
        System.out.println("Generando PDF con los datos de "+marca+"...");
    }
    
}
