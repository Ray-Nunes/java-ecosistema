package ecosistema;

public class Coordenada  {
	private double latitude;
	private double longitude;
	
	public Coordenada (double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public void setLatitude(double Latitude) {
		this.latitude = Latitude;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	public void setLongitude(double Longitude) {
		this.longitude = Longitude;
	}
	
	public double getLongitude() {
		return this.longitude;
	}
}
