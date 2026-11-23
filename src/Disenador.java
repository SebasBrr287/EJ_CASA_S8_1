public class Disenador extends Empleado {
    private String herramientaPrincipal;

    public Disenador(String identificacion, String nombre, double salarioBase, String herramientaPrincipal) {
        super(identificacion, nombre, salarioBase);
        this.herramientaPrincipal = herramientaPrincipal;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.12;
    }

    @Override
    public String mostrarInformacion() {
        return "[Diseñador UX/UI - " + herramientaPrincipal + "] " + super.mostrarInformacion() + " | Bono: $" + String.format("%.2f", calcularBono());
    }
}