public class Moto extends Veiculo {
    public int cilindradas;

    // Construtor
    public Moto(String modelo, int ano, int cilindradas) {
        super(modelo, ano); // Repassa modelo
        this.cilindradas = cilindradas;
    }

    @Override
    public String imprimeDetalhes() {

        return super.imprimeDetalhes() + "\nCilindradas: " + this.cilindradas + "cc";
    }
}