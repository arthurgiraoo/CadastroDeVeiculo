package principal;

import modelos.Caminhao;
import modelos.Carro;
import modelos.Onibus;
import modelos.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("AIB-1234",2012,5));
        veiculos.add(new Carro("CDE-4796",2017,7));
        veiculos.add(new Onibus("FHKS4041",2022,35));
        veiculos.add(new Onibus("HJIP6824",2013,100));
        veiculos.add(new Caminhao("JKADH77",2002,6));
        veiculos.add(new Caminhao("KSUG33",2022,8));

        for (Veiculo veiculo:veiculos
        ) {
            veiculo.exibirDados();
        }

    }


}