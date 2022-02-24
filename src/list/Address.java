package list;

public class Address {

	private String country;
	private int wardno;
	public Address(String country, int wardno) {
		super();
		this.country = country;
		this.wardno = wardno;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getWardno() {
		return wardno;
	}
	public void setWardno(int wardno) {
		this.wardno = wardno;
	}
}
