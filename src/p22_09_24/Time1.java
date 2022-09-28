package p22_09_24;

public class Time1 {
	private int hour;
	private int minute;
	private float second;
	
	public void setHour(int h) {
		if( h <0 || h >23) {return;
		} else {
		hour = h;}
	}	
	
	public int getHour() {
		return hour;
	}

	
}
