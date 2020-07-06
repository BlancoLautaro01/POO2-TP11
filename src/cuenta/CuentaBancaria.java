package cuenta;

public abstract class CuentaBancaria {
	
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	//Esta funcion hace lo mismo en cada hijo, por lo que es mejor definir en ellos la condicion y hacer los pasos aca. (Repeticion de codigo)
	public void extraer(Integer monto) {
		if (this.condicion(monto)) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extraccion", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}
	
	public abstract boolean condicion(Integer monto);
}
