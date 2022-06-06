package projeto.live.models;

import projeto.live.models.Endereco;
import projeto.live.models.FuncionarioCLT;

public class OperadorDeCaixa extends FuncionarioCLT {

    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa(String nome, String documento, double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
}
