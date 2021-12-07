

public class Moto implements Vehiculo{
	private int velocidad=0;
	private final int plazas = 2;
	public Moto() {
		velocidad=50;
	}

	@Override
	public void acelerar(int aceleron) {
		// TODO Auto-generated method stub
		velocidad= velocidad + aceleron;
		if(velocidad>Vehiculo.velocidad_maxima)System.out.println("La moto ha superado la velocidad máxima");
	}

	@Override
	public void frenar(int frenazo) {
		// TODO Auto-generated method stub
		velocidad= velocidad - frenazo;
		if(velocidad<0) {
			velocidad=0;// no hay velocidad negativa.
			System.out.println("la moto se ha detenido");
		}
	}

	@Override
	public String plazas() {
		// TODO Auto-generated method stub
		String nroPlazas="El número de plazas de la moto es: "+plazas;
		return nroPlazas;
	}

	
}
