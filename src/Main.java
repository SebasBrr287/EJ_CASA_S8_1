//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nombre de la empresa de software: ");
    String nombreEmpresa = sc.nextLine();
    EmpresaSoftware empresa = new EmpresaSoftware(nombreEmpresa);

    System.out.print("¿Cuántos empleados deseas ingresar?: ");
    int n = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < n; i++) {
        System.out.println("\nEmpleado #" + (i + 1) + " - Rol (1: Programador, 2: Tester, 3: Diseñador, 4: Arquitecto): ");
        int rol = Integer.parseInt(sc.nextLine());

        System.out.print("Identificación: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Salario base: ");
        double salario = Double.parseDouble(sc.nextLine());

        if (rol == 1) {
            System.out.print("Especialidad: ");
            empresa.agregarEmpleado(new Programador(id, nombre, salario, sc.nextLine()));
        } else if (rol == 2) {
            System.out.print("Bugs detectados: ");
            empresa.agregarEmpleado(new Tester(id, nombre, salario, Integer.parseInt(sc.nextLine())));
        } else if (rol == 3) {
            System.out.print("Herramienta principal: ");
            empresa.agregarEmpleado(new Disenador(id, nombre, salario, sc.nextLine()));
        } else {
            System.out.print("Proyectos liderados: ");
            empresa.agregarEmpleado(new ArquitectoSoftware(id, nombre, salario, Integer.parseInt(sc.nextLine())));
        }
    }

    System.out.println("\n" + empresa.listarEmpleados());
    System.out.println("Total de bonos: $" + String.format("%.2f", empresa.calcularTotalBonos()));
    sc.close();
}

