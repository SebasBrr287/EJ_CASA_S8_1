import java.util.ArrayList;

public class EmpresaSoftware {
    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;

    public EmpresaSoftware(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp) {
        if (emp != null) {
            empleados.add(emp);
        }
    }

    public double calcularTotalBonos() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularBono();
        }
        return total;
    }

    public String listarEmpleados() {
        StringBuilder sb = new StringBuilder("Nómina de " + nombreEmpresa + ":\n");
        for (Empleado e : empleados) {
            sb.append(" - ").append(e.mostrarInformacion()).append("\n");
        }
        return sb.toString();
    }
}