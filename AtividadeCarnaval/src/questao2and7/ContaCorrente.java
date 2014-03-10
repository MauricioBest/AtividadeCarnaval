package questao2and7;

public class ContaCorrente {

	protected double saldo = 0;

	public void depositar(double valor) throws ValorNegativoException{
		if (valor<0) {
			throw new ValorNegativoException();
		} else {
			saldo += valor;
		}
		
	}

	public void sacar (double valor) throws ValorInsuficienteException,ValorNegativoException{
		if (saldo < valor) {
			throw new ValorInsuficienteException();
		} else if (valor<0) {
			throw new ValorNegativoException();
		}else {
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