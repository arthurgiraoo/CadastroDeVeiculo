package modelos;

public class Carro extends Veiculo{
    private int MaximoDePessoasPermitido;

    public Carro(String placa, int ano, int maximoDePessoasPermitido) {
        super(placa, ano);
        MaximoDePessoasPermitido = maximoDePessoasPermitido;
    }

    public int getMaximoDePessoasPermitido() {
        return MaximoDePessoasPermitido;
    }

    @Override
    public void exibirDados() {
        System.out.println("Placa do veículo: "+getPlaca()+
                "; Ano de fabricação do Carro: "+getAno()+"; Assentos do Carro: "
                +this.getMaximoDePessoasPermitido());
    }
}
