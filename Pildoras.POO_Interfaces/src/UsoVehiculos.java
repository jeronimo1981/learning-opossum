

public class UsoVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo misVehiculos[]= new Vehiculo[4];
		misVehiculos[0]=new Coche();
		misVehiculos[1]=new Coche();
		misVehiculos[2]=new Moto();
		misVehiculos[3]=new Moto();
		
		misVehiculos[0].acelerar(71);
		misVehiculos[3].frenar(51);
		misVehiculos[2].frenar(50);
		System.out.println(misVehiculos[1].plazas());
		
		
	}

}
