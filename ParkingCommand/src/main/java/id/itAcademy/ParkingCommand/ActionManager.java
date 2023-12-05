package id.itAcademy.ParkingCommand;

public class ActionManager {
	
	public void execute(VehicleAction action, Vehicle p) {
		
		action.execute(p);	
	}

}
