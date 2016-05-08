package String;

public class myO {
	private int i;
	
	public myO() {
		super();
	}
	public myO(int a) {
		i =  a;
	}
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myO other = (myO) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	

}
