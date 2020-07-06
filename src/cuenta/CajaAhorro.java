package cuenta;

public class CajaAhorro extends CuentaBancaria {

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	public boolean condicion(Integer monto) {
		return (this.saldo >= monto);
	}

}
