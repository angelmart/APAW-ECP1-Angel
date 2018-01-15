package entities;

public class Mobile {
	
	private String type;
	private long number;
	
	public Mobile( String type, long number ) {
		this.type = type;
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Mobile [type=" + type + ", number=" + number + "]";
	}


}
