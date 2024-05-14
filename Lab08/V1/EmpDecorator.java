package Lab08.V1;

import java.util.Date;

public abstract class EmpDecorator implements EmployeeInterface {
    // Criado para armazenar uma referência a um objeto que implementa a interface
    protected EmployeeInterface e;

    EmpDecorator(EmployeeInterface e) {
        this.e = e;
    }

    public void start(Date d) {
        e.start(d);
    }

    public void terminate(Date d) {
        e.terminate(d);
    }

    public void work() {
        e.work();
    }
}

// Uma classe que estende EmpDecorator pode adicionar funcionalidades extras aos métodos start(), terminate() ou work() 
//sem precisar alterar a implementação dos métodos na classe original que implementa EmployeeInterface