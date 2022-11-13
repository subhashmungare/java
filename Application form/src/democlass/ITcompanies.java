package democlass;

public class ITcompanies {

	public static void main(String[] args) {
		String company = "TCS";
		if (company == "TCS" || company == "capgemini" || company == "cognizant" || company == "wipro") {
			System.out.println(company + " is a good IT company");

		} else if (company == "audi" || company == "TECH MAHINDRA" || company == "Zydus") {

			System.out.println(company + " is not a IT based company");

		}

		else {
			System.out.println(company + " is a not good  company");
		}

	}

}
