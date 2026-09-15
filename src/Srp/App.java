package Srp;

public class App {
    public static void main(String[] args) {
        VehiculoCorregido v1 = new VehiculoCorregido("Porche", 500);
        VehiculoCorregido v2 = new VehiculoCorregido("Renault", 400);
        VehiculoCorregido v3 = new VehiculoCorregido("Mazda", 200);
        VehiculoCorregido v4 = new VehiculoCorregido("Porche", 500);
        
        VehiculoRepositorio repo = new VehiculoRepositorio();
        repo.guardar(v1);
        repo.guardar(v2);
        repo.guardar(v3);
        repo.guardar(v4);

        VehiculoReporteGenerador reporte = new VehiculoReporteGenerador();
        reporte.generarPDF(v1);
        reporte.generarPDF(v2);
        reporte.generarPDF(v3);
        reporte.generarPDF(v4);
    }
}
