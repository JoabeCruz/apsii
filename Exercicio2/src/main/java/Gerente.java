public class Gerente extends FuncionarioCLT {
    private int tamanhoEquipe;
    private double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao,
                   double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {

        double valorBonus = getSalarioBase() * (percentualBonus / 100);
        return super.calcularSalario() + valorBonus;
    }

    @Override
    public double calcularDesconto() {
        double desconto = super.calcularDesconto();

        if (tamanhoEquipe > 10) {
            desconto += 100.00;
        }
        return desconto;
    }
}