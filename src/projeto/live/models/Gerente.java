package projeto.live.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = super.getValorRemuneração() * (porcentagemBonificacao/100d) +100d;
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" +super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco().getRua() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneração=" + super.getValorRemuneração() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }

}
