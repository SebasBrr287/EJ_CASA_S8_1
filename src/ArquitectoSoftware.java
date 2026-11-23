public class ArquitectoSoftware extends Empleado {
    private int proyectosLiderados;

    public ArquitectoSoftware(String identificacion, String nombre, double salarioBase, int proyectosLiderados) {
        super(identificacion, nombre, salarioBase);
        this.proyectosLiderados = proyectosLiderados;
    }

    @Override
    public double calcularBono() {
        return (getSalarioBase() * 0.20) + (proyectosLiderados * 150.0);
    }

    @Override
    public String mostrarInformacion() {
        return "[Arquitecto] " + super.mostrarInformacion() + " | Proyectos: " + proyectosLiderados + " | Bono: $" + String.format("%.2f", calcularBono());
    }
}