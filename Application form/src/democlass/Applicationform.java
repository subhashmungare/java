package democlass;

public class Applicationform {

	public static void main(String[] args) {
		String UserName = "subhash";
		int password = 123456;
		if (UserName == "subhash" && password == 123456) {
			System.out.println("WELCOME TO MY WEBSITE");
		} else if (UserName == "yogesh" && password == 123345) {
			System.out.println("WELCOME TO YOGESH WEBSITE");
		} else {
			System.out.println("Invalid Username and Password");
		}

	}

}
