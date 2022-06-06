package projeto.live;

import projeto.live.models.Endereco;
import projeto.live.models.Gerente;
import projeto.live.models.OperadorDeCaixa;
import projeto.live.models.Vendedor;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua do funcionário", "Complemento do funcionário", "Bairro do funcionário");
        System.out.println("--------------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Chris");
        vendedor.setDocumento("123.456.789-11");
        vendedor.setValorSalario(1500d);
        vendedor.setEndereco(endereco);

        vendedor.calculaBonificacao(2d);

        System.out.println(vendedor);
        System.out.println("--------------");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Chris do caixa", "123.456.789-11", 1000d, endereco);
        System.out.println(operadorDeCaixa);
        System.out.println("--------------");

        Gerente gerente = new Gerente();
        gerente.setNome("Chris Gerente");
        gerente.setDocumento("123.456.789-11");
        gerente.setValorHora(100d);
        gerente.setHorasTrabalhadas(20);
        gerente.setEndereco(endereco);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);
        System.out.println("--------------");





    }
}
