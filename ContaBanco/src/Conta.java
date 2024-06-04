
public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numeroAlt){
        this.numero = numeroAlt;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeAlt){
        this.nomeCliente = nomeAlt;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setAgencia(String agenciaAlt){
        this.agencia = agenciaAlt;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double altSaldo){
        this.saldo = altSaldo;
    }
}
