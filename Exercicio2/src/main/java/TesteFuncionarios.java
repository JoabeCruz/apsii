public class TesteFuncionarios {
    public static void main(String[] args) {

        // 1. Instanciando o Funcionario normal
        Funcionario f1 = new Funcionario("Ana Costa", "F001", 2500, "01/03/2020");

        // 2. Instanciando o Funcionario CLT
        FuncionarioCLT f2 = new FuncionarioCLT("Bruno Reis", "C001", 3000, "10/06/2021", 220, 400);

        // 3. Instanciando o Gerente
        Gerente f3 = new Gerente("Carla Mendes", "G001", 8000, "15/01/2018", 300, 500, 12, 20);

        // 4. Instanciando o Estagiario
        Estagiario f4 = new Estagiario("Diego Alves", "E001", 0, "05/08/2024", 1500, 20);

        // Imprimindo os resultados
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());
    }
}