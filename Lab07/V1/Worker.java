package Lab07.V1;

public class Worker implements Workerr {
    private Employee employee;
    private Empregado empregado;

    public Worker (String name, int code, double salary) {
        employee = new Employee(name, code, salary);
        empregado = new Empregado(name, null, code, salary);
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public double getSalary() {
        return employee.getSalary();
    }

    @Override
    public int getCode() {
        return empregado.codigo();
    }
}
