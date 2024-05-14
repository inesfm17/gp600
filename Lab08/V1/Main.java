package Lab08.V1;

public class Main {
    public static void main(String[] args) {
        // Criação de diferentes instâncias de funcionários e seus papéis
        EmployeeInterface j1 = new Employee("Rui"); // Funcionário comum
        TeamMember f1 = new TeamMember(new Employee("Luis")); // Membro da equipe
        TeamLeader x1 = new TeamLeader(new Employee("Ana")); // Líder da equipe
        TeamLeader x2 = new TeamLeader(j1); // Líder da equipe com referência a um funcionário comum
        TeamLeader x3 = new TeamLeader(f1); // Líder da equipe com referência a um membro da equipe
        Manager t1 = new Manager(j1); // Gerente com referência a um funcionário comum
        // Gerente com referência a um líder da equipe
        Manager t2 = new Manager( 
                new TeamLeader(
                        new TeamMember(
                                new Employee("Bruna"))));
        // Armazena os funcionários criados
        EmployeeInterface[] lista = {j1, f1, x1, x2, x3, t1, t2};
        // Iteração sobre a matriz para chamar o método work() de cada objeto
        for (EmployeeInterface ji : lista) {
            ji.work();
            // Adiciona uma linha em branco para separar a saída de cada funcionário
            System.out.println();
        }
    }
}