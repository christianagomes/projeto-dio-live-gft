package projeto.live.models;

public abstract class FuncionarioPJ {

    private String nome, documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorHora, valorRemuneração;


    public void calculaRemuneracao(){
        this.valorRemuneração =  this.horasTrabalhadas * valorHora;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneração() {
        return valorRemuneração;
    }

    public void setValorRemuneração(Double valorRemuneração) {
        this.valorRemuneração = valorRemuneração;
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorRemuneração=" + valorRemuneração +
                '}';
    }
}
