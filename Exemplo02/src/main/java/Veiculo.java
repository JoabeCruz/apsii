import org.omg.CORBA.PUBLIC_MEMBER;

public class Veiculo {

    protected String modelo;
    protected int ano;

    public Veiculo(String novoModelo, int novoAno){
        this.modelo = novoModelo;
        this.ano= novoAno;
    }

    public String imprimeDetalhes(){
        return "\nModelo: "+this.modelo + "\nAno: "+ this.ano;

    }
}

