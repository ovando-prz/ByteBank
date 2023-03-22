/**
 * Cuenta
 */
public class Cuenta{

    private double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}