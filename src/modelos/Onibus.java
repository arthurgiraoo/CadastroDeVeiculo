package modelos;

public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Placa do veículo: "+getPlaca()+
                "; Ano de fabricação do onibus: "+getAno()+"; Assentos do onibus: "
                +this.getAssentos());
    }
}
