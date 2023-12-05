package id.itAcademy.ParkingCommand;

public class SpeedUp implements VehicleAction{

	@Override
	public void execute(Vehicle vehicle) {
		System.out.println(vehicle.getVehicleType() + " esta accelerant!");		
	}

}
