public class Tester extends Empleado {
    private int bugsDetectados;

    public Tester(String identificacion, String nombre, double salarioBase, int bugsDetectados) {
        super(identificacion, nombre, salarioBase);
        this.bugsDetectados = bugsDetectados;
    }

    @Override
    public double calcularBono() {
        return (getSalarioBase() * 0.10) + (bugsDetectados * 5.0);
    }

    @Override
    public String mostrarInformacion() {
        return "[Tester QA] " + super.mostrarInformacion() + " | Bugs: " + bugsDetectados + " | Bono: $" + String.format("%.2f", calcularBono());
    }
}