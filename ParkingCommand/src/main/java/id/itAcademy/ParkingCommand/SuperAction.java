package id.itAcademy.ParkingCommand;

import java.util.ArrayList;
import java.util.List;

public class SuperAction implements VehicleAction {

	private List<VehicleAction> list = new ArrayList<VehicleAction>();
	
	public void addAction(VehicleAction action) {
		
		list.add(action);
	}
	
	
	@Override
	public void execute(Vehicle vehicle) {

		list.forEach(action -> action.execute(vehicle));
	}

}
