package ch11_1;

class cardTest{
	
	String kind;
	int number;
	
	cardTest(){
		this("SPADE", 1);
	}
	
	cardTest(String kind, int number){
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "cardTest [kind=" + kind + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		result = prime * result + number;
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
		cardTest other = (cardTest) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		if (number != other.number)
			return false;
		return true;
	}		
}

public class Card {
	public static void main(String[] args) {
		cardTest c1 = new cardTest();
		cardTest c2 = new cardTest();
		cardTest c3 = new cardTest();
		
		System.out.println(c1.toString());
		
		c2.kind = "DIAMOND";
		c2.number = 2;
		System.out.println(c2.toString());
	
		System.out.println(c3.toString());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
}
