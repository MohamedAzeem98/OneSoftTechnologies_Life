package revision;

class StationaryProduct {
	String brand;
	int price;
	
	public String findMaximum(int price) {
		if(price>=20) {
			return "Good";
		}
		else {
			return "Bad";
		}
	}

}
