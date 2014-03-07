package questao2;

public class ContaCorrente {

	protected double saldo = 0;

	public void depositar(double valor){
		saldo += valor;
	}

	public void sacar (double valor) throws VeacoException{
		if (saldo < valor) {
			throw new VeacoException();
		} else {
			saldo -= valor;
			saldo -= 0.5 / 100 * valor;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}
}