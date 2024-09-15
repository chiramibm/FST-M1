package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
    
	public Plane(int maxPassengers)
	{ 
		this.maxPassengers=maxPassengers;
		passengers=new ArrayList<>();
	}
	public void onboard(String s)
	{
		passengers.add(s);
	}
	public Date takeOff()
	{
		return new Date();
	}
    public void land()
    {
    	
		lastTimeLanded= new Date();
		passengers.clear();
    }
    public Date getLastTimeLanded()
    {
    	return lastTimeLanded;
    }
    
    public List<String> getPassesngers()
    {
		return passengers;
    	
    }
}
