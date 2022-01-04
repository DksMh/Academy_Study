package day14_HomeWorkWithT;

public class Location {
	private String city;
	private int lat;
	private int lon;
	
	public Location() {
		this("",0,0);
	}
	public Location(String city, int lat, int lon) {
		this.city =city;
		this.lat = lat;
		this.lon = lon;
	}
	public String toString() {
		return city + " " + lat + " " + lon;
	}
	public String getCity() {
		return city;
	}
	public int getLat() {
		return lat;
	}
	public int getLon() {
		return lon;
	}
	
}
