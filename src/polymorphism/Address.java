package polymorphism;

public class Address {
	private String flatno,soci,area;
	private Integer pincode;
	public Address(String flatno, String soci, String area, Integer pincode) {
//		super();
		this.flatno = flatno;
		this.soci = soci;
		this.area = area;
		this.pincode = pincode;
	}
	public String getFlatno() {
		return flatno;
	}
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	public String getSoci() {
		return soci;
	}
	public void setSoci(String soci) {
		this.soci = soci;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", soci=" + soci + ", area=" + area + ", pincode=" + pincode + "]";
	}
	
	
	

}
