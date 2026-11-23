public class Programador extends Empleado {
    private String especialidad;

    public Programador(String identificacion, String nombre, double salarioBase, String especialidad) {
        super(identificacion, nombre, salarioBase);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.15; // 15% de bono
    }

    @Override
    public String mostrarInformacion() {
        return "[Programador - " + especialidad + "] " + super.mostrarInformacion() + " | Bono: $" + String.format("%.2f", calcularBono());
    }
}
