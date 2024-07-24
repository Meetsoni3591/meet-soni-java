package constructor_inheritance;

public class City extends State {
	private String city;

	public City() {
		super();
		this.city = "ahmedabad";
	}
	
	public City(String city, String state) {
		super(state);
		this.city = city;
	}

	@Override
	public String toString() {
		return  city + super.toString() ;
	}
	
}
