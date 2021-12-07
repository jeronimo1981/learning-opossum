

public class Coche implements Vehiculo{
	private int velocidad;
	private final int plazas=5;
	public Coche() {
		velocidad=50;
		
	}

	@Override
	public void acelerar(int aceleron) {
		// TODO Auto-generated method stub
		velocidad= velocidad + aceleron;
		if(velocidad>Vehiculo.velocidad_maxima)System.out.println("El coche ha superado la velocidad máxima");
	}

	@Override
	public void frenar(int frenazo) {
		// TODO Auto-generated method stub
		velocidad= velocidad - frenazo;
		if(velocidad<0) {
			velocidad=0;// no hay velocidad negativa.
			System.out.println("El coche está detenido");
		}
		
	}

	@Override
	public String plazas() {
		// TODO Auto-generated method stub
		String nroPlazas="El número de plazas del coche es: "+plazas;
		return nroPlazas;
	}

}
