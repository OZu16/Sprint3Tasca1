package id.itAcademy.ParkingCommand;


public class App 
{
    public static void main( String[] args )
    {
    	
    	SuperAction sa = new SuperAction();
    	
    	sa.addAction(new StartUp());
    	sa.addAction(new SpeedUp());
    	sa.addAction(new Curb());
    	
    	ActionManager am = new ActionManager();
    	
    	Vehicle v1 = new Vehicle("cotxe");
    	Vehicle v2 = new Vehicle("bicicleta");
    	Vehicle v3 = new Vehicle("avió");
    	Vehicle v4 = new Vehicle("vaixell");

    	am.execute(sa, v1);
    	am.execute(sa, v2);
    	am.execute(sa, v3);
    	am.execute(sa, v4);

    }
}
