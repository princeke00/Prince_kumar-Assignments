package first;

public class Costomer {
	private String costomerName;
	private int costomerId;
	private long costomerContact;
	private Address address;
	public String getCostomerName() {
		return costomerName;
	}
	public void setCostomerName(String costomerName) {
		this.costomerName = costomerName;
	}
	public int getCostomerId() {
		return costomerId;
	}
	public void setCostomerId(int costomerId) {
		this.costomerId = costomerId;
	}
	public double getCostomerContact() {
		return costomerContact;
	}
	public void setCostomerContact(long costomerContact) {
		this.costomerContact = costomerContact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Costomer [costomerName=" + costomerName + ", costomerId=" + costomerId + 
				", costomerContact=" + costomerContact + ", address=" + address + "]";
	}

	
	

}
