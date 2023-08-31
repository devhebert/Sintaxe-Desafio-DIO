import java.math.BigDecimal;
import java.util.List;

public class ContaTerminal {
    private Integer numero;
    private String agencia;
    private String nome;
    private BigDecimal saldo;

    private List<ContaTerminal> contaTerminalList;

    public ContaTerminal(String agencia, Integer numero, String nome, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public ContaTerminal() {}

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaTerminal{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
