package Exercicio4;

public class ProgramaDasFiguras {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        //A) Adiciona mais dois losangos
        Losango l1 = new Losango(4.0, 5.0);
        Losango l2 = new Losango(6.0, 2.0);
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        //B) Imprime todas as figuras cadastradas
        System.out.println("--- Figuras Cadastradas ---");
        gerente.imprimeFiguras();

        //C) Calcule e imprima a área total de todas as figuras cadastradas
        System.out.println("\n--- Área Total ---");
        System.out.println("Área Total: " + gerente.calculaAreaTotalDeFiguras());
    }
}