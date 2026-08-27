public class Principal {


    public static void main(String[] args){
        Veiculo v1 = new Veiculo("Fusca", 1970);
        Carro c1 = new Carro("Polo", 2025, 4);
        Moto m1 = new Moto("CB 500F", 2023, 500);

        System.out.println("\n--- Dados da Moto ---");
        System.out.println(m1.imprimeDetalhes());
        System.out.println(v1.imprimeDetalhes());

        System.out.println(v1.imprimeDetalhes());
        System.out.println(c1.imprimeDetalhes());
    }
}
