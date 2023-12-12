package modelos;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Placa do veículo: "+getPlaca()+
                "; Ano de fabricação do caminhão: "+getAno()+"; Numero de eixos do caminhão "
                +this.getEixos());
    }
}
