package id.itAcademy.ParkingCommand;

public class Curb implements VehicleAction{

	@Override
	public void execute(Vehicle vehicle) {
		System.out.println(vehicle.getVehicleType() + " esta frenant!");		
	}

}
