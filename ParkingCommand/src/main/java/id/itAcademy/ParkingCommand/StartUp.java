package id.itAcademy.ParkingCommand;

public class StartUp implements VehicleAction{

	@Override
	public void execute(Vehicle vehicle) {
		System.out.println(vehicle.getVehicleType() + " esta arrancant!");
	}

}
