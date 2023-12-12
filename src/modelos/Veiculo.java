package modelos;

import java.util.List;

public class Veiculo {
    private String placa;
    private int ano;


    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }



    public int getAno() {
        return ano;
    }

    public void exibirDados(){
        System.out.println("Ano do veículo: "+this.getAno());
        System.out.println("Placa do veículo: "+this.getPlaca());
    }
}
