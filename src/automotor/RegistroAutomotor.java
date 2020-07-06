package automotor;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

	//El guardarse parcialmente variables que puedo estar obteniendo desde otro objeto pasado por parametro es innecesario.
	//	LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();	
	//	Boolean esVehiculoPolicial = vehiculo.esVehiculoPolicial();
	//	String ciudadRadicacion = vehiculo.ciudadRadicacion();
		
		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// sólo realizan vtv los vehículos con más de 1 anio de antiguedad y radicados en 'Buenos Aires'
		return (!vehiculo.esVehiculoPolicial() && 
				fecha.minusYears(1).isAfter(vehiculo.getFechaFabricacion()) && 
				vehiculo.ciudadRadicacion().equalsIgnoreCase("Buenos Aires"));
	}
}
