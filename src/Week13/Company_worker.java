package Week13;

public class Company_worker extends Worker {
	
	String company_name;
	public Company_worker(int y, String n) {
		working_year = y;
		this.company_name = n;
	}
	public static void main(String[] args) {
		Company_worker c = new Company_worker(5, "삼성");

	}

}
