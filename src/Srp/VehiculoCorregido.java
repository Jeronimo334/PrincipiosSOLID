package Srp;

public class VehiculoCorregido {
    private String marca;
    private int velocidadMax;
    
    public String getMarca(){
        return this.marca;
    }
    public int getVelocidadMax(){
        return this.velocidadMax;
    }

    public VehiculoCorregido(String marca,int velocidadMax){
        this.marca=marca;
        this.velocidadMax=velocidadMax;
    }
    public void acelerar(){
        System.out.println(marca+ " esta acelerando.");
    }
}
