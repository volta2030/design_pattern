package facade;

public class DisplayFacade {
	public DisplayFormat shortVersion;
	public DisplayFormat longVersion;
	
	public DisplayFacade() {
		shortVersion = new DisplayShort();
		longVersion = new DisplayLong();
	}
	
}
